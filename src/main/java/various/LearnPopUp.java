package various;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPopUp {
		
		
		WebDriver driver;
		
		@Before
		public void Init() {
		
		
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver101.exe");
		driver = new ChromeDriver();
		driver.get("https:mail.rediff.com/cgi-bin/login.cgi");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		
		@Test
		public void loginTest() throws InterruptedException {
		WebElement Sign_In_Element = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]"));
			Sign_In_Element.click();
			Thread.sleep(3000);
		String Msg = 	driver.switchTo().alert().getText();
		System.out.println(Msg);
		driver.switchTo().alert().accept();
		
		
			
			
			
		}
			
}
