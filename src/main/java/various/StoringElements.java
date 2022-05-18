package various;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class StoringElements {
	
	
	WebDriver driver;
	
	@Before
	public void Init() {
	
	
	
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
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
	
	
	
			//or
	
	//2)Storing using BY CLASS
	
	By USERNAME_FIELD = By.xpath("//*[@id=\"username\"]");
	By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
	By SIGNIN_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");
	By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	By DASHBOARD_SIDE_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	By CUSTOMER_MENU_FIELD = By.xpath("//*[@id=\"side-menu\"]/li[2]/a/span");
	By ADD_CUSTOMER_FIELD = By.xpath("//*[@id='side-menu']/li[3]/ul/li[1]/a");
	
		
	
	
	
	
	//THIS WAY 
	
//PERFORM LOGIN

	USERNAME_ELEMENT.sendKeys("demo@techfios.com");
	PASSWORD_ELEMENT.sendKeys("abc123");
	SIGNIN_BUTTON_ELEMENT.click();
	WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a/span"));
	System.out.println((DASHBOARD_HEADER_ELEMENT).getText());
	Assert.assertEquals("WRONG PAGE!", "Dashboard", (DASHBOARD_HEADER_ELEMENT).getText());
	driver.findElement(DASHBOARD_SIDE_FIELD).click();
	
	
	WebElement Customer_Menu_Element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]"));
	Customer_Menu_Element.click();
	WebElement Add_Customers_Element = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a"));
	WebDriverWait wait = new WebDriverWait (driver,10);
	wait.until(ExpectedConditions.visibilityOf(Add_Customers_Element));
	Add_Customers_Element.click();
	WebElement Contacts_Header = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
	Contacts_Header.getText();
	System.out.println((Contacts_Header).getText());
	Assert.assertEquals("Wrong Page!", "Contacts", driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2")).getText());
	WebElement Full_Name_Blank_Element = driver.findElement(By.xpath("//*[@id=\"account\"]"));
	Full_Name_Blank_Element.sendKeys("Suzanne Sweileh");
	WebElement Company_DropDown_Element = driver.findElement(By.xpath("//*[@id=\"cid\"]"));
	Select sel =new Select(Company_DropDown_Element);
	// below you can insert whatever value on the dropdown lis options to select that specific option during test
	sel.selectByVisibleText("Techfios");
	sel.getOptions();
	
	
	
	
	
	
	
		
	//OR THIS WAY 

//	driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
//	driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
//	driver.findElement(SIGNIN_FIELD).click();
		
	//WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
	
	
	
	//.getText helps us get text out of any webElement ---- it printed Dashboard
	
	//System.out.println(DASHBOARD_HEADER_ELEMENT.getText());
	//Assert.assertEquals("Wrong Page", "Dashboard", DASHBOARD_HEADER_ELEMENT.getText());
	//WebElement CUSTOMER_SIDEMENU = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a/span"));
	//CUSTOMER_SIDEMENU.click();
	//WebElement ADD_CUSTOMER = driver.findElement(By.xpath("//*[@id='side-menu']/li[3]/ul/li[1]/a"));
	//ADD_CUSTOMER.click();
	//Assert.assertEquals("Wrong Page!", "Customer", ADD_CUSTOMER.getText());
	//System.out.println(ADD_CUSTOMER.getText());
	
		
	}

}
