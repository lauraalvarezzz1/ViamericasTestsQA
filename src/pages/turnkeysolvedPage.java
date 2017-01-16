package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class turnkeysolvedPage {

	
	WebDriver driver;
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By talosworks = By.xpath(".//*[@id='tw_sidebar']/div/div[1]/a");
	public static By slider = By.xpath("html/body/main/section[1]/div[3]/a/i");

	public turnkeysolvedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer() {
		driver.findElement(hamburguer).click();
	}

	public void talosworks() {
		driver.findElement(talosworks).click();
	}
	
	public void slider() {
		driver.findElement(slider).click();
	}
}
