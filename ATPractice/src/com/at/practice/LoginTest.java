package com.at.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

 	
  	   @Test (dataProvider="getData")
	   public void dLogin (String userName, String passWord) {
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://login.salesforce.com/?locale=in");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userName);
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys(passWord);
	    driver.findElement(By.xpath("//*[@id='Login']")).click();
	    
	    Assert.assertEquals("user1", userName);
	    
	   }
	   
	   @DataProvider
	   public Object[][] getData() {
	    
	    Object[][] data= new Object[3][2];

	    //1st Row
	    data[0][0] = "User1";
	    data[0][1] = "Password1";
	    
	    //2nd Row
	    data[1][0] = "User2";
	    data[1][1] = "Password2";
	    
	    //3rd Row
	    data[2][0] = "User3";
	    data[2][1] = "Password3";
	    
	    return data;
	   }
	}
  