package commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalVariable {
    private static ThreadLocal<ExtentTest> logger = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static ExtentTest getLogger() {
        return logger.get();
    }

    public static void setLogger(ExtentTest test) {
        logger.set(test);
    }

    @Getter
    @Setter
    private static ExtentReports extent;

    @Getter
    @Setter
    private static ExtentHtmlReporter reporter;

    @Getter
    @Setter
    private static String testDataType;
}
