package com.Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDropDown {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.edge.driver","./WebDrivers/msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
		//Url address is to assigned to a variable
		
		String applicationUrlAddress="https://www.amazon.in";
	
		//Navigating Url address to OrangeHRM application
		driver.get(applicationUrlAddress); 
		driver.manage().window().maximize(); 
		
		String amazonApplicationHomePageTitle=driver.getTitle();
		System.out.println("The title amazon ApplicationHomePageTitle is:-"+amazonApplicationHomePageTitle);
		
		String amazonApplicationCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println("The current Url address amazon application is:-"+amazonApplicationCurrentUrlAddress);
		
		//id-"nav-logo-sprites";
		
		By amazonLogoProperty=By.id("nav-logo-sprites");
		WebElement   amazonLogo=driver.findElement(amazonLogoProperty);
		
		Boolean flag=amazonLogo.isDisplayed();
		
		if(flag)
		{
			System.out.println("AmazonLogo is-pass");
		}
		else
		{
			System.out.println("AmazonLogo is -fail");
		}
		
		/*
		//addresss amazon
		// id="glow-ingress-block"
		By addressBlockProperty=By.id("glow-ingress-block");
		WebElement    addressBlock=driver.findElement(addressBlockProperty);
		addressBlock.click();
		
		     */
		
		
		//id=searchDropdownBox
		By searchdropdownBoxProperty=By.id("searchDropdownBox");
		WebElement  searchdropdownBox=driver.findElement(searchdropdownBoxProperty);
		  
		//<option selected="selected" value="search-alias=aps">All Categories</option>
		//<option value="search-alias=fashion">Amazon Fashion</option>
		//<option value="search-alias=baby">Baby</option>
		
		By dropdownBoxProperty=By.tagName("option");
		List<WebElement> dropdownBox=searchdropdownBox.findElements(dropdownBoxProperty);
		
		int dropdownBoxCount=dropdownBox.size();
		System.out.println("The number of the select value dropdown is:-"+dropdownBoxCount);
		
		for(int index=0;index<dropdownBoxCount;index++)
		{
			String dropdownBoxNames=dropdownBox.get(index).getText();
			System.out.println(index+" -"+dropdownBoxNames);
		}
		
		
		
		
		
		//searchBox
		//  id="twotabsearchtextbox"
		By searchBoxProperty=By.id("twotabsearchtextbox");
		
		WebElement   searchBox=driver.findElement(searchBoxProperty);
		searchBox.sendKeys("Mobiles");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
	}
	

}
