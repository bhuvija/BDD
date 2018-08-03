package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/login.html");
		WebElement button=driver.findElement(By.id("Login"));
		button.click();
	}

}
