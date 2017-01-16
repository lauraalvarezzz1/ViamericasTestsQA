package TestIDE;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firstTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "/Users/talosdigital/Downloads/geckodriver");
    driver = new FirefoxDriver();
    baseUrl = "http://dev.talosdigital.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFirst() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.id("tw_go_top_btn")).click();
    driver.findElement(By.linkText("READ MORE")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("div.tw-slide-4-text > a")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.linkText("CONTACT US")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Turn-key Solved")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Rightsourcing")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Hybris")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.reddy > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.reddy > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.nfifty > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.lease > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.runway > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.runway > a > div.tw-project-item-overlay")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("div.tw-project-item.mozido > a > div.tw-project-heading-wp > h3")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("div.tw-sidebar-inner > a > img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("div.tw-sidebar-inner > a > img.logo")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("i.icon.icn-linkedin-menu")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("i.icon.icn-facebook-menu")).click();
    driver.findElement(By.cssSelector("i.icon.icn-facebook-menu")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Turn-key Solved")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.id("tw_go_top_btn")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Rightsourcing")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.linkText("Learn more about Hybris")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Hybris")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.cssSelector("div.tw-ui-mask-modal")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Our Work")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.cssSelector("div.tw-project-item-overlay")).click();
    driver.findElement(By.linkText("Reddy")).click();
    driver.findElement(By.linkText("94fifty")).click();
    driver.findElement(By.linkText("Lease app")).click();
    driver.findElement(By.linkText("Runway")).click();
    driver.findElement(By.linkText("Mozido")).click();
    driver.findElement(By.linkText("Otte")).click();
    driver.findElement(By.linkText("Mozido")).click();
    driver.findElement(By.linkText("Runway")).click();
    driver.findElement(By.linkText("Lease app")).click();
    driver.findElement(By.linkText("94Fifty")).click();
    driver.findElement(By.linkText("Reddy")).click();
    driver.findElement(By.linkText("Otte")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("Laura");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("laura.alvarez@talosdigital.com");
    driver.findElement(By.id("subject")).clear();
    driver.findElement(By.id("subject")).sendKeys("Hola");
    driver.findElement(By.id("message")).clear();
    driver.findElement(By.id("message")).sendKeys("Hola");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("laura");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("laura.alvareztalosdigital.com");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("laura.alvarez@talosdigital.com");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.id("subject")).clear();
    driver.findElement(By.id("subject")).sendKeys("hi");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.id("message")).clear();
    driver.findElement(By.id("message")).sendKeys("hi");
    driver.findElement(By.cssSelector("button.contact-submit-btn")).click();
    driver.findElement(By.linkText("info@talosdigital.com")).click();
    driver.findElement(By.cssSelector("i.icon.icn-email")).click();
    driver.findElement(By.cssSelector("i.icon.icn-facebook")).click();
    driver.findElement(By.cssSelector("i.icon.icn-linkedin")).click();
    driver.findElement(By.id("tw_go_top_btn")).click();
    driver.findElement(By.cssSelector("button.hamburger.hamburger--squeeze")).click();
    driver.findElement(By.linkText("Blog")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Read More')])[2]")).click();
    driver.findElement(By.cssSelector("i.icn-chevron-down-light")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("NEXT POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.linkText("PREVIOUS POST")).click();
    driver.findElement(By.id("tw_go_top_btn")).click();
    driver.findElement(By.id("tw_go_top_btn")).click();
    driver.findElement(By.cssSelector("img.logo")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
