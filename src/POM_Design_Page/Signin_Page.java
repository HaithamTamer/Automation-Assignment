package POM_Design_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_Page {

	public WebElement EmailField (WebDriver driver)
	{
		return driver.findElement(By.cssSelector("input[aria-label=\"Email or phone\"]"));
		
	}

	public WebElement NextBtn(WebDriver driver ) {
	
	return driver.findElement(By.xpath("//button[@jscontroller=\"soHxf\" and @jsname=\"LgbsSe\"]"));
	
}

	public WebElement Error_msg(WebDriver driver ) {
		
	return driver.findElement(By.xpath("//div[@jsname=\"B34EJ\"]/div[@class=\"o6cuMc\"]"));
	
}
	
	
	public WebElement ForGotEmailBTN(WebDriver driver)
	{
		return	driver.findElement(By.xpath("//button[@jsname=\"Cuz2Ue\"]"));
		
	}
	
}