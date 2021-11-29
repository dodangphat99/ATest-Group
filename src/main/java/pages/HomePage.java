package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    private By confirm = By.xpath("//button[@type='button' and @class='btn btn-primary']");
    private By createAccount = By.xpath("//a[@class='ml-3 text-light']");
    private By imageSlide = By.xpath("//*[@id=\"__BVID__180\"]/img");
    private By cartButton = By.xpath("//div[@class=\"flex-fill\"]/div[2]/div[2]/a[@href='/cart']");
    private By loginButton = By.xpath("//div[@class=\"flex-fill\"]/div[2]/div[2]/a[@href='/login']");
    private By buyButton = By.xpath("//ul/li[@class]/a[@href='/danh-muc/hang-khuyen-mai']");

    public void clickRegister(){
        driver.findElement(confirm).click();
        driver.findElement(createAccount).click();
    }

    public void clickCart(){
        waitForElementDisAppear(driver,imageSlide);
        driver.findElement(cartButton).click();
    }

    public void clickLogin(){
        driver.findElement(confirm).click();
        driver.findElement(loginButton).click();
    }

    public void clickBuyButton(){
        waitForElementDisAppear(driver,imageSlide);
        driver.findElement(buyButton).click();
    }

}
