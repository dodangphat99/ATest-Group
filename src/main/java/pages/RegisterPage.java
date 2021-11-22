package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private By fieldFullName = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[1]/input");
    private By fieldPhoneNumber = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[2]/input");
    private By fieldEmail = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[3]/input");
    private By fieldNewPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[5]/input");
    private By fieldConfirmPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[6]/input");
    private By confirmAcceptButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[7]/label/span[1]");
    private By createAccountButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[8]/div/button");

    public void register(){
        JsonHelper jh = new JsonHelper();
        jh.JsonUser();
        driver.findElement(fieldFullName).sendKeys(jh.getUsers().get(0).getFullName());
        driver.findElement(fieldPhoneNumber).sendKeys(jh.getUsers().get(0).getPhoneNumber());
        driver.findElement(fieldEmail).sendKeys(jh.getUsers().get(0).getEmail());
        driver.findElement(fieldNewPassword).sendKeys(jh.getUsers().get(0).getNewPassword());
        driver.findElement(fieldConfirmPassword).sendKeys(jh.getUsers().get(0).getConfirmPassword());
        driver.findElement(confirmAcceptButton).click();
        driver.findElement(createAccountButton).click();
        ExtentTest logger = extent.createTest("RegisterTest");
        logger.log(Status.INFO,"Register Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/register")){
            logger.log(Status.PASS,"Register Successfully");
        } else {
            logger.log(Status.FAIL,"Register Failed");
        }
//        driver.quit();
    }



//    @BeforeTest
//    public static void close(){
//        System.out.println("Already Test");
//    }
//
//    @Test
//    void LoginTestCase(){
//        System.out.println("Login successful");
//    }
//
//    @AfterTest
//    void setup(){
//        System.out.println("Close Setup");
//    }
}
