package demo2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browsers {
	
public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	WebDriverWait wait=new WebDriverWait(driver,60);
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://www.abc.co.in/");
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	
	String parent=driver.getWindowHandle();
	
	System.out.println("parent window handles"+parent);
	
	Set<String>handles=driver.getWindowHandles();
	
	Iterator<String>itr=handles.iterator();
	
	String parentwindow=itr.next();
	
	System.out.println(parentwindow);
	
	
	
	
	
	
	
	
}

}
