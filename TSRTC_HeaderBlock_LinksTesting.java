package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HeaderBlock_LinksTesting {

	public static void main(String[] args) {
		
		WebDriver Driver; 
		
		//Automating Browser
		System.setProperty("webdriver.chrome.driver","./WebDriver1/chromedriver.exe");
		
		//Url  address is assigned to a variable
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		ChromeDriver driver=new ChromeDriver();
		
		//Navigating Url address to the TSRTC application HomePage
		driver.get(applicationUrlAddress);
		
		//Maximing the window webpage
		driver.manage().window().maximize();
		
		String tsrtcapplicationHomepageUrlAddress=driver.getCurrentUrl();
		System.out.println("The Url address tsrtc application homepage is:-"+tsrtcapplicationHomepageUrlAddress);
		
		//indentifying the property of the  tsrtc headerBlocks of the webpage
		//<div class="menu-wrap">
		
		By  tsrtcheaderBlockProperty=By.className("menu-wrap");
		WebElement   tsrtcheaderBlock=driver.findElement(tsrtcheaderBlockProperty);
		
	//<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
	//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>	
     //<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>	
		
	//indentifying the common property of the element
	  By tsrtcheaderBlockLinksProperty=By.tagName("a");
	  
	  // of the Header block finding the allelement
	   List <WebElement>tsrtcheaderBlockLinks=tsrtcheaderBlock.findElements(tsrtcheaderBlockLinksProperty);
		
	  int  tsrtcheaderBlockLinksCount=tsrtcheaderBlockLinks.size();
	  System.out.println("The number of links of the  headerBlock of tsrtc application Homepage is:-"+tsrtcheaderBlockLinksCount);
		
		for(int arrayindex=0;arrayindex<tsrtcheaderBlockLinksCount;arrayindex++)
		{
			String tsrtcheaderBlockLinkName=tsrtcheaderBlockLinks.get(arrayindex).getText();
			System.out.println(arrayindex+"- "+tsrtcheaderBlockLinkName);
			
			tsrtcheaderBlockLinks.get(arrayindex).click();
			
			driver.navigate().back();
			
			 tsrtcheaderBlock=driver.findElement(tsrtcheaderBlockProperty);
			 
			 tsrtcheaderBlockLinks=tsrtcheaderBlock.findElements(tsrtcheaderBlockLinksProperty);
			 
			String webpageTitle=driver.getTitle();
			System.out.println(webpageTitle);
			
			String webPageUrladderss=driver.getCurrentUrl();
			System.out.println("The url address tsrtc application homepage is:-"+webPageUrladderss);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
