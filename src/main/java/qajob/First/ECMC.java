package qajob.First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ECMC{

 public void checkout() throws InterruptedException
	{
	 WebDriver driver; 
	 driver=new EdgeDriver();
     System.setProperty("EdgeDriver Path","\\C:\\Users\\mehar\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe\\");
	 
     driver.get("https://www.saucedemo.com/");
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/img[1]")).click();
     driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	 driver.findElement(By.id("checkout")).click();
	 driver.findElement(By.id("first-name")).sendKeys("hassan");
	 driver.findElement(By.id("last-name")).sendKeys("iqbal");
	 driver.findElement(By.id("postal-code")).sendKeys("54000");
     driver.findElement(By.id("continue")).click();
	 driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']")).click();
	 driver.findElement(By.id("back-to-products")).click();
	 
     //  driver.get("https://www.zappos.com/");
	  //  driver.findElement(By.xpath("//a[@data-shyguy='navSale']")).click();
	  //  driver.findElement(By.xpath("//*[@aria-label='Close Sale Menu']")).click();
	 //   driver.findElement(By.xpath("//a[@data-eventlabel='Hero']")).click();
	   //Thread.sleep(5000);
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.findElement(By.xpath("//a[@data-style-id='6139835']")).click();
      //  driver.findElement(By.cssSelector("span[xpath='1']")).click();
      //  driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
       // driver.findElement(By.id("cartCount")).click();
     
     
     
    /* driver.get("https://www.blackstarpastry.com/");
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("a[class='news-popup--close']")).click();
     driver.findElement(By.cssSelector("svg[width='48']")).click();
     */
     
     
     

	}
}

