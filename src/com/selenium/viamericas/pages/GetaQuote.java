package com.selenium.viamericas.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetaQuote {
	
	WebDriver driver;

	// Get a Quote Form optional
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	
	
	//<--------GET A QUOTE---------->
	public static By GoToGetaQuote = By
			.xpath("html/body/div[2]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul[1]/li[3]/a");
	public static By AmountField = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div[2]/div[1]/div/input");

	// Placeholder
	public static By CountryName = By.xpath(".//*[@placeholder='Country']");
	public static By CurrencyName = By.xpath(".//*[@placeholder='Currency']");

	// Buttons
	public static By CashPickupButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div[1]/div[3]/div[1]/div[2]/div");
	public static By BankDepositButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[1]/div[2]/div[4]/div[1]/div[1]/div");
	public static By GetaQuoteButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[4]/button");
	public static By SendMoneyButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/form/div[4]/button");

	// Lists
	public static By SelectAnyOption = By.xpath(".//*[@id='dropdown-list']");
	
	public GetaQuote(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Expect: Send Money form--------CashPickup option
	public void GetaQuoteWithLogInAndCashPickup() {
		driver.findElement(LoginLabel).click();
		driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
		driver.findElement(PasswordInput).sendKeys("Laura123");
		driver.findElement(SignInButton).click();
		driver.findElement(GoToGetaQuote).click();
		driver.findElement(CountryName).sendKeys("COLOMBIA");
		driver.findElement(SelectAnyOption).click();
		driver.findElement(AmountField).sendKeys("5");
		driver.findElement(CashPickupButton).click();
		driver.findElement(GetaQuoteButton).click();
		driver.findElement(SendMoneyButton).click();
		Assert.assertEquals("https://www.govianex.com/#/sendmoney/destination", driver.getCurrentUrl());

	}
	
	//Expect: Send Money form--------BankAccount option
		public void GetaQuoteWithLogInAndBankAccount() {
			driver.findElement(LoginLabel).click();
			driver.findElement(UsernameInput).sendKeys("laura.alvarez@talosdigital.com");
			driver.findElement(PasswordInput).sendKeys("Laura123");
			driver.findElement(SignInButton).click();
			driver.findElement(GoToGetaQuote).click();
			driver.findElement(CountryName).sendKeys("COLOMBIA");
			driver.findElement(SelectAnyOption).click();
			driver.findElement(AmountField).sendKeys("5");
			driver.findElement(BankDepositButton).click();
			driver.findElement(GetaQuoteButton).click();
			driver.findElement(SendMoneyButton).click();
			Assert.assertEquals("https://www.govianex.com/#/sendmoney/destination", driver.getCurrentUrl());

		}


	

}