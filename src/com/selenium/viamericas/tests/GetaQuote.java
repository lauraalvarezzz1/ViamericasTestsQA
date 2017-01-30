package com.selenium.viamericas.tests;

import com.selenium.viamericas.pages.GetaQuotePage;
import com.selenium.viamericas.pages.HomePage;
import com.selenium.viamericas.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.viamericas.utility.Start;

public class GetaQuote {

    @BeforeClass
    public void start() throws Exception {
        Start.initiate("dev");
        HomePage.Goto("login");
        LoginPage.login("cristhian.preciado@talosdigital.com", "Test4echo");
        HomePage.Goto("getaquote");
    }

    @AfterClass
    public void finish() {
        Start.driver.quit();
    }

    @Test(enabled = true, priority = 0)
    public void verifyallfields(){

        Assert.assertNotNull(GetaQuotePage.title);
        Assert.assertNotNull(GetaQuotePage.countrydropdown);
        Assert.assertNotNull(GetaQuotePage.amountfield);
    }

    @Test(enabled = true, priority = 1)
    public void testwithbankdeposit() throws Exception {

        GetaQuotePage.selectcountry("COLOMBIA");
        GetaQuotePage.enteramount("10");
        GetaQuotePage.selecttype("bankdeposit");
        GetaQuotePage.getaquote();
        Assert.assertNotNull(GetaQuotePage.bestexhangeratetitle);

    }
    @Test(enabled = true, priority = 2)
    public void testwithcashpickup() throws Exception {
        GetaQuotePage.selectcountry("COLOMBIA");
        GetaQuotePage.enteramount("10");
        GetaQuotePage.selecttype("cashpickup");
        GetaQuotePage.getaquote();
        Assert.assertNotNull(GetaQuotePage.bestexhangeratetitle);
    }

    @Test(enabled = true, priority = 3)
    public void checkChangingCountry() throws Exception {
        GetaQuotePage.selectcountry("BRAZIL");
        GetaQuotePage.enteramount("10");
        GetaQuotePage.selecttype("cashpickup");
        GetaQuotePage.getaquote();
        Assert.assertNotNull(GetaQuotePage.bestexhangeratetitle);
    }

    @Test(enabled = true, priority = 4)
    public void checkChangingAmount() throws Exception {
        GetaQuotePage.selectcountry("COLOMBIA");
        GetaQuotePage.enteramount("200");
        GetaQuotePage.selecttype("cashpickup");
        GetaQuotePage.getaquote();
        Assert.assertNotNull(GetaQuotePage.bestexhangeratetitle);
    }

    @Test(enabled = true, priority = 5)
    public void verifySendMoneyButton() throws Exception{
        Assert.assertNotNull(GetaQuotePage.sendmoneyButton);
    }

    @Test(enabled = true, priority = 6)
    public void verifyTitLe() throws Exception{
        Assert.assertEquals(GetaQuotePage.gettitle(),"Get A Quote");
    }
}
