package reports;

public class AbstractAssertion {
    public static final String FAIL_MESSAGE_FORMAT = "<br>&emsp;&emsp;&emsp;&emsp;Expected Result: %s<br/>" + "&emsp;&emsp;&emsp;&emsp;Actual Result: %s<br/>";

    public static String formatFailMessage(final String expected, final String actual){
        return String.format(FAIL_MESSAGE_FORMAT,expected,actual);
    }
}
