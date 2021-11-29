package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import helpers.JsonHelper;
import models.User;
import org.openqa.selenium.By;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LoginPage extends BasePage{
    private By fieldUserName = By.xpath("//div[@class=\"bg-login\"]/form/div[1]/input");
    private By fieldPassword = By.xpath("//div[@class=\"bg-login\"]/form/div[2]/input");
    private By loginButton = By.xpath("//button[@class='btn btn-primary block' and @type='submit']");

    public void login(User user){
        System.out.print(user);
        driver.findElement(fieldUserName).sendKeys(user.getUserName());
        driver.findElement(fieldPassword).sendKeys(user.getPassword());
        driver.findElement(loginButton).click();
        waitForElementDisAppear(driver,loginButton);
    }
}
