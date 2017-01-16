package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class rightsourcingPage {

	WebDriver driver;
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By rightsourcing = By.xpath(".//*[@id='tw_sidebar']/div/div[2]/a");
	public static By slider = By.xpath("html/body/main/section[1]/div[3]/a/i");
	public static By hybrispage = By.xpath("html/body/main/section[5]/div[1]/div/a");

	public rightsourcingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer() {
		driver.findElement(hamburguer).click();
	}

	public void rightsourcing() {
		driver.findElement(rightsourcing).click();
	}
	
	public void slider() {
		driver.findElement(slider).click();
	}
	
	public void hybrispage() {
		driver.findElement(hybrispage).click();
	}
}



