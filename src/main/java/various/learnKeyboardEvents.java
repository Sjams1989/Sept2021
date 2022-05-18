package various;


	import static org.junit.Assert.assertTrue;

	import java.util.concurrent.TimeUnit;

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

	
	public class learnKeyboardEvents {
		
		WebDriver driver;
		
		@Before
		public void Init() {
		
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver101.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=login/");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		
		
		@Test
		public void loginTest() {
			
			//two ways to store elements
			
			//1) Store using WebElements
		WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		//ENTER OR RETURN <--SAME THING RETURN IS FOR MAC
		///build and perform is run time compilation
		
		
	
	
	
}} 
