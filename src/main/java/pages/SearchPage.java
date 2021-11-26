package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import models.User;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {
    private By fieldSearch = By.xpath("//div[@class=\"flex-fill\"]/div[2]/div[1]/input");
    private By searchButton = By.xpath("//button[@class=\"btn btn-primary btn-search\" and @type='button']");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");

    public void search(User user){
        waitForElementDisAppear(driver,spinner);
        driver.findElement(fieldSearch).sendKeys(user.getSearch());
        driver.findElement(searchButton).click();
    }
}
