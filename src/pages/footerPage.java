package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class footerPage {

	WebDriver driver;

	public static By hamburguer_menu = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By fifty = By.id(".//*[@id='slide_2_action']/div[2]/div[1]/a/div[2]/h2");
	public static By up = By.id("tw_go_top_btn");
	public static By contactemail = By.xpath(".//*[@id='tw_footer']/div[2]/div/div/div/div[1]/div/a");
	public static By facebook = By.xpath(".//*[@id='tw_footer']/div[2]/div/div/div/div[4]/div/a[2]/i");
	public static By linkedln = By.xpath(".//*[@id='tw_footer']/div[2]/div/div/div/div[4]/div/a[1]/i");
	public static By twitter = By.xpath(".//*[@id='tw_footer']/div/div/div/div/div[5]/div/a[3]/i"); 
	public footerPage(WebDriver driver) {
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

	public void up() {
		driver.findElement(up).click();
	}

	public void contacemail() {
		driver.findElement(contactemail).click();
	}

	public void facebook() {
		driver.findElement(facebook).click();
	}

	public void linkendlin() {
		driver.findElement(linkedln).click();
	}
	
	public void twitter() {
		driver.findElement(twitter).click();
	}
}