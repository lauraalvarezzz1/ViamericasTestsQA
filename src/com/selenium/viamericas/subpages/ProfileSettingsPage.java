package com.selenium.viamericas.subpages;

import com.selenium.viamericas.utility.Start;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProfileSettingsPage {

	// It's optional because here is created the page: ProfileSettings
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	public static By MyAccountLabel = 
			By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[4]/a");
	
	// <-----------PROFILE SETTINGS SECTION------------->
	public static By ProfileSettingsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/a");	
	
	//<------------FORM------------>
	public static By FirstNameField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[1]/input");	
	public static By MiddleNameField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[2]/input");	//OPTIONAL
	public static By LastNameField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[3]/input");
	public static By SecondLastNameField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[4]/input"); //OPTIONAL
	public static By MobilePhoneNumberField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[5]/input");
	public static By AdressLine1Field = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[9]/input");
	public static By AdressLine2Field = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[10]/input"); //OPTIONAL
	public static By ZipCode = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[12]/div/div[2]/input");
	
	//Buttons
	public static By UpdateButton = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[14]/button[1]");
	
	public static By ChangePasswordButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[14]/button[2]");
	
	//Change Password
	public static By CurrentPasswordField = By
			.xpath(".//*[@id='currentPassword']");
	public static By ContinueButton = By
			.xpath("html/body/div[3]/div[2]/button[1]");
	public static By NewPasswordField = By
			.xpath(".//*[@id='newPassword']");
	public static By RepeatPasswordField = By
			.xpath(".//*[@id='newPasswordConfirm']");

	public static By State = By.xpath(".//*[@placeholder='State]");
	public static By City = By.xpath(".//*[@placeholder='City]");

	public static By closepopup = By.xpath("/html/body/div[3]/div[2]/span");
	


	public static void GotoProfileSettings() throws InterruptedException {
		Start.driver.findElement(ProfileSettingsLabel).click();
		Thread.sleep(2000);
	}

	public static void changethefisrtname() throws InterruptedException {
		Start.driver.findElement(FirstNameField).clear();
		Start.driver.findElement(FirstNameField).sendKeys("Laura");
		Thread.sleep(2000);
	}

	public static void changethemiddlename() throws InterruptedException {
		Start.driver.findElement(MiddleNameField).clear();
		Start.driver.findElement(MiddleNameField).sendKeys("Maria");
		Thread.sleep(2000);
	}

	public static void changetheLastNameField() throws InterruptedException {
		Start.driver.findElement(LastNameField).clear();
		Start.driver.findElement(LastNameField).sendKeys("Galviz");
		Thread.sleep(2000);
	}

	public static void changetheMobilePhoneNumberField() throws InterruptedException {
		Start.driver.findElement(MobilePhoneNumberField).clear();
		Start.driver.findElement(MobilePhoneNumberField).sendKeys("3122066063");
		Thread.sleep(2000);
	}

	public static void changetheaddressline1() throws InterruptedException {
		Start.driver.findElement(AdressLine1Field).clear();
		Start.driver.findElement(AdressLine1Field).sendKeys("Carrera 65 # 45 - 56");
		Thread.sleep(2000);
	}

	public static void changestate() throws InterruptedException {
		Start.driver.findElement(State).clear();
		Thread.sleep(2000);
		Start.driver.findElement(State).sendKeys("CALIFORNIA");
		Start.driver.findElement(State).sendKeys(Keys.DOWN);
		Start.driver.findElement(State).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public static void changecity() throws InterruptedException {
		Start.driver.findElement(City).clear();
		Thread.sleep(2000);
		Start.driver.findElement(City).sendKeys("FIRESTONE PARK");
		Start.driver.findElement(City).sendKeys(Keys.DOWN);
		Start.driver.findElement(City).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public static void clickupdatebutton() throws InterruptedException {
		Start.driver.findElement(UpdateButton).click();
		Thread.sleep(2000);
	}

	public static void gotochangepassword() throws InterruptedException {
		Start.driver.findElement(ChangePasswordButton).click();
		Thread.sleep(2000);
	}

	public static void addthecurrentpassword() throws InterruptedException {
		Start.driver.findElement(CurrentPasswordField).sendKeys("Laura123");
		Thread.sleep(2000);
	}

	public static void clickoncontinuebutton() throws InterruptedException {
		Start.driver.findElement(ContinueButton).click();
		Thread.sleep(2000);
	}

	public static void addnewpassword() throws InterruptedException {
		Start.driver.findElement(NewPasswordField).sendKeys("Laura123");
		Thread.sleep(2000);
	}

	public static void addrepeatpassword() throws InterruptedException {
		Start.driver.findElement(RepeatPasswordField).sendKeys("Laura123");
		Thread.sleep(2000);
	}

	public static void gotoclosepopup() throws InterruptedException {
		Start.driver.findElement(closepopup).click();
		Thread.sleep(2000);
	}

}
