package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class footerProjectsPage {

	WebDriver driver;
	
	public static By hamburguer_menu = By.xpath("html/body/header/div/button"); 
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By fifty = By.xpath(".tw-project-item-overlay");
	public static By leaseapp = By.xpath("html/body/main/div[1]/div[2]/a");
	public static By runway = By.xpath("html/body/main/div[1]/div[2]/a");
	public static By reddy = By.xpath("html/body/main/div[1]/div[2]/a");
	public static By mozidoright = By.id("html/body/main/div[1]/div[2]/a");
	public static By otteright = By.id("html/body/main/div[1]/div[2]/a");
	public static By fiftyright = By.id("html/body/div[1]/div[2]/a");
	public static By reddyleft = By.id("html/body/div[1]/div[1]/a");
	public static By otteleft = By.id("html/body/div[1]/div[1]/a");
	public static By mozidoleft = By.id("html/body/div[1]/div[1]/a");
	public static By runwayleft = By.id("html/body/div[1]/div[1]/a");
	public static By leaseappleft = By.id("html/body/div[1]/div[1]/a");
	public static By fiftyleft = By.id("html/body/div[1]/div[1]/a");
	
	public footerProjectsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer(){
		driver.findElement(hamburguer_menu).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void fifty(){
		driver.findElement(fifty).click();
	}
	
	public void mozidorigth(){
		driver.findElement(mozidoright).click();
	}
	
	public void otteright(){
		driver.findElement(otteright).click();
	}
	
	public void fiftyright(){
		driver.findElement(fiftyright).click();
	}
	
	public void otteleft(){
		driver.findElement(otteleft).click();
	}
	
	public void mozidoleft(){
		driver.findElement(mozidoleft).click();
	}
	
	public void fiftyleft(){
		driver.findElement(fiftyleft).click();
	}
	
	public void leaseapp(){
		driver.findElement(leaseapp).click();
	}
	
	public void runway(){
		driver.findElement(runway).click();
	}
	
	public void reddy(){
		driver.findElement(reddy).click();
	}
	
	public void runwayleft(){
		driver.findElement(runwayleft).click();
	}
	
	public void leaseappleft(){
		driver.findElement(leaseappleft).click();
	}
	
	public void reddyleft(){
		driver.findElement(reddyleft).click();
	}
}