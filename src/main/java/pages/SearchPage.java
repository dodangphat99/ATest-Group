package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import models.User;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {
    private By fieldSearch = By.xpath("//*[@id=\"__BVID__13\"]");
    private By searchButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[1]/div[2]/button");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");

    public void search(User user){
        waitForElementDisAppear(driver,spinner);
        driver.findElement(fieldSearch).sendKeys(user.getSearch());
        driver.findElement(searchButton).click();
        logger.log(Status.INFO,"Search Test");
        if(driver.getCurrentUrl().equals("https://fumart.vn/tim-kiem?q=bot%20giat")){
            logger.log(Status.PASS,"Search Successfully");
        } else {
            logger.log(Status.FAIL,"Search Failed");
        }
    }
}
