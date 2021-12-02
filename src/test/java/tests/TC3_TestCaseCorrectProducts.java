package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

public class TC3_TestCaseCorrectProducts extends BaseTest {

    private static HomePage hp = new HomePage();
    private static LoginPage lp = new LoginPage();
    private static SearchPage sp = new SearchPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void testCaseCorrectProducts() {
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        HtmlLog.stepInfo("All Button Test");
        hp.clickAllButton();
        HtmlLog.stepInfo("Search Test");
        sp.search(getTestUserSearch());
        HtmlLog.stepInfo("Filter Test");
        sp.clickFilterButton();
    }

    private static User getTestUserLogin() {
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(2).getUserName());
        user.setPassword(jh.getUsers().get(2).getPassword());
        return user;
    }

    private static User getTestUserSearch() {
        jh.JsonUser();
        User user = new User();
        user.setSearch(jh.getUsers().get(2).getSearch());
        return user;
    }
}
