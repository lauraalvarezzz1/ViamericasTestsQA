package unitaryTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.homePage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class hometest {
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

	@Test (priority=1, enabled=true)
	public void homepage() throws InterruptedException { //Home page
		driver.get("http://dev.talosdigital.com/");

		homePage homepage = new homePage(driver);
		homepage.logo();
		Thread.sleep(2000);
		homepage.slide();
		Thread.sleep(2000);
	    homepage.logo();
	    Thread.sleep(2000);
		homepage.turnkeysolved();
		Thread.sleep(2000);
		homepage.logo();
		Thread.sleep(2000);
		homepage.rightsourcing();
		homepage.logo();
		Thread.sleep(2000);
		homepage.reddy();
		Thread.sleep(2000);
		homepage.runway();
		Thread.sleep(2000);
		homepage.mozido();
		Thread.sleep(2000);
		homepage.otte();
		Thread.sleep(2000);
		homepage.fifty();
		Thread.sleep(2000);
		homepage.hipercept();
		Thread.sleep(2000);
		homepage.logo();
		homepage.contact();


		Assert.assertEquals("http://dev.talosdigital.com/contact.html", driver.getCurrentUrl());

	}

}
