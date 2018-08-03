package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/CheckboxTest.html");
		driver.get("https://www.github.com/login");
		/*WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		
		checkbox.click();
		checkbox.click();*/

		WebElement searchField1=driver.findElement(By.id("login_field"));
		searchField1.sendKeys("bhuvijayerra@gmail.com");
		
		WebElement searchField2=driver.findElement(By.id("password"));
		searchField2.sendKeys("yerra@123");
		/*WebElement searchField3=driver.findElement(By.name("commit"));
		searchField3.submit();*/
	}

}
