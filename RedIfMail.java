package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RedIfMail {
	public static void main(String[] args) {
		
		WebDriver driver;
		//automating ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./WebDriver1/chromedriver.exe");
	
		ChromeDriver driver1=new ChromeDriver();
		
		//Url address is to assigned to a variable
		String applicationUrlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
	
		//Navigating Url address to OrangeHRM application
		 driver1.get(applicationUrlAddress); 
		 driver1.manage().window().maximize(); 
		//  DOB_Monthcfe84374
		 //  DOB_Month794c607b
		 //  DOB_Monthc5b36294
		 
		 By monthProperty=By.xpath("//*[starts-with(@name,'DOB_Month')]");
		 WebElement month=driver1.findElement(monthProperty);
		 
		 Select select = new Select(month);
		 select.selectByVisibleText("NOV");
		 
		 By drpdwnMonthsProperty=By.tagName("option");
		 List<WebElement>drpdwnMonths=month.findElements(drpdwnMonthsProperty);
		 
		 int drpdwnMonthsCount=drpdwnMonths.size();
		 System.out.println("The Number Of Months In The DropDown Is :- "+drpdwnMonthsCount);
		 
		 for(int index=0;index<drpdwnMonths.size();index++)
		 {
			 String monthNames=drpdwnMonths.get(index).getText();
			 System.out.println(monthNames);
		 }
		 
		//*[@id="tblcrtac"]/tbody/tr[22]/td[3]/select[1]
		 //  DOB_Day752e488d
		 //  DOB_Day64b96676
		By dateProperty=By.xpath("//*[starts-with(@name,'DOB_Day')]");
		WebElement  date=driver1.findElement(dateProperty);
		
		Select select1=new Select(date);
		select1.selectByValue("02");
		
		//<option value="26">26</option>
		
		By drpdwndatesProperty=By.tagName("option");
		List<WebElement>drpdwndates=date.findElements(drpdwndatesProperty);
		
		int drpdwndatesCount=drpdwndates.size();
		System.out.println("The Number Of Dates In The DropDown Is:-"+drpdwndatesCount);
		
		for(int index=0;index<drpdwndates.size();index++)
		{
			String datesText=drpdwndates.get(index).getText();
			System.out.println(datesText);
		}
		
	  //	DOB_Year66cc820c
		
		By yearProperty=By.xpath("//*[starts-with(@name,'DOB_Year')]");
	    WebElement	years=driver1.findElement(yearProperty);
	    
	    Select select2=new Select(years);
	    select2.selectByValue("2023");
	    
	    //<option value="2023" label="2023">2023</option>
	    
	   By drpdwnyearsProperty=By.tagName("option");
	   List <WebElement>drpdwnyears =years.findElements(drpdwnyearsProperty);
		
	  int drpdwnyearsCount=drpdwnyears.size();
	  System.out.println("The Number Of Years In The DropDown Is:-"+drpdwnyearsCount);
	  
	  for(int index=0;index<drpdwnyears.size();index++)
	  {
		  String yearsText=drpdwnyears.get(index).getText();
		  System.out.println(yearsText);
	}
	 // /html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input 
	//*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
	 // name="namea33bf32b"
	 // name="namea33bf32b"
	  
	By nameProperty =By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input");
	WebElement   name=driver1.findElement(nameProperty);
	name.sendKeys("bhargav"); 
	
	//mail id
	//name="login50351440"
	//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[1]
	
	By rediffmailProperty=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]");
	WebElement  rediffmail=driver1.findElement(rediffmailProperty);
	rediffmail.sendKeys("bargav08222");
	
	Actions action=new Actions(driver1);
	action.moveToElement(rediffmail).build().perform();
	
	//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[2]
	
	By checkProperty=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]");
	WebElement   check=driver1.findElement(checkProperty);
	check.click();
	
	//*[@id="newpasswd"]
	By passwordProperty=By.xpath("//*[@id=\"newpasswd\"]");
	WebElement  password=driver1.findElement(passwordProperty);
	password.sendKeys("kumar");
	
	
	//*[@id="newpasswd1"]
	
	By RetypepasswordProperty=By.xpath("//*[@id=\"newpasswd1\"]");
	WebElement  Retypepassword=driver1.findElement(RetypepasswordProperty);
	Retypepassword.sendKeys("kumar");
			
	//*[@id="mobno"]
	By MobilenoProperty=By.xpath("//*[@id=\"mobno\"]");
	WebElement  Mobileno=driver1.findElement(MobilenoProperty);
	Mobileno.sendKeys("6304089693"); 
	
	//*[@id="country"]
	By selectcountryProperty=By.xpath("//*[@id=\"country\"]");
	WebElement  selectdropdown=driver1.findElement(selectcountryProperty);
	selectdropdown.click();
	
	//<option value="99" label="India">India</option>
	
	By dropdownProperty=By.tagName("option");
	List<WebElement>dropdown=selectdropdown.findElements(dropdownProperty);
	
	int dropdowncount=dropdown.size();
	System.out.println("The Number Of Countrys In The DropDown Is :- "+dropdowncount);
	
	for(int index=0;index<dropdowncount;index++)
	{
	String	text=dropdown.get(index).getText();
	System.out.println(text);
	}
}

}
