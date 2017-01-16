package unitaryTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.fiftyPage;
import pages.homePage;
import pages.leaseappPage;
import pages.mozidoPage;
import pages.ottePage;
import pages.ourworkPage;
import pages.reddyPage;
import pages.runwayPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ourworktest {
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

	
	@Test (priority=1, enabled=true)
	public void ourwork() throws InterruptedException { //Our work page
		driver.get("http://dev.talosdigital.com/");	
		ourworkPage ourwork = new ourworkPage(driver);
		ourwork.hamburguer();
		Thread.sleep(5000);
		ourwork.ourwork();
		Thread.sleep(2000);
		ourwork.slider();
		Thread.sleep(5000);
		ourwork.otte();
		Thread.sleep(2000);
		ourwork.reddy();
		Thread.sleep(2000);
		ourwork.mozido();
		Thread.sleep(2000);
		ourwork.runway();
		Thread.sleep(2000);
		ourwork.fifty();
		Thread.sleep(2000);
		ourwork.lease();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/leaseapp.html", driver.getCurrentUrl());
    }
	
	@Test (priority=2, enabled=true)
	public void ottepage() throws InterruptedException { //Otte
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		ottePage otte = new ottePage(driver);
		otte.hamburguer();
		Thread.sleep(2000);
		otte.ourwork();
		otte.otte();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/94fifty.html", driver.getCurrentUrl());
	}
	
	@Test (priority=3, enabled=true)
	public void mozidopage() throws InterruptedException { //Mozido 
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		mozidoPage mozido = new mozidoPage(driver);
		mozido.hamburguer();
		Thread.sleep(2000);
		mozido.ourwork();
		mozido.mozido();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/mozido.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=4, enabled=true)
	public void reddypage() throws InterruptedException { //Reddy page
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		reddyPage reddy = new reddyPage(driver);
		reddy.hamburguer();
		Thread.sleep(2000);
		reddy.ourwork();
		reddy.reddy();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/reddy.html", driver.getCurrentUrl());
	}
	

	@Test (priority=5, enabled=true)
	
	public void leaseapppage() throws InterruptedException { //LeasseApp
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		leaseappPage lease = new leaseappPage(driver);
		lease.hamburguer();
		Thread.sleep(2000);
		lease.ourwork();
		lease.leaseapp();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/leaseapp.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=6, enabled=true)
	public void runwaypage() throws InterruptedException { //Runway page
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		runwayPage runway = new runwayPage(driver);
		runway.hamburguer();
		Thread.sleep(2000);
		runway.ourwork();
		runway.runway();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/runway.html", driver.getCurrentUrl());
	}
	
	@Test (priority=7, enabled=true)
	public void fiftypage() throws InterruptedException { //94fifty Page
		driver.get("http://dev.talosdigital.com/");	
		fiftyPage fifty = new fiftyPage(driver);
		fifty.hamburguer();
		Thread.sleep(5000);
		fifty.ourwork();
		Thread.sleep(5000);
		fifty.slide();
		Thread.sleep(10000);
		fifty.fifty();
		Thread.sleep(5000);

		Assert.assertEquals("http://dev.talosdigital.com/our-work/94fifty.html", driver.getCurrentUrl());
	}
	
	
	
}
