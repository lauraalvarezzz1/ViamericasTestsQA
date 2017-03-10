package com.selenium.viamericas.pages.viaModal;

import com.selenium.viamericas.utility.StartViamodal;
import org.openqa.selenium.By;

/**
 * Created by lauraalvarez on 10/03/17.
 */
public class CreateAccount {

    public static By gotoCreateAccount = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/button[2]");


    public static void Gotocreateaccount() throws Exception{

        StartViamodal.driver.findElement(gotoCreateAccount).click();
        Thread.sleep(2000);
    }
}
