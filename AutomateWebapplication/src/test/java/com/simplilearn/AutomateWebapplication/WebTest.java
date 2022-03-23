package com.simplilearn.AutomateWebapplication;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class WebTest {
	WebDriver driver;
	@Test(groups = "chrome")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	
	WebElement email=driver.findElement(By.name("email"));
	WebElement login=driver.findElement(By.xpath("//*[@id=\"continue\"]"));

	
	email.sendKeys("9562973858");
		login.click();
	
	WebElement password=driver.findElement(By.name("password"));
	WebElement submit=driver.findElement(By.className("a-button-input"));
	{
		password.sendKeys("Aswin@2468");
	}
	submit.click();
	}
	@Test(groups="Chrome", dependsOnMethods = "login")
	public void cart()
	{
		WebElement cart=driver.findElement(By.cssSelector("#nav-cart-count-container"));
		cart.click();
	driver.close();
	}
	

	}
	

 
