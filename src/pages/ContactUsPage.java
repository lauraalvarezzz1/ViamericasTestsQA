package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	WebDriver driver;
	
	public static By hamburguer_menu = By.xpath("html/body/header/div/button"); 
	public static By contact1 = By.xpath(".//*[@id='tw_sidebar']/div/div[6]/a");
	public static By name = By.id("name");
	public static By email = By.id("email");
    public static By subject = By.id("subject");
    public static By message = By.id("message");
    public static By send = By.xpath(".//*[@id='contact_form']/div[5]/button");
    public static By emailus = By.xpath("html/body/main/section[2]/div/a");
    
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void hamburguer_menu(){
		driver.findElement(hamburguer_menu).click();
	}
	
	public void contact1(){
		driver.findElement(contact1).click();
	}
	
	public void name(){
		driver.findElement(name).sendKeys("Laura Alvarez");
	}
	
	public void email(){
		driver.findElement(email).sendKeys("Laura.alvarez@talosdigital.com");
	}
	
	public void subject(){
		driver.findElement(subject).sendKeys("Message of test");
	}
	
	public void message(){
		driver.findElement(message).sendKeys("Hello, I am a message of test for Talos Digital.");
	}
	
    public void send(){
    	driver.findElement(send).click();
    }
    
    public void emailus(){
    	driver.findElement(emailus).click();
    }
}
