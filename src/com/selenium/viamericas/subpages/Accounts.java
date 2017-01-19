package com.selenium.viamericas.subpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accounts {

	WebDriver driver;

	// It's optional because here is created the page: MyAccount
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");

	// <-----------ACCOUNTS SECTION------------->
	public static By MyAccountLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[4]/a");

	// Buttons
	public static By DeleteAccountButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div[2]/button");
	public static By VerifyAccountButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div[2]/button[1]");
	public static By CreateAccountButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/button");
	public static By CreateBankAccountButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div");
	public static By CreateCardAccountButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/div[1]/div[2]/div/div");
	public static By CreateAccountWithinTheForm = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/button");

	// Create Bank Account
	public static By BankAccountHolderName = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[1]/div[1]/input");
	public static By BankAccountNickname = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[1]/div[2]/input");
	public static By BankRoutingNumber = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[1]/div[3]/input");
	public static By BankAccountNumber = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[1]/div[4]/input");
	public static By BankAccountType = By.xpath(".//*[@placeholder='Account Type]");
	public static By BankSelectoptionAccountType = By.xpath(".//*[@id='dropdown-list']");

	// Create Card Account
	public static By SelectOptions = By.xpath(".//*[@id='dropdown-list']");//Select any option
	
	public static By CardType = By.xpath(".//*[@placeholder='Card Type]");
	public static By CardHolderName = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[2]/div[2]/input");
	public static By CardNickname = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[2]/div[3]/input"); //OPTIONAL
	public static By CardNumber = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[2]/div[4]/input");
	public static By MonthDropdown = By.xpath(".//*[@placeholder='Month]");
	public static By YearDropdown = By.xpath(".//*[@placeholder='Year]");
	
	public static By CVVCode = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/form[2]/div[6]/input");

	

	public Accounts(WebDriver driver) {
		this.driver = driver;
	}

	public void CreateBankAccount() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(CreateAccountButton).click();
		driver.findElement(CreateBankAccountButton).click();
		//For default Credit/Debit form is in Credit card
		driver.findElement(BankAccountHolderName).sendKeys("Laura Alvarez Galviz");
		driver.findElement(BankAccountNickname).sendKeys("LaurisA");
		driver.findElement(BankRoutingNumber).sendKeys("000110000");
		driver.findElement(BankAccountNumber).sendKeys("0101010101011010");
		driver.findElement(BankSelectoptionAccountType).sendKeys("Savings Account");
		driver.findElement(SelectOptions).click();
		driver.findElement(CreateAccountWithinTheForm).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/accounts", driver.getCurrentUrl());

	}

	public void CreateCardAccount() {

		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(MyAccountLabel).click();
		driver.findElement(CreateAccountButton).click();
		driver.findElement(CreateCardAccountButton).click();
		//For default Credit/Debit form is in Credit card
		driver.findElement(CardHolderName).sendKeys("JENNA MOLLIGAN");
		driver.findElement(CardNumber).sendKeys("4024007122828303");
		driver.findElement(CVVCode).sendKeys("617");
		driver.findElement(MonthDropdown).sendKeys("04");
		driver.findElement(SelectOptions).click();
		driver.findElement(YearDropdown).sendKeys("2017");
		driver.findElement(SelectOptions).click();
		driver.findElement(CreateAccountWithinTheForm).click();
		Assert.assertEquals("https://www.govianex.com/#/settings/accounts", driver.getCurrentUrl());

	}
}
