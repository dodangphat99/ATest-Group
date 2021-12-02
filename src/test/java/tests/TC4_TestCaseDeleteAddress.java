package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

public class TC4_TestCaseDeleteAddress extends BaseTest{
    private static HomePage hp = new HomePage();
    private static LoginPage lp = new LoginPage();
    private static JsonHelper jh = new JsonHelper();
    private static AccountInformationPage ap = new AccountInformationPage();

    @Test
    public void testCaseDeleteAddress() {
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        HtmlLog.stepInfo("Account Information Button Test");
        hp.clickAvatarButton();
        HtmlLog.stepInfo("Account Information Page Test");
        ap.clickAddressButton(getTestUserAddress());
    }

    private static User getTestUserLogin(){
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(3).getUserName());
        user.setPassword(jh.getUsers().get(3).getPassword());
        return user;
    }

    private static User getTestUserAddress(){
        User user = new User();
        jh.JsonUser();
        user.setAddress(jh.getUsers().get(3).getAddress());
        return user;
    }
}
