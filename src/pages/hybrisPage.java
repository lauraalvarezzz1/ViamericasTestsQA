package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hybrisPage {

	
	WebDriver driver;
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By hybris = By.xpath(".//*[@id='tw_sidebar']/div/div[3]/a");
	public static By slider = By.xpath("html/body/main/section[1]/div[3]/a/i");

	public hybrisPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer() {
		driver.findElement(hamburguer).click();
	}

	public void hybris() {
		driver.findElement(hybris).click();
	}
	
	public void slider() {
		driver.findElement(slider).click();
	}
}
