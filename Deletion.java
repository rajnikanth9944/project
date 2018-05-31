package demo2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deletion {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		driver.get("https://github.com/SeleniumHQ/selenium/tree/master/java/client/src/org/openqa/selenium");
		
		Thread.sleep(3000);
		
		if(wait.until(ExpectedConditions.titleIs("selenium/java/client/src/org/openqa/selenium at master · SeleniumHQ/selenium · GitHub"))){
			
			System.out.println("selenium/java/client/src/org/openqa/selenium at master · SeleniumHQ/selenium · GitHub page displayed");
		}
		else
		{
			System.out.println("unable to find ");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		/*List<WebElement>framee=driver.findElements(By.tagName("iframe"));
		
		int total=framee.size();
		
		System.out.println(total);*/
		
		WebElement html5=driver.findElement(By.xpath(".//a[contains(@href,'/SeleniumHQ/selenium/tree/master/java/client/src/org/openqa/selenium/html5')]"));
		
		html5.click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		WebElement location =driver.findElement(By.xpath(".//a[contains(@title,'Location.java')]"));
		
		location.click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	    WebElement history=driver.findElement(By.xpath(".//*[@class='BtnGroup']/a[3]"));
	    
	     history.click();
	    
	  
	    System.out.println(driver.getCurrentUrl());
	
	    System.out.println(driver.getTitle());
	    
	   
	    
	    
	    WebElement wiki=driver.findElement(By.xpath(".//*[contains(@href,'/SeleniumHQ/selenium/wiki')]"));
	    
		wiki.click();
		
		WebElement chrome=driver.findElement(By.xpath(".//*[contains(@href,'/SeleniumHQ/selenium/wiki/ChromeDriver')]"));
		
		chrome.click();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		WebElement capabilities=driver.findElement(By.xpath(".//*[contains(@href,'https://sites.google.com/a/chromium.org/chromedriver/capabilities')]"));
		
		capabilities.click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		
		WebElement sign=driver.findElement(By.xpath(".//*[@id='sites-chrome-adminfooter-container']/div/p/a"));
		sign.click();
		
		Thread.sleep(1000);
		
		driver.getCurrentUrl();
		
		driver.getTitle();
		
		WebElement uname=driver.findElement(By.name("identifier"));
		
		WebElement next=driver.findElement(By.className("CwaK9"));
		
		next.click();
		
		Thread.sleep(2000);
		
		next.click();
		
		//verify error message
		
	    String expectedError="Enter a valid email or phone number";
	    
	    WebElement msg=driver.findElement(By.className("dEOOab RxsGPe"));
	    
	    String actual=msg.getAttribute("innerHTML");
	    
	    System.out.println(actual);
	    
	    if(expectedError.equals(actual)){
	    	
	    	System.out.println("both matched and test passed");
	    }
	    else
	    {
	    	System.out.println("unable to match text");
	    }
		

	}

}
