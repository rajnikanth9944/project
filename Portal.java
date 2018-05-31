package demo2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;

public class Portal {

	public static void main(String[] args) throws InterruptedException, AWTException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		driver.navigate().to("http://portal.pipercube.com/login_page.php");
		
		if(wait.until(ExpectedConditions.titleIs("PiperCube BT"))){
			
			System.out.println("PiperCube BT page displayed");
		}
		else
		{
			System.out.println("unable to find page");
		}
		
		WebElement username=driver.findElement(By.id("username"));
		
		WebElement password=driver.findElement(By.id("password"));
		
		username.clear();
		
		password.clear();
		
		String s1="Zeva_admin";
		
		String s2="Zeva@health";
		
		username.sendKeys(s1);
		
		password.sendKeys(s2);
		
		
		WebElement check=driver.findElement(By.id("remember-login"));
		
		check.click();
		
		WebElement login=driver.findElement(By.xpath("//*[contains(@class,'submit')]"));
				
		login.click();
		
		Thread.sleep(2000);
		
		if(wait.until(ExpectedConditions.titleIs("My View - PiperCube BT"))){
			
			System.out.println("My View - PiperCube BT page dispalyed");
		}
		else
		{
			System.out.println("unable to find");
		}
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		int total=link.size();
		
		System.out.println(total);
		
		for(int i=0;i<link.size();i++){
			
			WebElement element=link.get(i);
			
			String innerhtml=element.getAttribute("innerHTML");
			
			System.out.println(innerhtml);
			
			if(innerhtml.contentEquals("View Issues")){
				
				element.click();
				
				break;
			}
		}
		
		Thread.sleep(2000);
		
		if(wait.until(ExpectedConditions.titleIs("View Issues - PiperCube BT"))){
			
			System.out.println("View Issues - PiperCube BT page displayed");
		}
		else
		{
			System.out.println("unable to find page");
		}
		
		WebElement fifty=driver.findElement(By.xpath(".//*[@id='buglist']/tbody/tr[10]/td[4]/a"));
		
		fifty.click();
		
		WebElement upload=driver.findElement(By.id("ufile[]"));
		
		upload.click();
		
		
		Robot rt=new Robot();
		
		rt.setAutoDelay(2000);
		
		StringSelection sel=new StringSelection("C:\\Users\\Public\\new\\selenium.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
	    rt.keyPress(KeyEvent.VK_CONTROL);
	    
	    rt.keyPress(KeyEvent.VK_V);
	    
	    rt.keyRelease(KeyEvent.VK_CONTROL);
	    
	    rt.keyRelease(KeyEvent.VK_V);
	    
	    rt.setAutoDelay(2000);
	    
	    rt.keyPress(KeyEvent.VK_ENTER);
	    
	    System.out.println("file successfully uploaded");
	    
	    driver.navigate().back();
	    
	    WebElement mantis=driver.findElement(By.xpath(".//*[contains(@src,'/images/mantis_logo.png')]"));
	    
	    mantis.click();
	    
	    if(wait.until(ExpectedConditions.titleIs("Mantis Bug Tracker"))){
	    	
	    	System.out.println("Mantis Bug Tracker page displayed");
	    
	    }
	    else
	    {
	    	System.out.println("unable to find");
	    }
	    
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    
	    int totals=links.size();
	   
	    System.out.println(totals);
	    
	    for(int i=0;i<links.size();i++){
	    	
	    	WebElement elements=links.get(i);
	    	
	    	String innerhtmls=elements.getAttribute("innerHTML");
	    	
	    	System.out.println(innerhtmls);
	    	
	    	if(innerhtmls.equals("Hosting")){
	    		
	    		elements.click();
	    		
	    		break;
	    	}
	    }
	   
	    if(wait.until(ExpectedConditions.titleIs("Mantis Bug Tracker | MantisBT Hosting"))){
	    	
	    	System.out.println("Mantis Bug Tracker | MantisBT Hosting page displayed");
	    }
		
	}
}
