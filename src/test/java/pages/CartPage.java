package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
import lombok.experimental.UtilityClass;
import models.User;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class CartPage extends BasePage {
    private By keepBuyingButton = By.xpath("//div[@class=\"text-right\"]/button");
    private By deleteButton = By.xpath("//div[@class=\"text-right\"]/button[@class='btn btn-outline-danger']");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    //    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");
    private By paymentButton = By.xpath("//div[@class='row']/div[2]/div/div/button[@class='btn btn-primary w-100 mt-4']");
    //private By paymentButton = By.xpath("//button[contains(.,' THANH TOÁN ')]");
    private By backButton = By.xpath("//div[@class='mt-5 d-flex']/a");
//    private By modal = By.xpath("//div[@id='vueConfirm']/div/span/p");
    private By acceptButton = By.xpath("//div[@id='vueConfirm']/div/div/button[@class='vc-btn']");
//    private By selectPaymentButton = By.xpath("//label[@class=\"checkbox\"]/input[@value='1']");
    private By cityButton = By.xpath("//div[@class=\"customer-info-box col-lg-5\"]/div[2]/div[3]/div[@class='col']/div/button");
    private By selectCity = By.xpath("//div[@class=\"dropdown b-dropdown dropdown-custom dropdown-form form-control show btn-group\"]/ul/li[1]/a");
    private By districtButton = By.xpath("//div[@class=\"customer-info-box col-lg-5\"]/div[2]/div[4]/div[@class='col']/div/button");
    private By selectDistrict = By.xpath("//div[@class=\"dropdown b-dropdown dropdown-custom dropdown-form form-control show btn-group\"]/ul/li[1]/a");
    private By wardButton = By.xpath("//div[@class=\"customer-info-box col-lg-5\"]/div[2]/div[5]/div[@class='col']/div/button");
    private By selectWard = By.xpath("//div[@class=\"dropdown b-dropdown dropdown-custom dropdown-form form-control show btn-group\"]/ul/li[1]/a");
    private By inputAddress = By.xpath("//div[@class=\"customer-info-box col-lg-5\"]/div[2]/div[6]/div[@class='col']/input");
    private By orderButton = By.xpath("//div[@class=\"mt-5 d-flex\"]/button");
    private By payMoreButton = By.xpath("//label/a[@href=\"/fumart-wallet?type=wl1\"]");

    public void clickKeepBuyProduct(){
        waitForElementAppear(GlobalVariable.getDriver(), keepBuyingButton);
        GlobalVariable.getDriver().findElement(keepBuyingButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),keepBuyingButton);
    }

    public void clickContinueBuyButton(){
        GlobalVariable.getDriver().findElement(keepBuyingButton).click();
    }

    public void clickPaymentButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(paymentButton).click();
    }

    public void clickBackButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(backButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),backButton);
    }

    public void clickDeleteAllProducts(){
//        waitForElementAppear(GlobalVariable.getDriver(),deleteButton);
        GlobalVariable.getDriver().findElement(deleteButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),acceptButton);
        GlobalVariable.getDriver().findElement(acceptButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
    }

    public void selectPaymentButton(User user){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
//        GlobalVariable.getDriver().findElement(selectPaymentButton).click();
        GlobalVariable.getDriver().findElement(cityButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectCity);
        GlobalVariable.getDriver().findElement(selectCity).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(districtButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectDistrict);
        GlobalVariable.getDriver().findElement(selectDistrict).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(wardButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectWard);
        GlobalVariable.getDriver().findElement(selectWard).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(inputAddress).sendKeys(user.getAddress());
        GlobalVariable.getDriver().findElement(orderButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),payMoreButton);
        GlobalVariable.getDriver().findElement(payMoreButton).click();


    }
}
