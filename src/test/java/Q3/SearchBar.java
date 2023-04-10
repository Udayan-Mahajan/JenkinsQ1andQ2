package Q3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBar {
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
	public void Searchtest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("comic book");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		String price ="Jean-Yves Ferri";
		String actual = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div/a")).getText();
		Assert.assertEquals(actual, price);
	}
	@Test
	public void testSearchPage() {
		String searchTerm = "toothpaste";
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(searchTerm);
		searchBox.submit();
		String expectedTitle = "Amazon.in : " + searchTerm;
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
