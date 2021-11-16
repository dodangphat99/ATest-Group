package Page;

import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    private By confirm = By.xpath("//*[@id='select-store-modal___BV_modal_body_']/div/div/button");
    private By createAccount = By.xpath("//*[@id='app-wrapper']/header/div[1]/div/div/div/div[1]/a");
    private By fieldFullName = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[1]/input");
    private By fieldPhoneNumber = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[2]/input");
    private By fieldEmail = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[3]/input");
    private By fieldNewPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[5]/input");
    private By fieldConfirmPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[6]/input");
    private By confirmAcceptButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[7]/label/span[1]");
    private By createAccountButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[8]/div/button");
    private By fieldUserName = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[1]/input");
    private By fieldPassword = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[3]/button");
    private By cartButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[2]/a");
    private By keepBuyingButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div[2]/button");
    private By fieldSearch = By.xpath("//*[@id=\"__BVID__37\"]");
    private By searchButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[1]/div[2]/button");
    private By productButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a");
    private By buyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a");
    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");

    public void runRegister(User user){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://fumart.vn/");
        //btn btn-white btn-select-place
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(confirm).click();
        driver.findElement(createAccount).click();
        driver.findElement(fieldFullName).sendKeys(user.getFullName());
        driver.findElement(fieldPhoneNumber).sendKeys(user.getPhoneNumber());
        driver.findElement(fieldEmail).sendKeys(user.getEmail());
        driver.findElement(fieldNewPassword).sendKeys(user.getNewPassword());
        driver.findElement(fieldConfirmPassword).sendKeys(user.getConfirmPassword());
        driver.findElement(confirmAcceptButton).click();
        driver.findElement(createAccountButton).click();
        driver.findElement(fieldUserName).sendKeys(user.getUserName());
        driver.findElement(fieldPassword).sendKeys(user.getPassword());
        driver.findElement(loginButton).click();
        driver.findElement(cartButton).click();
        driver.findElement(keepBuyingButton).click();
        driver.findElement(fieldSearch).sendKeys(user.getSearch());
        driver.findElement(searchButton).click();
        driver.findElement(productButton).click();
        driver.findElement(buyButton).click();
        driver.findElement(continueBuyButton).click();
        driver.findElement(cartButton).click();
//        driver.quit();
    }
}
