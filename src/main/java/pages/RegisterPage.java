package pages;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constants.RegisterHelper;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterPage {
    RegisterHelper rh = new RegisterHelper();
    public void register(){
        List<User> users = null;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(rh.getLink()));
            users = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            users.forEach(System.out::println);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://fumart.vn/");
        //btn btn-white btn-select-place
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(rh.getConfirm()).click();
        driver.findElement(rh.getCreateAccount()).click();
        driver.findElement(rh.getFieldFullName()).sendKeys(users.get(0).getFullName());
        driver.findElement(rh.getFieldPhoneNumber()).sendKeys(users.get(0).getPhoneNumber());
        driver.findElement(rh.getFieldEmail()).sendKeys(users.get(0).getEmail());
        driver.findElement(rh.getFieldNewPassword()).sendKeys(users.get(0).getNewPassword());
        driver.findElement(rh.getFieldConfirmPassword()).sendKeys(users.get(0).getConfirmPassword());
        driver.findElement(rh.getConfirmAcceptButton()).click();
        driver.findElement(rh.getCreateAccountButton()).click();
        driver.findElement(rh.getFieldUserName()).sendKeys(users.get(0).getUserName());
        driver.findElement(rh.getFieldPassword()).sendKeys(users.get(0).getPassword());
        driver.findElement(rh.getLoginButton()).click();
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e){
//            System.out.print(e);
//        }
        waitForElementDisAppear(driver,rh.getImageSlide());
        driver.findElement(rh.getCartButton()).click();
        waitForElementAppear(driver,rh.getKeepBuyingButton());
        driver.findElement(rh.getKeepBuyingButton()).click();
        waitForElementDisAppear(driver,rh.getSpinner());
        driver.findElement(rh.getFieldSearch()).sendKeys(users.get(0).getSearch());
        driver.findElement(rh.getSearchButton()).click();
        driver.findElement(rh.getProductButton()).click();
        driver.findElement(rh.getContinueBuyButton()).click();
        waitForElementDisAppear(driver,rh.getSpinner());
        driver.findElement(rh.getCartButton()).click();
//        driver.quit();
    }

    public void waitForElementAppear(WebDriver drive, By cartButton){
        WebDriverWait webDriverWait = new WebDriverWait(drive,rh.getELEMENT_TIME_WAIT());
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
    }

    public void waitForElementDisAppear(WebDriver drive, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(drive,rh.getELEMENT_TIME_WAIT());
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(locator, 0));
    }

//    @BeforeTest
//    public static void close(){
//        System.out.println("Already Test");
//    }
//
//    @Test
//    void LoginTestCase(){
//        System.out.println("Login successful");
//    }
//
//    @AfterTest
//    void setup(){
//        System.out.println("Close Setup");
//    }
}
