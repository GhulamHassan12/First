package qajob.First;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandleframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
	//	System.setProperty("WebDriver.gecko.driver","C:\\Users\\mehar\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe\\");
	//	driver=new FirefoxDriver();
		driver=new EdgeDriver();
		System.setProperty("EdgeDriver Path","C:\\Users\\mehar\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	//	String parenthandle=driver.getWindowHandle();
	//	System.out.println(parenthandle);
	//	driver.findElement(By.id("newWindowBtn")).click();
		//Set<String> handles=driver.getWindowHandles();
		//System.out.println(handle);
		//driver.close();
		//for(String handle :handles)
	//	{
			//System.out.println("handle");
		   // if(!handle.equals(parenthandle))
			//{
				//driver.switchTo().window(handle);
		    	//driver.findElement(By.id("firstName")).sendKeys("QA");
		    	//Thread.sleep(2000);
		    	
			//}
        //}
		//driver.switchTo().window(parenthandle);
		//driver.findElement(By.id("name")).sendKeys("hassan");
		//Thread.sleep(3000);
		
		/////////////////////////////frame////////////////////////
		
		//driver.get("https://blogpendingtasks.blogspot.com//p/?m=0");
		//driver.switchTo().frame("navbar-iframe");
		//driver.findElement(By.id("b-query")).click();
		
		
		
	}

}
