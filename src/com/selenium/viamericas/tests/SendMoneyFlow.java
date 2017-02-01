package com.selenium.viamericas.tests;

import com.selenium.viamericas.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.viamericas.utility.Start;

public class SendMoneyFlow {

        @BeforeClass
        public void start() throws Exception {
            Start.initiate("dev");
            HomePage.Goto("login");
            LoginPage.login("cristhian.preciado@talosdigital.com", "Test4echo");
            HomePage.Goto("sendmoney");
        }

        @AfterClass
        public void finish() {
            Start.driver.quit();
        }

        @Test (enabled = true, priority = 0)
        public void FillDestinationInformation() throws Exception {
            Send_DestinationPage.selectCountry();
            Send_DestinationPage.selectamounttoSend();
            Send_DestinationPage.howMoneyRecieved("BankDeposit");
            Send_DestinationPage.chooseBank();
            Assert.assertNotNull(Send_DestinationPage.exchangerate);
            Send_DestinationPage.goandcontinue();
            Assert.assertTrue(Start.driver.getCurrentUrl().contains("recipient"));
        }

        @Test (enabled = true, priority = 1)
        public void RecipientInformation() throws Exception {
            Send_RecipientPage.completename();
            Send_RecipientPage.completelastname();
            Send_RecipientPage.completephonenumber();
            Send_RecipientPage.addadressline1();
            Send_RecipientPage.selectmonth();
            Send_RecipientPage.selectday();
            Send_RecipientPage.selectyear();
            Send_RecipientPage.selectstate();
            Send_RecipientPage.selectcity();
            Send_RecipientPage.continuebutton();
            Assert.assertTrue(Start.driver.getCurrentUrl().contains("bankdeposit"));
         }

       @Test (enabled = true, priority = 2)
        public void RecipientBankDeposit() throws Exception {
            Send_BankdepositPage.Completeaccountname();
            Send_BankdepositPage.Completeaccountnumber();
            Send_BankdepositPage.selectaccounttype();
             Send_BankdepositPage.goandcontinue();
        Assert.assertTrue(Start.driver.getCurrentUrl().contains("funding"));
    }
}
