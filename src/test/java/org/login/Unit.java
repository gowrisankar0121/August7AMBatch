package org.login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;                     
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Unit {
public static WebDriver driver;
		
	@BeforeClass
	public static void tc01() {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Successfully Browser Launched");
			
		} catch (Exception e) {
			System.out.println("Not Successfully browser launched");
			
		}
	

	}
	@Before
	public void tc02() throws InterruptedException {
		try {
			driver.get("https://www.facebook.com/login/");
			System.out.println("Successfully URL Launched");
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Not Successfully URL Launched");
			Thread.sleep(3000);
			
		}
		

	}
	
	@Test
	public void tc03() throws InterruptedException {
		try {
			WebElement user=driver.findElement(By.id("email"));
			user.sendKeys("gs0121@gmail.com");
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("Gowri01@");
			System.out.println("successfully invalid credentialsa is entered");
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Not successfully invalid credentialsa is entered");
			Thread.sleep(3000);
		}
	

	}
	
	@After
	public void tc04() {
		try {
			WebElement login= driver.findElement(By.name("login"));
			login.click();
			System.out.println("successfully logedin");
			
		} catch (Exception e) {
			System.out.println("Not successfully logedin");
			
		}
		

	}
	
	@AfterClass
	public static void tc05() {
		try {
			System.out.println("error message is verified");
		} catch (Exception e) {
			System.out.println("error message is not verified");
			
		}

	}
	
}