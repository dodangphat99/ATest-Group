package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
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
    private By fieldFullName = By.xpath("//div[@class=\"bg-login\"]/div[1]/input");

    public void clickRegister(){
        waitForElementAppear(GlobalVariable.getDriver(),confirm);
        GlobalVariable.getDriver().findElement(confirm).click();
        GlobalVariable.getDriver().findElement(createAccount).click();
        waitForElementAppear(GlobalVariable.getDriver(),fieldFullName);
    }

    public void clickCart(){
        waitForElementDisAppear(GlobalVariable.getDriver(),imageSlide);
        GlobalVariable.getDriver().findElement(cartButton).click();
    }

    public void clickLogin(){
        GlobalVariable.getDriver().findElement(confirm).click();
        GlobalVariable.getDriver().findElement(loginButton).click();
    }

    public void clickBuyButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),imageSlide);
        GlobalVariable.getDriver().findElement(buyButton).click();
    }

}
