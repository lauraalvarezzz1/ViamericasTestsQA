package com.selenium.viamericas.pages;

import com.selenium.viamericas.utility.Start;

/**
 * Created by lauraalvarez on 30/01/17.
 */
public class SignUpPage {

    //<---------OBLIGATORY--------->
    public static By signupbutton = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/div/button[1]");
    public static By firstname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/input");
    public static By lastname = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[3]/input");
    public static By mobilephonenumber = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[5]/input");
    public static By addressline1 = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[1]/input");
    public static By country = By.xpath(".//*[@placeholder='Country']");
    public static By state = By.xpath(".//*[@placeholder='State']");
    public static By zipcode = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[4]/div/div[2]/input");
    public static By city = By.xpath(".//*[@placeholder='City']");
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

    public static void createsender() throws Exception {
        Start.driver.findElement(firstname).sendKeys("Laura");
        Start.driver.findElement(lastname).sendKeys("Alvarez");
        Start.driver.findElement(mobilephonenumber).sendKeys("3117224425");
        Start.driver.findElement(addressline1).sendKeys("Calle 10#8a-54");
        Start.driver.findElement(zipcode).sendKeys("90001");
        Start.driver.findElement(emailaddress).sendKeys("testviamericas@gmail.com");
        Thread.sleep(2000);

    }
    public static void selectcity() throws Exception {
        Start.driver.findElement(city).sendKeys("LOS ANGELES");
        Start.driver.findElement(selectoption).click();
        Thread.sleep(2000);
    }

    public static void selectstate() throws  Exception {
        Start.driver.findElement(state).sendKeys("CALIFORNIA");
        Start.driver.findElement(selectoption).click();
        Thread.sleep(2000);
    }

    public static selectcountry () throws Exception {
        Start.driver.findElement(country).sendKeys("UNITED STATES");
        Start.driver.findElement(selectoption).click();
        Thread.sleep(2000);
    }

    public static createbutton() throws Exception{
        Start.driver.findElement(createbutton).click();
        Thread.sleep(2000);
    }

    public static void acceptTCPP(){
        Start.driver.findElement(acceptTCPP).click();
    }

    public static void createsenderwithoptionalsfields(){
        Start.driver.findElement(firstname).sendKeys("Laura");
        Start.driver.findElement(lastname).sendKeys("Alvarez");
        Start.driver.findElement(mobilephonenumber).sendKeys("3117224425");
        Start.driver.findElement(addressline1).sendKeys("Calle 10#8a-54");
        Start.driver.findElement(zipcode).sendKeys("90001");
        Start.driver.findElement(emailaddress).sendKeys("testviamericas@gmail.com");
        Thread.sleep(2000);
    }
}
