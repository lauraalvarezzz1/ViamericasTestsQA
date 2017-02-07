package com.selenium.viamericas.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recipients {

	WebDriver driver;

	// It's optional because here is created the page: Recipients
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SignInButton = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	public static By MyAccountLabel = 
			By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[4]/a");
	
	// <-----------RECIPIENT------------->
	public static By RecipientsLabel = By
			.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/a");
	public static By createButton = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div/button");
	public static By firstName = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[1]/input");
	public static By middleName = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[2]/input");
	public static By lastName = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[3]/input");
	public static By secondLastName = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[4]/input");
	public static By mobilePhoneNumber = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[5]/input");
	public static By emailAddressOptional = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[6]/input");
	public static By AddressLine1 = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[8]/input");
	public static By AdressLine2 = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[9]/input");
	public static By zipCode = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[1]/div[11]/div/div[2]/input");

	public static By monthdropdown = By.xpath(".//*[@placeholder='Month']");
	public static By daydropdown = By.xpath(".//*[@placeholder='Day']");
	public static By yeardropdown = By.xpath(".//*[@placeholder='Year']");

	public static By countrydropdown = By.xpath(".//*[@placeholder='Country']");
	public static By statedropdown = By.xpath(".//*[@placeholder='State']");
	public static By citydropdown = By.xpath(".//*[@placeholder='City']");

	//<--------NEW BANK ACCOUNT----------->
	public static By currency = By.xpath(".//*[@placeholder='Currency']");
	public static By chooseabank = By.xpath(".//*[@placeholder='Choose a bank']");

	public static By accountHolderName = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[2]/div[2]/div[4]/input");
	public static By accountNumber = By
			.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/form[2]/div[2]/div[5]/input");
	public static By accountType = By.xpath(".//*[@placeholder='Account Type']");
	public static By createbuttonwithintheform = By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/button");
}
