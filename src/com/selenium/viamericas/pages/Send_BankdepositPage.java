package com.selenium.viamericas.pages;

import com.selenium.viamericas.utility.Start;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Send_BankdepositPage {

    public static By accountholdername = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div[2]/div[4]/input");
    public static By accountnumber = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div[2]/div[5]/input");
    public static By accounttypedropdown = By.xpath(".//*[@placeholder='Account Type']");

    public static void Completeaccountname() throws Exception {
        Thread.sleep(3000);
        Start.driver.findElement(accountholdername).sendKeys("Laura Cristina A");
    }

    public static void Completeaccountnumber() throws Exception {
        Thread.sleep(3000);
        Start.driver.findElement(accountnumber).sendKeys("000000000000");
    }

    public static void selectaccounttype() throws Exception {
        Start.driver.findElement(accounttypedropdown).sendKeys("Checking Account");
        Start.driver.findElement(accounttypedropdown).sendKeys(Keys.DOWN);
        Start.driver.findElement(accounttypedropdown).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
}
