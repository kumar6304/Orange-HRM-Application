package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HomePage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver Driver;
		//Automating Browser
		System.setProperty("webdriver.edge.driver","./WebDrivers/msedgedriver.exe");
		//Url Address is assigned to the variable
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		ChromeDriver driver=new ChromeDriver();
		//Navigated to the Url address tsrtc  application homepage
		driver.get(applicationUrlAddress);
		
		//maximing to the window webpage
		driver.manage().window().maximize();
		
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		//<a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		//<a href="#" onclick="populateSearch('15881', 'Vijayawada', '5231', 'Hyderabad');">	
		     //Vijayawada - Hyderabad</a>
		
		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" 
				//title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		//<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input"
				//title="Enter city name and select from the dropdown list." autocomplete="off">
		
		//identifying the element property of the tsrtc homepage links
		//identifying the common property of the element
		By tsrtc_HomepageLinksProperty=By.tagName("a");
		List <WebElement> tsrtc_HomepageLinks=driver.findElements(tsrtc_HomepageLinksProperty);
		 
		int tsrtc_HomepageLinksCounts=tsrtc_HomepageLinks.size();
		System.out.println("The number of the links tsrtc application homepage is:-"+tsrtc_HomepageLinksCounts);
	
		for(int arrayindex=0;arrayindex<tsrtc_HomepageLinksCounts;arrayindex++)
		{
			String tsrtc_HomepageLinksName=tsrtc_HomepageLinks.get(arrayindex).getText();
			System.out.println(arrayindex+" "+tsrtc_HomepageLinksName);
			
		}
		  
	}

}
