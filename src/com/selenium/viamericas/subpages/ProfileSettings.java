package com.selenium.viamericas.subpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileSettings {


	WebDriver driver;

	// It's optional because here is created the page: MyAccount
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
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[14]/button[1]");
	
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
	
	public ProfileSettings(WebDriver driver) {
		this.driver = driver;
	}

	public void UpdateInformation() {
	}
	
	public void ChangePassword() {
	}
}
