package reports;

public class Reporter {
    private static final String VERIFY_MESSAGE_FORMAT = "<em>&emsp;&emsp;+";

    private static String formatVerifyMessage(final String message){
        return String.format(VERIFY_MESSAGE_FORMAT,message);
    }
}
