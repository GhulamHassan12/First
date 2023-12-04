package qajob.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new EdgeDriver();
		System.setProperty("EdgeDriver Path","C:\\Users\\mehar\\Downloads\\MicrosoftEdgeSetup.exe\\");
	/////////////	driver.get("https://www.w3schools.com/");
	//	driver.findElement(By.id("tnb-google-search-input")).click();
	//	driver.findElement(By.tagName("input")).click();
	//////////////////	driver.get("https://www.google.com/");
	//	driver.findElement(By.className("gLFyf")).click();
	//	driver.findElement(By.name("q")).sendKeys("love u");
	////////////////	driver.get("https://www.facebook.com/");
	//	driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		////////////////////css selector///////////////////
		
	//	driver.get("https://www.google.com/");
	//	driver.findElement(By.cssSelector("#APjFqb")).click();
	//	driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("intellegent");
	//	driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("hassan");
	//	driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("humayun");
		
		//////////////////////Xpath////////////////////////////////////////
		
	//	driver.get("https://www.facebook.com/");
	//    driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	    
	    /////////////////////Relative Path/////////////
	    driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("junaid");
		
		
	}

}
