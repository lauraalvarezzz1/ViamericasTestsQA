package com.selenium.viamericas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetaQuote {

	
	WebDriver driver;
	public static By GetaQuote = By.xpath("html/body/div[2]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul[1]/li[3]/a");
	
	
	public GetaQuote(WebDriver driver) {
		this.driver = driver;
	}
	
	public void GoToAdminPage() {
		
		
		//añadir un if para la cantidad de next buttons en esta sección.
	}
	
	
	//Each one
	
}