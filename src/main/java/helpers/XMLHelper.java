package helpers;

import commons.GlobalVariable;
import org.testng.ITestContext;

public class XMLHelper {
    public static void getTestDataType(ITestContext context) {
        String value = context.getCurrentXmlTest().getParameter("environment");
        GlobalVariable.setTestDataType(value);
    }
}
