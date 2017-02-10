package com.selenium.viamericas.tests;

import com.selenium.viamericas.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.viamericas.utility.Start;
import org.openqa.selenium.WebDriver;


public class SignUp {



    @BeforeClass
    public void start() throws Exception {
        Start.initiate("test");
    }

    @AfterClass
    public void finish() {
        Start.driver.quit();
    }

    @Test(enabled = true, priority = 0)
    public void gotosignup() throws Exception {
        SignUpPage.gotosignupform();
        Assert.assertEquals(Start.driver.getCurrentUrl(), "https://test.govianex.com/#/account/register");
    }

    @Test(enabled = true, priority = 1)
    public void completestringfields() throws Exception {
        SignUpPage.addfirstname("LAURA");
        SignUpPage.addlastname("ALVAREZ");
        SignUpPage.addmobilephonenumber("3117224425");
        SignUpPage.addadressline1("Calle 10");
        SignUpPage.addzipcode("90001");
        SignUpPage.addemailaddress("luis@gmail.com");
    }

    @Test(enabled = true, priority = 2)
    public void selectcountrydropdown() throws Exception {
        Thread.sleep(2000);
        SignUpPage.selectcountry("UNITED STATES");
        Assert.assertNotNull(SignUpPage.country);

    }

    @Test(enabled = true, priority = 3)
    public void selectstatedropdown() throws Exception {
        Thread.sleep(2000);
        SignUpPage.selectstate("CALIFORNIA");
        Assert.assertNotNull(SignUpPage.stateDropdown);
    }

    @Test(enabled = true, priority = 4)
    public void completecity() throws Exception {
        Thread.sleep(2000);
        SignUpPage.selectcity("LOS ANGELES");
        Assert.assertNotNull(SignUpPage.cityDropdown);
    }

    @Test(enabled = true, priority = 5)
    public void createbutton() throws Exception {

        SignUpPage.acceptTCPP();
        SignUpPage.createbutton();
        //Assert.assertTrue(Start.driver.getCurrentUrl().contains("confirm"));
    }

}


