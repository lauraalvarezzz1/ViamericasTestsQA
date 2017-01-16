package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hamburgerMenu {

	WebDriver driver;
	
	public static By hamburguer_menu = By.xpath("html/body/header/div/button"); 
	public static By talosworks = By.xpath(".//*[@id='tw_sidebar']/div/div[1]/a"); 
	public static By rightsourcing = By.xpath(".//*[@id='tw_sidebar']/div/div[2]/a"); 
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[3]/a"); 
	public static By contact = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a"); 
	public static By gotohome = By.xpath(".//*[@id='tw_sidebar']/div/div[5]/a"); 
	
	public hamburgerMenu(WebDriver driver){
		this.driver = driver;
	}
	
	public void hamburguermenu(){
		driver.findElement(hamburguer_menu).click();
	}
	
	public void talosworks(){
		driver.findElement(talosworks).click();
	}
	
	public void rightsourcing(){
		driver.findElement(rightsourcing).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void contact(){
		driver.findElement(contact).click();
	}
	
	public void gotohome(){
		driver.findElement(gotohome).click();
	}
}
