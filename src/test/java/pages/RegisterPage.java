package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
import helpers.JsonHelper;
import models.User;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    //*[@id="main-layout"]/section/div[2]/div/div/div/form/div/div[1]/input
    private By fieldFullName = By.xpath("//div[@class=\"bg-login\"]/div[1]/input");
    private By fieldPhoneNumber = By.xpath("//div[@class=\"bg-login\"]/div[2]/input");
    private By fieldEmail = By.xpath("//div[@class=\"bg-login\"]/div[3]/input");
    private By fieldNewPassword = By.xpath("//div[@class=\"bg-login\"]/div[5]/input");
    private By fieldConfirmPassword = By.xpath("//div[@class=\"bg-login\"]/div[6]/input");
    private By confirmAcceptButton = By.xpath("//span[@class='checkmark']");
    private By createAccountButton = By.xpath("//button[@class='btn btn-primary d-block' and @type='submit']");

    public void register(User user){
        GlobalVariable.getDriver().findElement(fieldFullName).sendKeys(user.getFullName());
        GlobalVariable.getDriver().findElement(fieldPhoneNumber).sendKeys(user.getPhoneNumber());
        GlobalVariable.getDriver().findElement(fieldEmail).sendKeys(user.getEmail());
        GlobalVariable.getDriver().findElement(fieldNewPassword).sendKeys(user.getNewPassword());
        GlobalVariable.getDriver().findElement(fieldConfirmPassword).sendKeys(user.getConfirmPassword());
        GlobalVariable.getDriver().findElement(confirmAcceptButton).click();
        GlobalVariable.getDriver().findElement(createAccountButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),createAccountButton);
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
