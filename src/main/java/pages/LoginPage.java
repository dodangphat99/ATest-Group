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
    private By fieldUserName = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[1]/input");
    private By fieldPassword = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[3]/button");

    public void login(User user){
        driver.findElement(fieldUserName).sendKeys(user.getUserName());
        driver.findElement(fieldPassword).sendKeys(user.getPassword());
        driver.findElement(loginButton).click();
        logger.log(Status.INFO,"Login Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/login")){
            logger.log(Status.PASS,"Login Successfully");
        } else {
            logger.log(Status.FAIL,"Login Failed");
        }
    }
}
