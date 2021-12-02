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
    private By allButton = By.xpath("//button[@type='button' and @class='btn dropdown-toggle btn-none']");
    private By spicesButton = By.xpath("//div[@class=\"dropdown b-dropdown show btn-group\"]/ul/li[5]/a");
    private By vegetableButton = By.xpath("//div[@class=\"dropdown b-dropdown show btn-group\"]/ul/li[2]/a");
    private By foodButton = By.xpath("//div[@class=\"dropdown b-dropdown show btn-group\"]/ul/li[8]/a");
    private By fruitsButton = By.xpath("//div[@class=\"dropdown b-dropdown show btn-group\"]/ul/li[3]/a");
    private By avatarButton = By.xpath("//button[@class=\"btn dropdown-toggle btn-secondary\"]/span/img");
    private By accInformationButton = By.xpath("//div[@class=\"dropdown b-dropdown utils-box-item sign-in show btn-group\"]/ul/li/a[@href=\"/account-info\"]");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private By buyNowButton = By.xpath("//a[@href=\"/san-pham/thuc-pham-bao-ve-suc-khoe-mega-detox-lo-30-vien-nang\"]/div/div/div/button[contains(.,'Mua ngay')]");

    public void clickRegister(){
        waitForElementAppear(GlobalVariable.getDriver(),confirm);
        GlobalVariable.getDriver().findElement(confirm).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),confirm);
        GlobalVariable.getDriver().findElement(createAccount).click();
        waitForElementAppear(GlobalVariable.getDriver(),fieldFullName);
    }

    public void clickCart(){
        waitForElementDisAppear(GlobalVariable.getDriver(),imageSlide);
        GlobalVariable.getDriver().findElement(cartButton).click();
    }

    public void clickLogin(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(confirm).click();
        GlobalVariable.getDriver().findElement(loginButton).click();
    }

    public void clickBuyButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),imageSlide);
        GlobalVariable.getDriver().findElement(buyButton).click();
    }

    public void clickAllButton(){
        waitForElementAppear(GlobalVariable.getDriver(),allButton);
        GlobalVariable.getDriver().findElement(allButton).click();
        GlobalVariable.getDriver().findElement(spicesButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),allButton);
        GlobalVariable.getDriver().findElement(allButton).click();
        GlobalVariable.getDriver().findElement(vegetableButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),allButton);
        GlobalVariable.getDriver().findElement(allButton).click();
        GlobalVariable.getDriver().findElement(foodButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),allButton);
        GlobalVariable.getDriver().findElement(allButton).click();
        GlobalVariable.getDriver().findElement(fruitsButton).click();
    }

    public void clickAvatarButton(){
        GlobalVariable.getDriver().findElement(avatarButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),accInformationButton);
        GlobalVariable.getDriver().findElement(accInformationButton).click();
    }

    public void clickBuyNowButton(){
        waitForElementAppear(GlobalVariable.getDriver(),buyButton);
        GlobalVariable.getDriver().findElement(buyNowButton).click();
    }

}
