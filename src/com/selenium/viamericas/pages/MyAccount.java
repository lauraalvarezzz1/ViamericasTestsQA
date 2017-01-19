package com.selenium.viamericas.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {

	WebDriver driver;

	// Login Form complete
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	
	//<-----------MY ACCOUNT SECTION------------->
	public static By MyAccountLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[4]/a");
	// Profile Settings-You can see the tests for this section in com.selenium.viamericas.subpage
	public static By ProfileSettingsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/a");	
	
	////Recipients-You can see the tests for this section in com.selenium.viamericas.subpage
	public static By RecipientsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/a");
	
	//Preferences
	public static By PreferencesLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[3]/a");
	public static By LanguageField = By.xpath(".//*[@id='dropdown-input']");
	public static By SelectIdiom = By.xpath(".//*[@id='dropdown-list']");
	public static By SaveChangesButton = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/button");
	
	//Accounts-You can see the tests for this section in com.selenium.viamericas.subpage
	public static By AccountsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[4]/a");
	
	public MyAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void MyAccountProfileSettings() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(RecipientsLabel).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/profile", driver.getCurrentUrl());

	}
	
	public void MyAccountRecipients() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(ProfileSettingsLabel).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/recipients", driver.getCurrentUrl());

	}
	
	public void MyAccountAccounts() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(AccountsLabel).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/accounts", driver.getCurrentUrl());

	}

	public void EnglishPreferences() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(ProfileSettingsLabel).click();
		driver.findElement(LanguageField).clear();
		driver.findElement(LanguageField).sendKeys("English");
		driver.findElement(SelectIdiom).click();
		driver.findElement(SaveChangesButton).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/preferences", driver.getCurrentUrl());

	}
	
	public void SpanishPreferences() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(ProfileSettingsLabel).click();
		driver.findElement(LanguageField).clear();
		driver.findElement(LanguageField).sendKeys("Español");
		driver.findElement(SelectIdiom).click();
		driver.findElement(SaveChangesButton).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/preferences", driver.getCurrentUrl());

	}

}
