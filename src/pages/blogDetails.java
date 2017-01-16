package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blogDetails {

	
	WebDriver driver;
	public static By hamburguer = By.xpath("html/body/header/div/button");
	public static By blog = By.xpath(".//*[@id='tw_sidebar']/div/div[5]/a");
	public static By slider = By.xpath(".//*[@id='main']/section[1]/div[4]/a/i");
	public static By loadmore = By.xpath(".//*[@id='load-more']");
	public static By examplepost = By.xpath(".//*[@id='post-82']/div/a/img");
	public static By sliderpost = By.xpath(".//*[@id='main']/section/div[2]/a/i");
	public static By recentpost = By.xpath(".//*[@id='recent-posts-2']/ul/li[1]/a");
	
	
	public blogDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hamburguer() {
		driver.findElement(hamburguer).click();
	}

	public void blog() {
		driver.findElement(blog).click();
	}
	
	public void slider() {
		driver.findElement(slider).click();
	}
	
	public void loadmore() {
		driver.findElement(loadmore).click();
	}
	
	public void examplepost() {
		driver.findElement(examplepost).click();
	}
	
	public void sliderpost() {
		driver.findElement(sliderpost).click();
	}
	
	public void recentpost() {
		driver.findElement(recentpost).click();
	}
}
