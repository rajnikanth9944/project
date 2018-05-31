package demo2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		System.out.println(driver.getTitle());
		
		WebElement frame=driver.findElement(By.name("classFrame"));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		
		WebElement selenium=driver.findElement(By.xpath(".//*[@class='contentContainer']/table/tbody/tr[5]/td/a"));
		
		selenium.click();
		
		driver.switchTo().defaultContent();
		
		WebElement parent=driver.findElement(By.name("packageFrame"));
		
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(parent));
	    
	    WebElement abst=driver.findElement(By.xpath(".//*[@class='indexContainer']/ul/li[1]/a"));
	    
	    abst.click();
		
		
		
		
		
	}

}
