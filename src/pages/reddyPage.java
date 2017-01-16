package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reddyPage {
	WebDriver driver;	
	
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By reddy = By.xpath(".//*[@id='slide_2_action']/div[1]/div[2]/a/div[2]/h2");
	
	public reddyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer(){
		driver.findElement(hamburguer).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void reddy(){
		driver.findElement(reddy).click();
	}
	
}