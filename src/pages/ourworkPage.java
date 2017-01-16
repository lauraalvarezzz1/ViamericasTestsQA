package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ourworkPage {
	WebDriver driver;
	
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By reddy = By.xpath(".//*[@id='slide_2_action']/div[1]/div[2]/a/div[2]/h2");
	public static By lease = By.xpath(".//*[@id='slide_2_action']/div[2]/div[2]/a/div[2]/h2");
	public static By runway = By.xpath(".//*[@id='slide_2_action']/div[3]/div[1]/a/div[2]/h2");
	public static By otte = By.xpath(".//*[@id='slide_2_action']/div[1]/div[1]/a/div[1]");
	public static By fifty = By.xpath(".//*[@id='slide_2_action']/div[2]/div[1]/a/div[2]/h2");
	public static By mozido = By.xpath(".//*[@id='slide_2_action']/div[3]/div[2]/a/div[2]/h2");
	public static By slider = By.xpath("html/body/main/section[1]/div[3]/a/i");
	
	public ourworkPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer() {
		driver.findElement(hamburguer).click();
	}

	public void ourwork() {
		driver.findElement(ourwork).click();
	}
	
	public void reddy() {
		driver.findElement(reddy).click();
	}
	
	public void lease() {
		driver.findElement(lease).click();
	}
	
	public void runway() {
		driver.findElement(runway).click();
	}
	
	public void otte() {
		driver.findElement(otte).click();
	}
	
	public void fifty() {
		driver.findElement(fifty).click();
	}
	
	public void mozido() {
		driver.findElement(mozido).click();
	}
	
	public void slider() {
		driver.findElement(slider).click();
	}
	
}
