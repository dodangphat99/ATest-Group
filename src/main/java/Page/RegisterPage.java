package Page;

import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    public void runRegister(User user){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://fumart.vn/");
        //btn btn-white btn-select-place
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='select-store-modal___BV_modal_body_']/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id='app-wrapper']/header/div[1]/div/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[1]/input")).sendKeys(user.getHoten());
        driver.findElement(By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[7]/label/span[1]")).click();
        driver.findElement(By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[8]/div/button")).click();
//        driver.quit();
    }
}
