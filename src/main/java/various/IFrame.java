package various;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class IFrame {
		
		
		WebDriver driver;
		
		@Before
		public void Init() {
		
		
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		
		@Test
		public void loginTest() {
		
			
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("java.awt.color")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("ColorSpace")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("classFrame");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/dl[2]/dd/a")).getText();
			String Text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/dl[2]/dd/a")).getText();
			System.out.println(Text);
			
	
			
			
			
			
	
	
		}
	
		}

