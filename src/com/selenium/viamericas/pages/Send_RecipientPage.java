package com.selenium.viamericas.pages;

import com.selenium.viamericas.utility.Start;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by talosdigital on 1/28/17.
 */
public class Send_RecipientPage {
    //<---------OBLIGATORY--------->
    public static By signupbutton = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/div/button[1]");
    public static By firstname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div[2]/input");
    public static By lastname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div[4]/input");
    public static By phonenumber = By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div[6]/input");
    public static By addressline1 = By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div[9]/input");

    public static By month = By.xpath(".//*[@placeholder='Month']");
    public static By day = By.xpath(".//*[@placeholder='Day']");
    public static By year = By.xpath(".//*[@placeholder='Year']");

    public static By state = By.xpath(".//*[@placeholder='State']");
    public static By city = By.xpath(".//*[@placeholder='City']");

    public static By continuebutton = By.xpath(" public static By city = By.xpath(\".//*[@placeholder='City']\");");

    public static void completename(String first) throws Exception {
        Start.driver.findElement(firstname).sendKeys(first);
        Thread.sleep(2000);
    }

    public static void completelastname(String last) throws Exception {
        Start.driver.findElement(lastname).sendKeys(last);
        Thread.sleep(1500);
    }

    public static void completephonenumber(String phone) throws Exception {
        Start.driver.findElement(phonenumber).sendKeys(phone);
        Thread.sleep(1500);
    }

    public static void selectmonth(String smonth) throws Exception {
        Start.driver.findElement(month).sendKeys(smonth);
        Start.driver.findElement(month).sendKeys(Keys.DOWN);
        Start.driver.findElement(month).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static void selectday(String sday) throws Exception {
        Start.driver.findElement(day).sendKeys(sday);
        Start.driver.findElement(day).sendKeys(Keys.DOWN);
        Start.driver.findElement(day).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static void selectyear(String syear) throws Exception {
        Start.driver.findElement(year).sendKeys(syear);
        Start.driver.findElement(year).sendKeys(Keys.DOWN);
        Start.driver.findElement(year).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static void addadressline1(String address) throws Exception {
        Start.driver.findElement(addressline1).sendKeys(address);
        Thread.sleep(2000);
    }

    public static void selectstate(String sstate) throws Exception {
        Start.driver.findElement(state).sendKeys(sstate);
        Start.driver.findElement(state).sendKeys(Keys.DOWN);
        Start.driver.findElement(state).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }
}
