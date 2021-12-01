package reports;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;

public class HtmlLog {

    private static final String LOG_FORMAT = "%s. %s";
    private static final ThreadLocal<Integer> STEP_LOG_IDX = new ThreadLocal<>();

    private static int getStepIdx() {
        if (STEP_LOG_IDX.get() == null) {
            STEP_LOG_IDX.set(1);
        }
        return STEP_LOG_IDX.get();
    }

    public static void stepInfo(String message) {
        int currentIndex = getStepIdx();
        String indexWithMessage = String.format(LOG_FORMAT, currentIndex, message);
        STEP_LOG_IDX.set(currentIndex + 1);
        GlobalVariable.getLogger().log(Status.INFO, indexWithMessage);
    }
}
