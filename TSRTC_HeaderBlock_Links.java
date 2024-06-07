package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HeaderBlock_Links {

	public static void main(String[] args) {
		
		WebDriver Driver;
		
		//automating ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./WebDriver1/chromedriver.exe");
		
		//Url Addresss is assigned to the variable
		String applicationURLAddresss="https://www.tsrtconline.in/oprs-web/";
		
		ChromeDriver driver=new ChromeDriver();
		
		//Navigating to the Url Address tsrtc application homepage
		driver.get(applicationURLAddresss);
		
		//maximimg the browser
		driver.manage().window().maximize();
		
		//property of the headerblock of the tsrtc application homepage
		//classclass="menu-wrap"
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement   tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" 
				//title="Cancelled Services">Cancelled Services</a>
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do"
		 //target="_top" title="Tourism">Tourism</a>
		
		//identifying the element in the headerBlock
		By tsrtc_HeaderBlockLinksProperty=By.tagName("a");
		List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
		
		int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
		System.out.println("The number header links of the tsrtc application homepage is:-"+tsrtc_HeaderBlockLinksCount);
		
		for(int arrayindex=0;arrayindex<tsrtc_HeaderBlockLinksCount;arrayindex++)
		{
			String tsrtc_HeaderBlockLinksNames=tsrtc_HeaderBlockLinks.get(arrayindex).getText();
			
			System.out.println(arrayindex+"  -"+tsrtc_HeaderBlockLinksNames);
			
			String expected_headerBlocklinksUrlAddress=tsrtc_HeaderBlockLinks.get(arrayindex).getAttribute("href");
			System.out.println("The expected url address of the links is:-"+expected_headerBlocklinksUrlAddress);
			
			tsrtc_HeaderBlockLinks.get(arrayindex).click();
			
			driver.navigate().back();
			
			String tsrtc_headerBlockApplicationhomepageTitle=driver.getTitle();
			System.out.println("The title of the tsrtc application homepage is:-"+tsrtc_headerBlockApplicationhomepageTitle);
			
		     String	Actual_tsrtcapplicationHomepageUrlAddress=driver.getCurrentUrl();
		     System.out.println("The actual url address of the tsrtc application homepage is:-"+Actual_tsrtcapplicationHomepageUrlAddress);
			
		     if(Actual_tsrtcapplicationHomepageUrlAddress.equals(expected_headerBlocklinksUrlAddress))
		     {
		    	 System.out.println("successfully navigating to expected link webpage-pass");
		     }
		     else
		     {
		    	 System.out.println("successfully navigating to expected link webpage-fail");
		     }
		     
		     System.out.println();
		     
		   //property of the headerblock of the tsrtc application homepage
				//classclass="menu-wrap"
				 tsrtc_HeaderBlockProperty=By.className("menu-wrap");
				 tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
				

			//identifying the element in the headerBlock
			 tsrtc_HeaderBlockLinksProperty=By.tagName("a");
			tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(tsrtc_HeaderBlockLinksProperty);
			/*
			tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
			System.out.println("The number header links of the tsrtc application homepage is:-"+tsrtc_HeaderBlockLinksCount);
				*/  
				 
				 
		}
		

	}

}
