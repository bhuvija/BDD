package com.pluralsight; 



import org.openqa.selenium.Alert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class annotation { 
   WebDriver driver = null; 
   @Given("^that I am on github page$") 
	
   public void goToFacebook() { 
	  //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
      driver = new ChromeDriver(); 
      driver.navigate().to("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/login.html"); 
   }
	
   @When("^I enter username as (.*)$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("username")).sendKeys(arg1); 
   }
	
   @And ("^I enter password as (.*)$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("password")).sendKeys(arg1);
   } 
   //username wrong
   @Then ("^I should be logged into my github account$") 
   public void checkPass() {
      driver.findElement(By.id("login")).click();
      //driver.navigate().to("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/login.html");
     Alert alert=driver.switchTo().alert();
      System.out.println(alert.getText());/*
      assertEquals(alert.getText(),"Invalid  Username");*/
   } 
	//pwd wrong
  @Then("^I should relogin$") 
   public void checkFail() {  
      driver.findElement(By.id("login")).click();
     // driver.navigate().to("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/login.html");
    Alert alert=driver.switchTo().alert();
    
    System.out.println(alert.getText());   
   }
  //all correct
  @Then("^I should relogin to success$") 
  public void success() {  
     driver.findElement(By.id("login")).click();
     //driver.navigate().to("file:///D:/Users/byerra/Downloads/demos/m4/after/src/main/webapp/target.html");
    /* Alert alert=driver.switchTo().alert();
     System.out.println(alert.getText());   */ 
    }
	
   /*@Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }*/
} 