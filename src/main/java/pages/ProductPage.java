package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a/div/div/div[3]/button[1]");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private By cartButton = By.xpath("//div/a[@class and @href='/cart']");

    public void clickBuyProduct(){
        driver.findElement(productButton).click();
        waitForElementDisAppear(driver,productButton);
    }

    public void clickCartButton(){
        waitForElementDisAppear(driver,spinner);
        driver.findElement(cartButton).click();
    }
}
