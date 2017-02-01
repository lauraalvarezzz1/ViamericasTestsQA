package com.selenium.viamericas.SpecificUsersStories;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VIAM1770ChangePassword {

	WebDriver driver;

	public static By LoginLabel = 
			By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	public static By MyAccountLabel = 
			By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[4]/a");
	public static By ProfileSettingsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/a");	
	public static By ChangePasswordButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[14]/button[2]");
	public static By CurrentPasswordField = By
			.xpath(".//*[@id='currentPassword']");
	public static By ContinueButton = By
			.xpath("html/body/div[3]/div[2]/button[1]");
	public static By NewPasswordField = By
			.xpath(".//*[@id='newPassword']");
	public static By RepeatPasswordField = By
			.xpath(".//*[@id='newPasswordConfirm']");
	public static By Logout = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[7]/a");
	
	
	public VIAM1770ChangePassword(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ChangePasswordCorrectPassword() {
		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(ProfileSettingsLabel).click();
		driver.findElement(ChangePasswordButton).click();
		driver.findElement(CurrentPasswordField).sendKeys("Laura123");
		driver.findElement(ContinueButton).click();
		driver.findElement(NewPasswordField).sendKeys("Laura1234");
		driver.findElement(RepeatPasswordField).sendKeys("Laura1234");
		driver.findElement(ContinueButton).click();
		driver.findElement(Logout).click();
		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura1234");
		driver.findElement(SignInButton).click();
		
		Assert.assertEquals("https://www.govianex.com/#/", driver.getCurrentUrl());
	}
	
	public void ChangePasswordIncorrectPassword() {
		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(ProfileSettingsLabel).click();
		driver.findElement(ChangePasswordButton).click();
		driver.findElement(CurrentPasswordField).sendKeys("Laura1234");
		
		//New popup window: Invalid Password
		driver.findElement(CurrentPasswordField).sendKeys("Laura123");
		driver.findElement(ContinueButton).click();
		driver.findElement(NewPasswordField).sendKeys("Laura1234");
		driver.findElement(RepeatPasswordField).sendKeys("Laura1234");
		driver.findElement(ContinueButton).click();
		driver.findElement(Logout).click();
		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura1234");
		driver.findElement(SignInButton).click();
		
		Assert.assertEquals("https://www.govianex.com/#/", driver.getCurrentUrl());
	}
}
