package various;


	import static org.junit.Assert.assertTrue;

	import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import junit.framework.Assert;

	
	public class LearnMouseHover {
		
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
		public void testMouseHover() {
			
		WebElement PRODUCTS_Element = driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/a/span"));
		WebElement MONITORS_Element = driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/a"));
		WebElement FORHOME_Element = driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[11]/ul/li[3]/a"));
	 
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCTS_Element).build().perform();
		action.moveToElement(MONITORS_Element).build().perform();
		action.moveToElement(FORHOME_Element).build().perform();
		
		FORHOME_Element.click();
		
		WebElement MAMA_Element = driver.findElement(By.xpath("//*[@id=\"snp-category-header\"]/div/div[2]/h1"));
		Assert.assertEquals("Wrong Page!", "Monitors & Monitor Accessories", MAMA_Element.getText());
		System.out.println(MAMA_Element.getText());
		
		}
		
	//@After
	//	private void teardown() {

	//		driver.close();
		
	}