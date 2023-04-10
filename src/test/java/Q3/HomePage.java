package Q3;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	private static WebDriver driver ;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushr Gupts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.in/");
	}
  @Test
  public void hometitle() {
	  String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle);
	  
  }
@Test  
public void checkurl() {
	 String expectedURL = "https://www.amazon.in/";
	  String actualURL = driver.getCurrentUrl();
	  System.out.println(actualURL);
	  Assert.assertEquals(actualURL, expectedURL);; // asserting that we land on right url
	  
	  Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed()); // assert that main logo is dsiplayed

}
  @Test
  public void todaysdeals()
  {
	  driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
	  String actualstr =driver.findElement(By.xpath("//h1")).getText();
	  String expectstr = "Today's Deals";
	  Assert.assertEquals(actualstr, expectstr);
  }
  @AfterTest
  public void close() {
	  driver.quit();
  }
}
