package POM_Design_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import POM_Design_Page.Home_page;
import POM_Design_Page.Signin_Page;

public class T_01_How_To_Locate_Elements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Launch_Browser();

		Login_With_Invalid_Email();

		Verify_Forgot_Email_URL();

		Google_Search();

		Close_Driver();

	}

//Before Test
	public static void Launch_Browser() {

		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/?hl=ar");

		driver.findElement(By.partialLinkText("Eng")).click();
	}

//Test Case 1: Login without using email field
	public static void Login_With_Invalid_Email() throws InterruptedException {
		Home_page home = new Home_page();
		home.SignInBtn(driver).click();

		Signin_Page Signin = new Signin_Page();
		Signin.EmailField(driver).sendKeys("d");

		Signin.NextBtn(driver).click();

		Thread.sleep(2000);

		/*
		  String actualResult;
		actualResult = Signin.Error_msg(driver).getText();

		System.out.println(actualResult);
		System.out.println(actualResult.contains("Couldn't find your Google Account"));
		*/
		

	}

//Test Case 2: Get forget email url
	public static void Verify_Forgot_Email_URL() {

		Signin_Page Signin = new Signin_Page();
		Signin.ForGotEmailBTN(driver).click();
		String actualResult;
		actualResult = driver.getCurrentUrl();

		System.out.println(actualResult);
		System.out.println(actualResult.contains("/signin/v2/usernamerecovery"));

	}

//Test Case 3: Google Search
	public static void Google_Search() {

		Home_page GoogleSerch = new Home_page();
		driver.navigate().to("https://www.google.com/?hl=eng");
		GoogleSerch.GoogleSerch(driver).sendKeys("selenium");

		GoogleSerch.GoogleSerch(driver).sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.id("result-stats")).getText());
		System.out.println(driver.findElement(By.id("result-stats")).getText().contains("46,200,000"));

	}

//After Test
	public static void Close_Driver() {
		driver.quit();

	}

}
