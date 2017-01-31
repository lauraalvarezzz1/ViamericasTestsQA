package com.selenium.viamericas.pages;

import org.openqa.selenium.By;
import com.selenium.viamericas.utility.Start;
public class SignUpPage {

    //<---------OBLIGATORY--------->
    public static By signupbutton = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/div/button[1]");
    public static By firstname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/input");
    public static By lastname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[3]/input");
    public static By mobilephonenumber = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[5]/input");
    public static By addressline1 = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[1]/input");
    public static By country = By.xpath(".//*[@placeholder='Country']");
    public static By stateDropdown = By.xpath(".//*[@placeholder='State']");
    public static By zipcode = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[4]/div/div[2]/input");
    public static By cityDropdown = By.xpath(".//*[@placeholder='City']");
    public static By emailaddress = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[8]/input");
    public static By acceptTCPP = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[9]/div[1]/ins");
    public static By createbutton = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[3]/button");

    //<----------OPTIONAL----------->

    public static By middlename = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/input");
    public static By secondlastname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[4]/input");
    public static By addressline2 = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[2]/input");
    public static By countryofbirth = By.xpath(".//*[@placeholder='Country of Birth']");
    public static By month = By.xpath(".//*[@placeholder='Month']");
    public static By day = By.xpath(".//*[@placeholder='Day']");
    public static By year = By.xpath(".//*[@placeholder='Year']");

    public static By selectoption = By.xpath(".//*[@id='dropdown-list']");


    public static void gotosignupform() throws Exception {
        Start.driver.findElement(signupbutton).click();
        Thread.sleep(2000);
    }

    public static void addfirstname(String first) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(firstname).clear();
        Start.driver.findElement(firstname).sendKeys(first);
    }

    public static void addlastname(String last) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(lastname).clear();
        Start.driver.findElement(lastname).sendKeys(last);
    }

    public static void addmobilephonenumber(String mobile) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(mobilephonenumber).clear();
        Start.driver.findElement(mobilephonenumber).sendKeys(mobile);
    }

    public static void addadressline1(String address) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(addressline1).clear();
        Start.driver.findElement(addressline1).sendKeys(address);
    }

    public static void addzipcode(String zipcod) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(zipcode).clear();
        Start.driver.findElement(zipcode).sendKeys(zipcod);
    }

    public static void addemailaddress(String email) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(emailaddress).clear();
        Start.driver.findElement(emailaddress).sendKeys(email);
    }

    public static void selectcity(String city) {
        Start.driver.findElement(cityDropdown).clear();
        Start.driver.findElement(cityDropdown).sendKeys(city);
        Start.driver.findElement(selectoption).click();
    }

    public static void selectstate(String state) {
        Start.driver.findElement(stateDropdown).clear();
        Start.driver.findElement(stateDropdown).sendKeys(state);
        Start.driver.findElement(selectoption).click();
    }

    public static void selectcountry(String countr) {
        Start.driver.findElement(country).clear();
        Start.driver.findElement(country).sendKeys(countr);
        Start.driver.findElement(selectoption).click();
    }

    public static void acceptTCPP()throws Exception{
        Start.driver.findElement(acceptTCPP).click();
        Thread.sleep(2000);
    }

    public static void createbutton() throws Exception{
        Start.driver.findElement(createbutton).click();
        Thread.sleep(2000);
    }

    //<----------------Optional----------------->

    public static void addmiddlename(String middle) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(middlename).clear();
        Start.driver.findElement(middlename).sendKeys(middle);
    }

    public static void addsecondlastname(String second) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(secondlastname).clear();
        Start.driver.findElement(secondlastname).sendKeys(second);
    }

    public static void addaddressline2(String address2) throws Exception {
        Thread.sleep(1500);
        Start.driver.findElement(addressline2).clear();
        Start.driver.findElement(addressline2).sendKeys(address2);
    }

    public static void addcountryofbirth(String countryofb) throws Exception {
        Start.driver.findElement(countryofbirth).clear();
        Start.driver.findElement(countryofbirth).sendKeys(countryofb);
        Start.driver.findElement(selectoption).click();
    }

    public static void addmonth(String monthdropdown) throws Exception {
        Start.driver.findElement(month).clear();
        Start.driver.findElement(month).sendKeys(monthdropdown);
        Start.driver.findElement(selectoption).click();
    }

    public static void addday(String daydropdown) throws Exception {
        Start.driver.findElement(day).clear();
        Start.driver.findElement(day).sendKeys(daydropdown);
        Start.driver.findElement(selectoption).click();
    }

    public static void addyear(String yeardropdown) throws Exception {
        Start.driver.findElement(year).clear();
        Start.driver.findElement(year).sendKeys(yeardropdown);
        Start.driver.findElement(selectoption).click();
    }
}
