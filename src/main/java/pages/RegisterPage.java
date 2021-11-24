package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import models.User;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private By fieldFullName = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[1]/input");
    private By fieldPhoneNumber = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[2]/input");
    private By fieldEmail = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[3]/input");
    private By fieldNewPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[5]/input");
    private By fieldConfirmPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[6]/input");
    private By confirmAcceptButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[7]/label/span[1]");
    private By createAccountButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[8]/div/button");

    public void register(User user){
        driver.findElement(fieldFullName).sendKeys(user.getFullName());
        driver.findElement(fieldPhoneNumber).sendKeys(user.getPhoneNumber());
        driver.findElement(fieldEmail).sendKeys(user.getEmail());
        driver.findElement(fieldNewPassword).sendKeys(user.getNewPassword());
        driver.findElement(fieldConfirmPassword).sendKeys(user.getConfirmPassword());
        driver.findElement(confirmAcceptButton).click();
        driver.findElement(createAccountButton).click();
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
