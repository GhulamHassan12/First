package qajob.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Initilze the Geko Driver
		WebDriver driver;
		//System.setProperty("WebDriver.gecko.driver","C:\\Users\\mehar\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe\\");
		//driver=new FirefoxDriver();
		driver=new EdgeDriver();
		System.setProperty("EdgeDriver Path","C:\\Users\\mehar\\Downloads\\MicrosoftEdgeSetup.exe\\" );
		driver.get("https://www.facebook.com/");
		//driver.close();
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("chahatiqbal44@yahoo .com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("ghulamhassan123");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
	}

}
