package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

	WebDriver driver;
	
	public static By logo = By.xpath("html/body/header/div/a/img"); 
	public static By slide = By.xpath("html/body/main/section[1]/div[2]/div/a/i");
	public static By turnkeysolved= By.xpath(".//*[@id='section2-a-1']");
	public static By rightsourcing = By.xpath(".//*[@id='section2-a-2']"); 
	public static By ourwork = By.xpath("html/body/main/section[5]/div[2]/div/div/a"); 
	public static By reddy = By.xpath("html/body/main/section[3]/div[2]/div[1]/div[2]/div/a");
	public static By otte = By.xpath("html/body/main/section[3]/div[2]/div[2]/div[2]/div/a");
	public static By runway = By.xpath("html/body/main/section[3]/div[2]/div[4]/div[2]/div/a");
	public static By hipercept = By.xpath("html/body/main/section[3]/div[2]/div[5]/div[2]/div/a");
	public static By fifty = By.xpath("html/body/main/section[3]/div[2]/div[6]/div[2]/div/a");
	public static By mozido = By.xpath("html/body/main/section[3]/div[2]/div[3]/div[2]/div/a"); 
	public static By contact = By.xpath("html/body/main/section[4]/div/div/a"); 
	
	public homePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void logo(){
		driver.findElement(logo).click();
	}
	
	public void slide(){
		driver.findElement(slide).click();
	}
	
	public void turnkeysolved(){
		driver.findElement(turnkeysolved).click();
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
	
	public void reddy(){
		driver.findElement(reddy).click();
	}
	
	public void otte(){
		driver.findElement(otte).click();
	}
	
	public void runway(){
		driver.findElement(runway).click();
	}
	
	public void hipercept(){
		driver.findElement(hipercept).click();
	}
	
	public void fifty(){
		driver.findElement(fifty).click();
	}
	
	public void mozido(){
		driver.findElement(mozido).click();
	}
}
