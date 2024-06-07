package com.ApplicationNavigation;

import org.openqa.selenium.chrome.ChromeDriver;



public class BingHomePage {
	
	 public static void main(String[] args) {
		
		 //automating chromeBrowser
		 
		 System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");
		 
		 ChromeDriver ChromeBrowser=new ChromeDriver();
		 
		 //navigating  to the URL address bing application homepage
		 
		 ChromeBrowser.get("https://bing.com");
		 
		// ChromeBrowser.navigate().to("http://google.com");
		 
		 //ChromeBrowser.get("http://livetech.in");
		 
		// ChromeBrowser.close();
		 
		// ChromeBrowser.quit(); 
		 
		 ChromeBrowser.manage().window().maximize();
		 
		 String bingHomePageTitle=ChromeBrowser.getTitle();
		 System.out.println("The title of the BingHomePage is:-"+bingHomePageTitle);
		 
		 //expected the BingHomePage Title is should be
		 String expected_BingHomepageTitle="Bing";
		 System.out.println("The expected Title BingHomePage is:-"+expected_BingHomepageTitle);
		 
		 //operation webpage
		 String Actual_BingHomePageTitle=ChromeBrowser.getTitle();
		 System.out.println("The actual Title BingHomePage is:-"+Actual_BingHomePageTitle);
		 
		 if(Actual_BingHomePageTitle.equals(expected_BingHomepageTitle))
		 {
			 System.out.println("BingHomePage Title is matched-pass");
		 }
		 else
		 {
			 System.out.println("BingHomePage Title is not matched -fail");
		 }
		 
		 //verifaction and validation should have
		 String Expected_BingApplicationHomePageUrladdress="bing.com";
		 System.out.println("The Url Address BingHomePage Application is:-"+Expected_BingApplicationHomePageUrladdress);
		 
		 
		 String Actual_BingApplicationHomePageUrladdress=ChromeBrowser.getCurrentUrl();
		 System.out.println("The Url Address BingHomePage Application is:-"+Actual_BingApplicationHomePageUrladdress);
		 
		 if(Actual_BingApplicationHomePageUrladdress.contains(Expected_BingApplicationHomePageUrladdress))
		 {
			 System.out.println("Bing HomePage Url is matched -pass");
			 
		 }
		 else
		 {
			 System.out.println("Bing HomePage Url is not matched-fail");
			 
		 }
		 
	}

}
