package com.selenium.viamericas.tests;


import com.selenium.viamericas.pages.HomePage;
import com.selenium.viamericas.pages.LoginPage;
import com.selenium.viamericas.subpages.ProfileSettingsPage;
import com.selenium.viamericas.utility.Start;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProfileSettings {

    @BeforeClass
    public void start() throws Exception {
        Start.initiate("dev");
        HomePage.Goto("login");
        LoginPage.login("laura.alvarez@talosdigital.com", "Laura123");
        HomePage.Goto("myaccount");
    }

    @AfterClass
    public void finish() {
        Start.driver.quit();
    }

    @Test(enabled = true, priority = 0)

    public void gotoMyaccount() throws Exception {
        com.selenium.viamericas.pages.MyAccount.gotoaccountlabel();
        Assert.assertTrue(Start.driver.getCurrentUrl().contains("profile"));
    }

    @Test(enabled = true, priority = 2)

    public void ChangePassword() throws Exception {
        ProfileSettingsPage.gotochangepassword();
        ProfileSettingsPage.addthecurrentpassword();
        ProfileSettingsPage.clickoncontinuebutton();
        ProfileSettingsPage.addnewpassword();
        ProfileSettingsPage.addrepeatpassword();
        ProfileSettingsPage.clickoncontinuebutton();
        ProfileSettingsPage.gotoclosepopup();
        Assert.assertTrue(Start.driver.getCurrentUrl().contains("profile"));
    }

    @Test(enabled = true, priority = 1)

    public void EditProfileSettings() throws Exception {
        //ProfileSettingsPage.cleandropdowns();
        //ProfileSettingsPage.ProfileSettingsLabel();
        ProfileSettingsPage.changethefisrtname();
        ProfileSettingsPage.changetheLastNameField();
        ProfileSettingsPage.changetheMobilePhoneNumberField();
        ProfileSettingsPage.changetheaddressline1();
        ProfileSettingsPage.changestate();
        ProfileSettingsPage.changecity();
        ProfileSettingsPage.clickupdatebutton();
        ProfileSettingsPage.gotoclosepopup();
        Assert.assertTrue(Start.driver.getCurrentUrl().contains("profile"));
    }
}
