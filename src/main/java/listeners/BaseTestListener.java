package listeners;

import commons.GlobalVariable;
import helpers.DriverHelper;
import helpers.ExtentReportHelper;
import helpers.ReportHelper;
import helpers.XMLHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.HtmlLog;
import reports.SoftAssertion;
import reports.TestCamera;

import java.io.IOException;

public class BaseTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " - Test Start");
        GlobalVariable.setLogger(GlobalVariable.getExtent().createTest(result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        HtmlLog.stepInfo("Test Case Finished.");
        GlobalVariable.getExtent().flush();
        GlobalVariable.getDriver().quit();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String failClickKeepBuyProduct=null;
        try {
            failClickKeepBuyProduct = "Failed" + SoftAssertion.formatFailMessage("abc","xyz")
                    +"&emsp;&emsp;&emsp;&emsp;"
                    +GlobalVariable.getLogger().addScreenCaptureFromPath(TestCamera.captureScreen());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReportHelper.logFail(failClickKeepBuyProduct);
        GlobalVariable.getDriver().quit();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName() + " - Test start");
        XMLHelper.getTestDataType(context);
        ExtentReportHelper.setUp(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName() + " - Test end.");
    }
}
