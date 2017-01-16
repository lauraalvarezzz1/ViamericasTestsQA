package unitaryTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.blogPage;
import pages.homePage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class blogTest {
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

	public void blogpage() throws InterruptedException { //Blog page
		driver.get("http://dev.talosdigital.com/");
		blogPage blog = new blogPage(driver);
		blog.hamburguer();
		Thread.sleep(2000);
		blog.blog();
		Thread.sleep(5000);
		blog.slider();
		Thread.sleep(5000);
		blog.loadmore();
		Thread.sleep(2000);
		blog.examplepost();
		
		//Assert.assertEquals(" ", driver.getCurrentUrl());
        //Remember that, you should put the link.
	}

}
