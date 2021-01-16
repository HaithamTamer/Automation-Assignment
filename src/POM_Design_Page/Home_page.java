package POM_Design_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;

public class Home_page {
	
	
	public WebElement SignInBtn (WebDriver driver)
	{
		return driver.findElement(By.id("gb_70"));
		
	}
	
	public WebElement GoogleSerch (WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@maxlength=\"2048\"]"));
		
	}
	

}
