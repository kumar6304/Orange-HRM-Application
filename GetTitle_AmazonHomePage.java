package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle_AmazonHomePage {
	
	public static void main(String[] args) {
		
		//automating chromebrowser
		System.setProperty("webdriver.edge.driver", "./WebDrivers/msedgedriver.exe");
		
		EdgeDriver ChromeBrowser=new EdgeDriver();
		
		//navigating the URL application amazon homepage
		
		ChromeBrowser.get("http://amazon.in");
		
		ChromeBrowser.manage().window().maximize();
		
		String amazonHomePageTitle=ChromeBrowser.getTitle();
		
		System.out.println("The title amazon homepage is:-"+amazonHomePageTitle);
		
		ChromeBrowser.quit(); 
		
		
	}

}
