package qajob.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
      //  System.out.println( "Hello World!" );
    	WebDriver driver;
    	driver =new EdgeDriver();
    	System.setProperty("EdgeDriver Path","C:\\Users\\mehar\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
    	//driver.get("https://www.facebook.com/");
    	//driver.findElement(By.id("email")).sendKeys("chahatiqbal44@yahoo.com");
    	//driver.findElement(By.id("pass")).sendKeys("ghulamhassan123");
    	//driver.findElement(By.name("login")).click();
    	//Thread.sleep(25);
    	//driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
    //	Thread.sleep(35);
    	//driver.findElement(By.cssSelector("div[data-nocookies='true'] i[class='x1b0d499 xep6ejk']")).click();
    	
    	driver.get("https://www.instagram.com/");
    	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("chahatiqbal44@yahoo.com");
    	
    	
    	
    	
    }
}
