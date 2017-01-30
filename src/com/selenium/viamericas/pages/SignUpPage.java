package com.selenium.viamericas.pages;
import org.openqa.selenium.By;
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
}
