package com.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.shine.com/register/general/");
    
    WebElement name = driver.findElement(By.cssSelector("   #id_name"));
    WebElement email = driver.findElement(By.id("id_email"));
    WebElement pass = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    WebElement phone = driver.findElement(By.id("id_cell_phone"));
    name.sendKeys("Aswin K Kumar");
    email.sendKeys("aswinajce@gmail.com");
    pass.sendKeys("Aswin@2468");
    phone.sendKeys("9562973858");
    
    WebElement check = driver.findElement(By.id("id_privacy"));
    if (check.isSelected()) {
    check.click();
    }
    check.click();
    WebElement button= driver.findElement(By.xpath("//*[@id=\"registerButton\"] "));
    button.click();
    WebElement error=driver.findElement(By.xpath("//*[@id=\"emailAlreadyExist\"]/a"));
    error.click();
    WebElement Email=driver.findElement(By.xpath("//*[@id=\"id_email_login\"]"));
    Email.sendKeys("aswinajce@gmail.com");
    WebElement password=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    password.sendKeys("Aswin@2468");
    
    WebElement login=driver.findElement(By.cssSelector("#cndidate_login_widget > form > ul.cls_base_1 > li.login_mid2.msitelogin_mid2.mt-3.d-flex.align-items-center.justify-content-between > div > button"));
    login.click();


}

}
