package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
import lombok.experimental.UtilityClass;
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
    private By backButton = By.xpath("//div[@class='mt-5 d-flex']/a");
//    private By modal = By.xpath("//div[@id='vueConfirm']/div/span/p");
    private By acceptButton = By.xpath("//div[@id='vueConfirm']/div/div/button[@class='vc-btn']");

    public void clickKeepBuyProduct(){
        waitForElementAppear(GlobalVariable.getDriver(), keepBuyingButton);
        GlobalVariable.getDriver().findElement(keepBuyingButton).click();
    }

    public void clickContinueBuyButton(){
        GlobalVariable.getDriver().findElement(keepBuyingButton).click();
    }

    public void clickPaymentButton(){
        GlobalVariable.getDriver().findElement(paymentButton).click();
    }

    public void clickBackButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(backButton).click();
    }

    public void clickDeleteAllProducts(){
//        waitForElementAppear(GlobalVariable.getDriver(),deleteButton);
        GlobalVariable.getDriver().findElement(deleteButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),acceptButton);
        GlobalVariable.getDriver().findElement(acceptButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
    }
}
