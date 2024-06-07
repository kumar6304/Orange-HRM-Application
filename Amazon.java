package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./WebDriver1/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		//Url address is to assigned to a variable
		
		String applicationUrlAddress="http://amazon.in";
	
		//Navigating Url address to OrangeHRM application
		driver.get(applicationUrlAddress); 
		driver.manage().window().maximize(); 
/*		 
		By  hellosigninProperty=By.id("nav-link-accountList-nav-line-1");
		WebElement hellosignin=driver.findElement(hellosigninProperty);
		
		Actions action = new Actions(driver);
		action.moveToElement(hellosignin).build().perform();
		
		By youraccountProperty=By.linkText("Your Account");
		WebElement yourAccount=driver.findElement(youraccountProperty);
		yourAccount.click();
		
		By  hellosigninProperty1=By.id("nav-link-accountList-nav-line-1");
		WebElement hellosignin1=driver.findElement(hellosigninProperty1);
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(hellosignin1).build().perform();
		
		By youerOrdersProperty=By.linkText("Your Orders");
		WebElement youerOrders=driver.findElement(youerOrdersProperty);
		youerOrders.click();
		
		/*
		  action.sendKeys(Keys.TAB).build().perform();
		
		action.sendKeys(Keys.ENTER).build().perform();
	//
		 */
		
		
	  By serchboxProperty=By.id("twotabsearchtextbox");
	  WebElement serchbox=driver.findElement(serchboxProperty);
	  serchbox.sendKeys("Mobiles");
	  
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.ENTER).build().perform();
	  
	  
	}

}
