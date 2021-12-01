package reports;

import commons.GlobalVariable;
import helpers.DriverHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCamera {

    public static String captureScreen(){
        TakesScreenshot ts = (TakesScreenshot) GlobalVariable.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destination = "C:\\Users\\PC\\IdeaProjects\\Test\\Reports\\"+getCurrentDateAndTime()+".png";
        File finalDestination = new File(destination);

        try{
            FileUtils.copyFile(src,finalDestination);
        } catch (IOException e){
            System.out.print("Capture Failed "+e.getMessage());
        }

        return destination.substring(38);
    }

    public static String getCurrentDateAndTime(){
        String str = null;
        try{
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str= dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
        }
        catch(Exception e){

        }
        return str;
    }
}
