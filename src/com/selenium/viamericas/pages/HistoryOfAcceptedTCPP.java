package com.selenium.viamericas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HistoryOfAcceptedTCPP {

	
	WebDriver driver;
	public static By LoginLabel = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By UsernameInput = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By PasswordInput = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By SigInButton = By.xpath("html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	public static By AdminOption = By.xpath(".//*[@id='post-82']/div/a/img");
	public static By HistoryOfAcceptedOption = By.xpath(".//*[@id='main']/section/div[2]/a/i");
	public static By NextButton = By.xpath(".//*[@id='recent-posts-2']/ul/li[1]/a");
	
	//this is a comment
	public HistoryOfAcceptedTCPP(WebDriver driver) {
		this.driver = driver;
	}
	
	public void GoToAdminPage() {
		driver.findElement(LoginLabel).click(); 
		driver.findElement(UsernameInput).sendKeys("viamericas@gmail.com");
		driver.findElement(PasswordInput).sendKeys("admin");
		driver.findElement(SigInButton).click(); 
		driver.findElement(AdminOption).click(); 
		driver.findElement(HistoryOfAcceptedOption).click(); 
		
		//añadir un if para la cantidad de next buttons en esta sección.
	}
	
	
	//Each one
	public void LoginLabel() {
		driver.findElement(LoginLabel).click();
	}
	
	public void UsernameInput() {
		driver.findElement(UsernameInput).sendKeys("viamericas@gmail.com");
	}
	
	public void PasswordInput() {
		driver.findElement(PasswordInput).sendKeys("admin");
	}
	
	public void SigInButton() {
		driver.findElement(SigInButton).click(); 
	}
	
	public void AdminOption() {
		driver.findElement(AdminOption).click(); 
	}
	
	public void HistoryOfAcceptedOption() {
		driver.findElement(HistoryOfAcceptedOption).click(); 
	}
}

