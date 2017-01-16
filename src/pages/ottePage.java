package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ottePage {
	WebDriver driver;	
	
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By otte = By.xpath(".//*[@id='slide_2_action']/div[1]/div[1]/a/div[2]/h2");
	
	public ottePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer(){
		driver.findElement(hamburguer).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void otte(){
		driver.findElement(otte).click();
	}
}
