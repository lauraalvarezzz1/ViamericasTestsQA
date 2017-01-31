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

        @Test
        public void FillDestinationInformation() throws Exception {
            Send_DestinationPage.selectCountry();
            Send_DestinationPage.selectamounttoSend();
            Send_DestinationPage.howMoneyRecieved("BankDeposit");
            Send_DestinationPage.chooseBank();
            Assert.assertNotNull(Send_DestinationPage.exchangerate);
            Send_DestinationPage.goandcontinue();
            Assert.assertTrue(Start.driver.getCurrentUrl().contains("recipient"));
        }
}
