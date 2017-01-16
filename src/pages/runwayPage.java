package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class runwayPage {
WebDriver driver;	
	
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By runway = By.xpath(".//*[@id='slide_2_action']/div[3]/div[1]/a/div[2]/h2");
	
	public runwayPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer(){
		driver.findElement(hamburguer).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void runway(){
		driver.findElement(runway).click();
	}
	
}