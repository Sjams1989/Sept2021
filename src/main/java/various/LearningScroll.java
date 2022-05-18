package various;





import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LearningScroll {
	
	WebDriver driver;
	
	@Before
	public void Init() {
	
	
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	
	
	@Test
	public void testScroll() throws InterruptedException {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0, 5000)");
	
	Thread.sleep(3000);
	
	js.executeScript("scroll(0, 3000)");
	
	
	}}