package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.DriverHelper;
import helpers.JsonHelper;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a/div/div/div[3]/button[1]");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private By cartButton = By.xpath("//div/a[@class and @href='/cart']");
    private By buyFirstProduct = By.xpath("//div[@class='row product-results']/div[1]/a/div/div/div[3]/button[2]");
    private By buySecondProduct = By.xpath("//div[@class='row product-results']/div[2]/a/div/div/div[3]/button[2]");
    private By buyThirdProduct = By.xpath("//div[@class='row product-results']/div[3]/a/div/div/div[3]/button[2]");
    private By buyFourProduct = By.xpath("//div[@class='row product-results']/div[4]/a/div/div/div[3]/button[2]");
    private By buyFiveProduct = By.xpath("//div[@class='row product-results']/div[5]/a/div/div/div[3]/button[2]");
    private By alert = By.xpath("//div[@class='v-toast v-toast--bottom']/div/p[@class='v-toast__text']");

    public void clickBuyProduct(){
        GlobalVariable.getDriver().findElement(productButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),productButton);
    }

    public void clickCartButton(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(cartButton).click();
    }

    public void clickBuyManyProduct(){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(buyFirstProduct).click();
        waitForElementAppear(GlobalVariable.getDriver(),alert);
        waitForElementDisAppear(GlobalVariable.getDriver(),alert);
        GlobalVariable.getDriver().findElement(buySecondProduct).click();
        waitForElementAppear(GlobalVariable.getDriver(),alert);
        waitForElementDisAppear(GlobalVariable.getDriver(),alert);
        GlobalVariable.getDriver().findElement(buyThirdProduct).click();
        waitForElementAppear(GlobalVariable.getDriver(),alert);
        waitForElementDisAppear(GlobalVariable.getDriver(),alert);
        GlobalVariable.getDriver().findElement(buyFourProduct).click();
        waitForElementAppear(GlobalVariable.getDriver(),alert);
        waitForElementDisAppear(GlobalVariable.getDriver(),alert);
        GlobalVariable.getDriver().findElement(buyFiveProduct).click();
        waitForElementAppear(GlobalVariable.getDriver(),alert);
        waitForElementDisAppear(GlobalVariable.getDriver(),alert);
    }

}
