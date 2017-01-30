package com.selenium.viamericas.pages;
import org.openqa.selenium.By;
import com.selenium.viamericas.utility.Start;

public class LoginPage {

    public static By email = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
    public static By password = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
    public static By signinbutton = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
    public static By wrongcredentials = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/message-viamericas/div/p");

    public static void login(String user, String pass){

        Start.driver.findElement(email).sendKeys(user);
        Start.driver.findElement(password).sendKeys(pass);
        Start.driver.findElement(signinbutton).click();
    }

    public static void typeemail (String mail){
        Start.driver.findElement(email).sendKeys(mail);
    }

    public static void typepassword (String p) {
        Start.driver.findElement(password).sendKeys(p);
    }

    public static void clicklogin () throws Exception{

        Start.driver.findElement(signinbutton).click();
        Thread.sleep(2000);
    }

    public static void clearfields(){
        Start.driver.findElement(email).clear();
        Start.driver.findElement(password).clear();
    }
}
