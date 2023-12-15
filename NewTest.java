package co.edurekatraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	//create reference variable for WebDriver
		WebDriver driver;
	
	@Test(priority = 1)
	public void facebookTest() throws InterruptedException
	{
		//setup the path for browser
		System.setProperty("webdriver.gecko.driver", "..\\SeleniumAutomation\\Drivers\\geckodriver.exe");
				
		//Launch the light and empty browse
		        driver = new FirefoxDriver();
				
		//Launching facebook.com on browser
				driver.get("https://www.facebook.com/");
				
		//Maximize the browser window
				driver.manage().window().maximize();
				
		//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Capture the email WebElement
				WebElement email = driver.findElement(By.id("email"));
				
		//Write email id 
				email.sendKeys("abc@gmail.com");
		
		//Verify on which page we are 
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Current URL =" +currentUrl);
		
		//Current title of the website
		
		String actualTitle = driver.getTitle();
		
		//Java wait 
		Thread.sleep(3000);
		
		if (actualTitle.contains("Facebook"))
		{
			System.out.println("Test Pass --> User is on facebook landing page");
		}
		else
		{
			System.out.println("Test Fail --> User is not on facebook landing page");
		}

		
		//Click on login Button
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name ='login']"));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		
		//close the browser
		driver.quit();
		
	}
	
	
	@Test(priority = 2)
	public void googleTest() throws InterruptedException
	
	{
		//setup the path for browser
		System.setProperty("webdriver.gecko.driver", "..\\SeleniumAutomation\\Drivers\\geckodriver.exe");
				
		//Launch the light and empty browse
		   driver = new FirefoxDriver();
		
		//Launching google.com on browser
		   driver.get("https://www.google.com/");
		   
		//maximize the browser window
		   driver.manage().window().maximize();
		   
	
		//Java Wait
		 Thread.sleep(4000);
		   
		//Capture the Search WebElement
		  WebElement search =  driver.findElement(By.name("q"));
		  
		//Write something in search field
		  search.sendKeys("Selenium Java");
		  
		  
	    //Java Wait
		  Thread.sleep(20000);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(20000);
		  
		 //close the browser
		 driver.quit();
		  
		 
	}
	
	
	@Test(priority = 3)
	public void googleTestImplicitWait() throws InterruptedException
	{
		//setup the path for browser
		System.setProperty("webdriver.gecko.driver", "..\\SeleniumAutomation\\Drivers\\geckodriver.exe");
				
		//Launch the light and empty browse
		   driver = new FirefoxDriver();
		
		//Launching google.com on browser
		   driver.get("https://www.google.com/");
		   
		//maximize the browser window
		   driver.manage().window().maximize();
		   
		//implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		   
		//Capture the Search WebElement
		   WebElement search =  driver.findElement(By.name("q"));
			  
	    //Write something in search field
		   search.sendKeys("Eclipse");
		 
		   
	   //implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60000));
		   search.sendKeys(Keys.ENTER);
		   Thread.sleep(60000);
		   
	  // close the broswer
		   driver.quit();
	}
	
	
}
