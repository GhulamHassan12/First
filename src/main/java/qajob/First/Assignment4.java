package qajob.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////Open facebook.com application using edge and Firefox browser.//////////////
		
		WebDriver driver;
	//	driver=new FirefoxDriver();
	//	System.setProperty("FirefoxDriver", "C:\\Users\\mehar\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe\\");
	//	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver=new EdgeDriver();
		System.setProperty("EdgeDriver Path","C:\\Users\\mehar\\Downloads\\MicrosoftEdgeSetup.exe\\");
	//	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	//	driver.findElement(By.id("session_key")).sendKeys("gh035772@gmail.com");
	//	driver.findElement(By.id("session_password")).sendKeys("ghulamhassan123*");
	//	driver.findElement(By.id("homepage-basic_sign-in-submit-btn")).click();
		
	//	String parenthandle=driver.getWindowHandle();
	//	System.out.println(parenthandle);
	//	driver.findElement(By.id("newWindowsBtn")).click();
	//	Set<String> handle=driver.getWindowHandles();
    //    System.out.println(handle);
        
        
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.id("query")).click();
	}

}
