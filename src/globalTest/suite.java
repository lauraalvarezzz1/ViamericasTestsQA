package globalTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.blogPage;
import pages.blogDetails;
import pages.fiftyPage;
import pages.footerBlogPage;
import pages.footerPage;
import pages.footerProjectsPage;
import pages.hamburgerMenu;
import pages.homePage;
import pages.hybrisPage;
import pages.leaseappPage;
import pages.mozidoPage;
import pages.ottePage;
import pages.ourworkPage;
import pages.reddyPage;
import pages.rightsourcingPage;
import pages.runwayPage;
import pages.turnkeysolvedPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class suite {
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

	@Test (priority=10, enabled=true)
	public void hamburguer() throws InterruptedException { //Hamburguer Menu
		driver.get("http://dev.talosdigital.com/");	
		hamburgerMenu hamburguer= new hamburgerMenu(driver);
		Thread.sleep(2000);
		hamburguer.hamburguermenu();
		Thread.sleep(2000);
		
		//you must verify if this is correct
	}

	@Test(priority=9, enabled=true)
	public void turnkeysolved() throws InterruptedException {  //Turnkey Solved
		driver.get("http://dev.talosdigital.com/");	
		turnkeysolvedPage twp = new turnkeysolvedPage(driver);
		twp.hamburguer();
		Thread.sleep(2000);
		twp.talosworks();
		Thread.sleep(2000);
		twp.slider();
		Thread.sleep(2000);
	}
	
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
	
	@Test (priority=4, enabled=true)
	public void contactUs() throws InterruptedException { //Contact Us
		driver.get("http://dev.talosdigital.com");

		ContactUsPage contactus = new ContactUsPage(driver);
		contactus.hamburguer_menu();
		Thread.sleep(2000);
		contactus.contact1();
		Thread.sleep(2000);
		contactus.name();
		Thread.sleep(2000);
		contactus.email();
		Thread.sleep(2000);
		contactus.subject();
		Thread.sleep(2000);
		contactus.message();
		Thread.sleep(2000);
		contactus.send();
		Assert.assertEquals("http://dev.talosdigital.com/contact.html", driver.getCurrentUrl());

	}

	@Test(priority=5, enabled=true)
	public void contactUs2() throws InterruptedException { //Contact Us EMAIL
		driver.get("http://dev.talosdigital.com/");

		ContactUsPage contact = new ContactUsPage(driver);
		contact.hamburguer_menu();
		Thread.sleep(2000);
		contact.contact1();
		Thread.sleep(2000);
		contact.email();
		//Assert.assertEquals("", driver.getCurrentUrl());
		//without link, this should redirect me to the email

	}

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

	@Test (priority=6, enabled=true)
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

	@Test (priority=18, enabled=false)
	public void footerpageemail() throws InterruptedException { //footer email
		driver.get("http://dev.talosdigital.com/");
		footerPage footer = new footerPage(driver);

		footer.hamburguer();
		Thread.sleep(2000);
		footer.ourwork();
		Thread.sleep(2000);
		footer.fifty();
		Thread.sleep(2000);
		footer.up();
		Thread.sleep(2000);
		footer.contacemail();
		
		//You should verify, if the page open the windows (email)
	}

	@Test (priority=19, enabled=false)
	public void footerpagefacebook() throws InterruptedException { //footer facebook
		driver.get("http://dev.talosdigital.com/");
		footerPage footer = new footerPage(driver);

		footer.hamburguer();
		Thread.sleep(2000);
		footer.ourwork();
		footer.fifty();
		footer.up();
		footer.facebook();

		//You should verify, if the page open the windows (facebook)
		
	}

	@Test (priority=20, enabled=false)
	public void footerpagelinkendlin() throws InterruptedException { //footer Linkendlin
		driver.get("http://dev.talosdigital.com/");
		footerPage footer = new footerPage(driver);

		footer.hamburguer();
		Thread.sleep(2000);
		footer.ourwork();
		footer.fifty();
		footer.up();
		footer.linkendlin();

		//You should verify, if the page open the windows (likendlin)
		
	}
	
	@Test (priority=21, enabled=false) //pending
	public void footerpagetwitter() throws InterruptedException { //footer Twitter
		driver.get("http://dev.talosdigital.com/");
		footerPage footer = new footerPage(driver);

		footer.hamburguer();
		Thread.sleep(2000);
		footer.ourwork();
		Thread.sleep(2000);
		footer.fifty();
		footer.up();
		footer.twitter();

		//You should verify, if the page open the windows (twitter)
		Assert.assertEquals("https://twitter.com/talosdigital", driver.getCurrentUrl());

	}

	@Test (priority=22, enabled=true)
	public void footerprojectspage() throws InterruptedException { //footer projects page

		driver.get("http://dev.talosdigital.com/");
		footerProjectsPage footerproject = new footerProjectsPage(driver);

		footerproject.hamburguer();
		Thread.sleep(2000);
		footerproject.ourwork();
		Thread.sleep(2000);
		footerproject.fifty();
		Thread.sleep(2000);
		footerproject.leaseapp();
		Thread.sleep(2000);
		footerproject.runway();
		Thread.sleep(2000);
		footerproject.mozidorigth();
		Thread.sleep(2000);
		footerproject.otteright();
		Thread.sleep(2000);
		footerproject.reddy();
		Thread.sleep(2000);
		footerproject.fiftyright();
		Thread.sleep(2000);
		footerproject.reddyleft();
		Thread.sleep(2000);
		footerproject.otteleft();
		Thread.sleep(2000);
		footerproject.mozidoleft();
		Thread.sleep(2000);
		footerproject.runwayleft();
		Thread.sleep(2000);
		footerproject.leaseappleft();
		Thread.sleep(2000);
		footerproject.fiftyleft();
		Thread.sleep(2000);

		Assert.assertEquals("http://dev.talosdigital.com/our-work/94fifty.html", driver.getCurrentUrl());

	}
	
	
	@Test (priority=17, enabled=true)
	public void footerblog() throws InterruptedException { //footer blog
		driver.get("http://dev.talosdigital.com/");
		footerBlogPage footerblog = new footerBlogPage(driver);

		footerblog.hamburguer();
		Thread.sleep(3000);
		footerblog.blog();
		Thread.sleep(2000);
		footerblog.slider();
		footerblog.examplepost();
		footerblog.nextpost();
		footerblog.nextpost();
		footerblog.nextpost();
		footerblog.nextpost();
		footerblog.nextpost();
		footerblog.nextpost();
		footerblog.previouspost();
		footerblog.previouspost();
		footerblog.previouspost();
		footerblog.previouspost();
		footerblog.previouspost();
		/*You can put the number that you want, 
		 * remember that is the number the post 
		 * that there in the blog page.
		 */

		//AssertJUnit.assertEquals("", driver.getCurrentUrl()); 
		//Last post or firt post here (link)

	}

	
	@Test (priority=8, enabled=true)
	public void hybrispage() throws InterruptedException { //Hybris page
		driver.get("http://dev.talosdigital.com/hybris.html");	
		hybrisPage hybris = new hybrisPage(driver);
		hybris.hamburguer();
		Thread.sleep(2000);
		hybris.hybris();
		hybris.slider();
		
		AssertJUnit.assertEquals("http://dev.talosdigital.com/hybris.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=7, enabled=true)
	public void blogdetails() throws InterruptedException { //Blog Details
		driver.get("http://dev.talosdigital.com/");	
		blogDetails details = new blogDetails(driver);
		details.hamburguer();
		Thread.sleep(2000);
		details.blog();
		Thread.sleep(5000);
		details.slider();
		Thread.sleep(5000);
		details.loadmore();
		Thread.sleep(5000);
		details.examplepost();
		Thread.sleep(5000);
		details.sliderpost();
		Thread.sleep(5000);
		details.recentpost();

		Assert.assertEquals("http://dev.talosdigital.com/blog/ux-design-4/", driver.getCurrentUrl());
        //Remember that, this link is the firt post in recent post.
	}
	
	
	@Test (priority=3, enabled=true)
	public void ourwork() throws InterruptedException { //Our work page
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		ourworkPage ourwork = new ourworkPage(driver);
		ourwork.hamburguer();
		Thread.sleep(2000);
		ourwork.ourwork();
		ourwork.slider();
		ourwork.otte();
		ourwork.reddy();
		ourwork.mozido();
		ourwork.runway();
		ourwork.fifty();
		ourwork.lease();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/leaseapp.html", driver.getCurrentUrl());
    }
	

	@Test (priority=11, enabled=true)
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
	
	
	@Test (priority=12, enabled=true)
	public void reddypage() throws InterruptedException { //Reddy page
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		reddyPage reddy = new reddyPage(driver);
		reddy.hamburguer();
		Thread.sleep(2000);
		reddy.ourwork();
		reddy.reddy();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/reddy.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=13, enabled=true)
	public void ottepage() throws InterruptedException { //Otte
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		ottePage otte = new ottePage(driver);
		otte.hamburguer();
		Thread.sleep(2000);
		otte.ourwork();
		otte.otte();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/94fifty.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=14, enabled=true)
	public void runwaypage() throws InterruptedException { //Runway page
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		runwayPage runway = new runwayPage(driver);
		runway.hamburguer();
		Thread.sleep(2000);
		runway.ourwork();
		runway.runway();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/runway.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=15, enabled=true)
	
	public void leaseapppage() throws InterruptedException { //LeasseApp
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		leaseappPage lease = new leaseappPage(driver);
		lease.hamburguer();
		Thread.sleep(2000);
		lease.ourwork();
		lease.leaseapp();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/leaseapp.html", driver.getCurrentUrl());
	}
	
	
	@Test (priority=16, enabled=true)
	public void mozidopage() throws InterruptedException { //Mozido 
		driver.get("http://dev.talosdigital.com/our-work.html/");	
		mozidoPage mozido = new mozidoPage(driver);
		mozido.hamburguer();
		Thread.sleep(2000);
		mozido.ourwork();
		mozido.mozido();

		Assert.assertEquals("http://dev.talosdigital.com/our-work/mozido.html", driver.getCurrentUrl());
	}
}
