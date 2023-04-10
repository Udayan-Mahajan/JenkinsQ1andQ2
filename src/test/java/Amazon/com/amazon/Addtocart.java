package Amazon.com.amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addtocart {
	private static WebDriver driver ;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushr Gupts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.in/");
	}
  @Test
  public void Addtocarttest() {
	  driver.findElement(By.id("nav-cart")).click();
	  String expectstr = "Your Amazon Cart is empty";
	  String actualstr= driver.findElement(By.xpath("(//h2)[1]")).getText();
	  Assert.assertEquals(actualstr, expectstr);
	  
	  
  }
//  @Test
//  public void Add() throws InterruptedException {
//	  String searchTerm = "toothpaste";
//	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	  searchBox.sendKeys(searchTerm);
//	  searchBox.submit();
//	  
//	  driver.findElement(By.xpath("//h2[1]//a[1]")).click();
//	  Set<String> allhandles = driver.getWindowHandles();
//	  driver.switchTo().window(allhandles.stream().toList().get(1)); //switching to the new tab
//	  
//	  driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
//	  
//	  String expectedmessage1 = "Added to Cart";
//	  String actualmessage1 = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
//	  Assert.assertEquals(actualmessage1, expectedmessage1); // asserting that item is added message is there
//	  
//	  driver.findElement(By.id("nav-cart-count-container")).click();// going back to cart
//	  
//	  Assert.assertTrue(driver.findElement(By.xpath("//form[@id='activeCartViewForm']")).isDisplayed()); // assert that there are some items in cart
//	  
//	  Thread.sleep(10000);
			  
	  
	  
//  }
}
