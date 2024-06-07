package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon22 {
	public static void main(String[] args) {
		
  /*      System.setProperty("webdriver.edge.driver","./WebDrivers/msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
		//Url address is to assigned to a variable
		
		String applicationUrlAddress="https://www.osmania.ac.in/";
	
		//Navigating Url address to OrangeHRM application
		driver.get(applicationUrlAddress); 
		driver.manage().window().maximize(); 
		
	By selectLanguagesProperty=By.id("gtranslate_selector");
	WebElement selectLanguage=driver.findElement(selectLanguagesProperty); 
	
	Select select = new Select(selectLanguage);
	select.selectByVisibleText("Hindi");
	select.selectByValue("en|te");
	select.selectByVisibleText("Japanese");
	
	*/
		
		
		
		
		String array1[][] = new String[2][2];
		
		 array1[0][0]="Vishnu";   // vishnu | manual testing
		 array1[0][1]="Manual Testing";  //  srini | Automation testing
			
		 array1[1][0]="Srini";
		 array1[1][1]="Automation Testing";
		 
	/*	 System.out.println(array1[0][0]);
		 System.out.println(array1[0][1]);
			
		 System.out.println(array1[1][0]);
		 System.out.println(array1[1][1]);
			
	*/	
		for(int rowindex=0;rowindex<2;rowindex++)
		{
			for(int cellindex=0;cellindex<2;cellindex++)
			{
				System.out.println(array1[rowindex][cellindex]+" | ");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	
	}

}
