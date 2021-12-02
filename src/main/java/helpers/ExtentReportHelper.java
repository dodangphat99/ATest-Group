package helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import commons.GlobalVariable;
import org.testng.ITestContext;

public class ExtentReportHelper {
    public static void setUp(ITestContext context) {
        GlobalVariable.setReporter(new ExtentHtmlReporter("C:\\Users\\PC\\IdeaProjects\\Test\\Reports\\reportaaaa.html"));
        GlobalVariable.setExtent(new ExtentReports());
        GlobalVariable.getExtent().attachReporter(GlobalVariable.getReporter());
    }
}
