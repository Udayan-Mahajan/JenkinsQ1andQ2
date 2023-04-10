package Q3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ques3 {
	private static WebDriver driver ;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushr Gupts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.in/");
	}
	//  @Test
	//  public void Homepage() throws InterruptedException {
	////	  for todays deals
	//	  driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
	//	  Thread.sleep(2000);
	//	  driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
	//	  Thread.sleep(3000);
	//	  
	////	  for signin
	//	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//	  Thread.sleep(2000);
	//	  driver.navigate().back();
	//	  Thread.sleep(2000);
	//	  driver.navigate().back();
	//	  Thread.sleep(2000);
	//	  
	//	  driver.findElement(By.id("nav-hamburger-menu")).click();
	//	  Thread.sleep(2000);
	//	  
	//  }
	// @Test 
	//  public void SearchBar() throws InterruptedException {
	//	  WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	//	  search.sendKeys("iphone");
	//	  driver.findElement(By.id("nav-search-submit-button")).click();
	//	  Thread.sleep(2000);
	//	  WebElement drop =driver.findElement(By.id("searchDropdownBox"));
	//	  Select s =  new Select(drop);
	//	  s.selectByVisibleText("Baby");
	//	  Thread.sleep(2000);
	//	  driver.findElement(By.id("nav-search-submit-button")).click();
	//  }

	@Test
	public void addtocart() throws InterruptedException {
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//img[@src='https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/61VuVU94RnL._AC_UY218_.jpg'])[1]")).click();
		Set<String> we = driver.getWindowHandles();
		driver.switchTo().window(we.stream().toList().get(1));

	}
}
