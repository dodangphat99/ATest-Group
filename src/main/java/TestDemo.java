import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.className("gLFyf"));
        search.sendKeys("w3school");
        search.sendKeys(Keys.ENTER);
        driver.quit();
    }
}
