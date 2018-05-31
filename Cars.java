package demo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cars {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.carmax.com/");
		
		System.out.println(driver.getTitle());
		
		WebElement carsale=driver.findElement(By.xpath(".//*[@class='global-nav']/ul/li[1]/a"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold().moveToElement(carsale).build().perform();
		
		WebElement carmax=driver.findElement(By.xpath(".//*[@class='global-nav--item--subnav']/ul/li[3]/a"));
		
		carmax.click();
		
		Thread.sleep(4000);
		
		if(wait.until(ExpectedConditions.titleIs("Why You Should Buy a Used Car from CarMax"))){
			
			System.out.println("Why You Should Buy a Used Car from CarMax page displayed");
			
		}
		else
		{
			System.out.println("unable to find page");
		}
		
		
		WebElement rightcar=driver.findElement(By.xpath(".//*[@class='sell-us-your-car--item--copy']/p/a[1]"));
		
		rightcar.click();
		
		if(wait.until(ExpectedConditions.titleIs("Used Cars for Sale - CarMax"))){
			
			System.out.println("Used Cars for Sale - CarMax page displayed");
		}
		else
		{
			System.out.println("Used Cars for Sale - CarMax page displayed");
		}
		
		WebElement research=driver.findElement(By.id("researchMenu']"));
		
		act.clickAndHold().moveToElement(research).build().perform();
		
		/*WebElement articles=driver.findElement(By.xpath(".//*[@class='global-nav--item--subnav']/li[3]/a"));
		
		articles.click();
		
		*/
		
		
		
		
	}

}
