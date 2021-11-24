package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a/div/div/div[3]/button[1]");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private By cartButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[2]/a");

    public void clickBuyProduct(){
        driver.findElement(productButton).click();
        logger.log(Status.INFO,"Buy Product Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/tim-kiem?q=bot%20giat")){
            logger.log(Status.PASS,"Buy Product Successfully");
        } else {
            logger.log(Status.FAIL,"Buy Product Failed");
        }
    }

    public void clickCartButton(){
        waitForElementDisAppear(driver,spinner);
        driver.findElement(cartButton).click();
        logger.log(Status.INFO,"Cart Button Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/cart")){
            logger.log(Status.PASS,"Cart Button Successfully");
        } else {
            logger.log(Status.FAIL,"Cart Button Failed");
        }
    }
}
