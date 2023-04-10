package Amazon.com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tushr Gupts\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://new-tab-page/\"");
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.tagName("ntp-app"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		SearchContext ele1 = (SearchContext)js.executeScript("return arguments[0].shadowRoot", ele);
		Thread.sleep(2000);
		WebElement ele2=ele1.findElement(By.tagName("ntp-realbox"));
		SearchContext ele3 = (SearchContext)js.executeScript("return arguments[0].shadowRoot", ele2);
		Thread.sleep(2000);
		
		ele3.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("apple");
		Thread.sleep(2000);
    }
}
