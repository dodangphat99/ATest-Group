package helpers;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;

import java.io.IOException;

public class ReportHelper {
    public static void logFail(String fail) {
        GlobalVariable.getLogger().log(Status.FAIL,fail);
    }
}
