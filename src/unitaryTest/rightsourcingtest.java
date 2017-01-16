package unitaryTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.homePage;
import pages.rightsourcingPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class rightsourcingtest {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/Users/talosdigital/Downloads/geckodriver");
        driver =  new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("Open test");
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
		System.out.println("Close test");
	}
	
	//SUITE TEST

	@Test (priority=2, enabled=true)
	public void rightsourcing() throws InterruptedException { //Rightsourcing
		driver.get("http://dev.talosdigital.com/");	
		rightsourcingPage right = new rightsourcingPage(driver);
		right.hamburguer();
		Thread.sleep(2000);
		right.rightsourcing();
		Thread.sleep(2000);
		right.slider();
		Thread.sleep(2000);
		right.hybrispage();
		
		Assert.assertEquals("http://dev.talosdigital.com/hybris.html", driver.getCurrentUrl());
	}

}