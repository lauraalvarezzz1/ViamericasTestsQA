package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fiftyPage {
WebDriver driver;	
	
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By ourwork = By.xpath(".//*[@id='tw_sidebar']/div/div[4]/a");
	public static By slide = By.xpath("html/body/main/section[1]/div[3]/a/i");
	public static By fifty = By.xpath(".//*[@id='slide_2_action']/div[2]/div[1]/a/div[2]/h2");
	
	public fiftyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer(){
		driver.findElement(hamburguer).click();
	}
	
	public void ourwork(){
		driver.findElement(ourwork).click();
	}
	
	public void slide(){
		driver.findElement(slide).click();
	}
	
	public void fifty(){
		//WebDriverWait wait= new WebDriverWait(driver,20);
	    //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='slide_2_action']/div[2]/div[1]/a/div[1]")));
		driver.findElement(fifty).click();
	}
	
	//container
	//movimiento de la imagen
	//el texto no se mantiene
}