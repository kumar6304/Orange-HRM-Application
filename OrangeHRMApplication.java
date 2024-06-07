package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMApplication {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver;
		//automating ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./WebDriver1/chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		
		//Url address is to assigned to a variable
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
		//Navigating Url address to OrangeHRM application
		 driver.get(applicationUrlAddress); 
		 driver.manage().window().maximize(); 
		 
		 //Expected Title of the OrangeHRMApplication -should be
		 
		 String Expected_orangeHRMApplicationLoginPageTitle="OrangeHRM";
		 System.out.println("The expected Title of the OrangeHRM Application is:-"+Expected_orangeHRMApplicationLoginPageTitle);
		 
		String Actual_orangeHRMApplicationLoginPageTitle=driver.getTitle();
		System.out.println("The actual Title of the  OrangeHRM Application is:-"+Actual_orangeHRMApplicationLoginPageTitle);
		
		if(Actual_orangeHRMApplicationLoginPageTitle.equals(Expected_orangeHRMApplicationLoginPageTitle))
		{
			System.out.println("OrangeHRMApplication Loginpage Title is matched-pass");
		}
		else
		{
			System.out.println("OrangeHRMApplication LoginPage Title is not matched-fail");
		}
		
		//Expected Current URL Address OrangeHRMApplication- should have
		
		String Expected_OrangeHRMApplicationUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The Expected Url Address of the OrangeHRM Application is:-"+Expected_OrangeHRMApplicationUrlAddress);
		
		
		String Actual_orangeHRMApplicationUrlAddress=driver.getCurrentUrl();
		System.out.println("The Actual Url Address of the  OrangeHRM Application is:-"+Actual_orangeHRMApplicationUrlAddress);
		
		if(Actual_orangeHRMApplicationUrlAddress.contains(Expected_OrangeHRMApplicationUrlAddress))
		{
			System.out.println("OrangeHRMApplication Url Address is matched-pass");
		}
		else
		{
			System.out.println("OrangeHRMApplication Url Address is not matched -fail");
		}
		
		//OrangeHRM Logo
		// /html/body/div[1]/div/div[2]/div/img
		
		By orangeHRMLogoProperties=By.xpath("/html/body/div[1]/div/div[2]/div/img");
		WebElement orangeHRMLogo=driver.findElement(orangeHRMLogoProperties);
		Boolean flag=orangeHRMLogo.isDisplayed();
		
		
		if(flag)
		{
			System.out.println("orangehrmlogo is -pass");
		}
		else
		{
			System.out.println("orangehrmlogon is -fail");
		}
		
		
		//OrangeHRM Application LoginPage-LOGIN Panel-should be
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
		String Expected_orangeHRMapplicationloginpage_loginpanelText="LOGIN Panel";
		System.out.println("The Expected LoginPanel Text OrangeHRMApplication is:-"+Expected_orangeHRMapplicationloginpage_loginpanelText);
		
		By LoginPanelTextProperties=By.id("logInPanelHeading");
		WebElement  LoginPanelText=driver.findElement(LoginPanelTextProperties);
		
		String Actual_OrangeHRMApplicationloginPage_LoginPanelText=LoginPanelText.getText();
		System.out.println("The Actual LoginPanel Text OrangeHRMApplication is:-"+Actual_OrangeHRMApplicationloginPage_LoginPanelText);
		
		if(Actual_OrangeHRMApplicationloginPage_LoginPanelText.equals(Expected_orangeHRMapplicationloginpage_loginpanelText))
		{
			System.out.println("OrangeHRMApplication LoginPanel is matched-pass");
		}
		else
		
		{
			System.out.println("OrangeHRMApplication LoginPanelis not matched -fail");
		}
		
		//UserName Properties
       // <input name="txtUsername" id="txtUsername" type="text">
		
		By userNameProperties=By.id("txtUsername");
		WebElement   userName=driver.findElement(userNameProperties);
        userName.sendKeys("Kumar");
        
		
		/*
        // Relative Xpath
            //*[@id="txtUsername"]
		By userNameProperties=By.xpath("//*[@id=\"txtUsername\"]");
		WebElement  userName=edgeBrowser.findElement(userNameProperties);	
		userName.sendKeys("Kumar");
		*/
        
        //PassWord Properties
       // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
       /* 
        By passWordProperties=By.id("txtPassword");
        WebElement   passWord=edgeBrowser.findElement(passWordProperties);
        passWord.sendKeys("Kumar9160@");
             */
        
        //Relative Xpath
            //*[@id="txtPassword"]
       By passWordProperties=By.xpath("//*[@id=\"txtPassword\"]");
        WebElement  passWord=driver.findElement(passWordProperties);
        passWord.sendKeys("Kumar9160@");
        
        //GetAttribute Value of the userName properties
        
        String userNameAttributevalue=userName.getAttribute("value");
        System.out.println("The attributevalue of the username webelement is:-"+userNameAttributevalue);
        
        //GetAttribute Value of the password properties
        
        String passWordAttributevaLue=passWord.getAttribute("value");
        System.out.println("The attribute of the passwod webelement is:-"+passWordAttributevaLue);
        
        
       // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
        /*
        By loginProperties=By.className("button");
        WebElement login=edgeBrowser.findElement(loginProperties);
        login.click();
        */
        
        //Login properties Xpath
        
          //*[@id="btnLogin"]
        
        By loginProperties=By.xpath("//*[@id=\"btnLogin\"]");
        WebElement login=driver.findElement(loginProperties);
        login.click();
        
        
      // 1. Admin LinkText Properties
       // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
        //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
        
        By adminProperties=By.linkText("Admin");
        WebElement  admin=driver.findElement(adminProperties);
       
        Actions action=new Actions(driver);
        action.moveToElement(admin).build().perform();
        
        //Admin GetAttribute Value 
        
        String adminAttributeValue=admin.getAttribute("href");
        System.out.println("The Attribute value of the admin is:-"+adminAttributeValue);
        System.out.println();
        
        
        
        /*
              //*[@id="menu_admin_viewAdminModule"]
        By adminProperties=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]");
        WebElement   admin=edgeBrowser.findElement(adminProperties);
        admin.click();
           */
        
        //1.1userManagment  linkText
       // <a href="#" id="menu_admin_UserManagement" class="arrow">User Management</a>
       By userManagementProperties=By.linkText("User Management");
       WebElement  userManagement=driver.findElement(userManagementProperties);
       
         action=new Actions(driver);
        action.moveToElement(userManagement).build().perform();
       
        //GetAttributeValue userManagement
        String userManagementAttributeValue=userManagement.getAttribute("href");
        System.out.println("The Attribute value of the userManagement is:-"+userManagementAttributeValue);
        System.out.println();
      
        //1.1.2 users
        By usersProperty=By.linkText("Users");
        WebElement users=driver.findElement(usersProperty);
        users.click();
        
        //1.2 job  linkText
       // <a href="#" id="menu_admin_Job" class="arrow">Job</a>
        
        By jobProperty=By.id("menu_admin_Job");
        WebElement  job=driver.findElement(jobProperty);
        
        
        Actions action1=new Actions(driver);
        action1.moveToElement(job).build().perform();
        
        
        //1.2.2 jobTtitle linkstext
        
       // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewJobTitleList"
        //id="menu_admin_viewJobTitleList">Job Titles</a>
        
        By jobTitleProperty=By.id("menu_admin_viewJobTitleList");
        WebElement  jobTitle=driver.findElement(jobTitleProperty);
        jobTitle.click();
        
       
     // 1. Admin LinkText Properties
        // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
         //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
         
         By adminProperties1=By.linkText("Admin");
         WebElement  admin1=driver.findElement(adminProperties);
        
         Actions action3=new Actions(driver);
         action3.moveToElement(admin1).build().perform();
        
       
         //1.2 job  linkText
        // <a href="#" id="menu_admin_Job" class="arrow">Job</a>
         
         By jobProperty1=By.id("menu_admin_Job");
         WebElement  job1=driver.findElement(jobProperty1);
         
         
         Actions action4=new Actions(driver);
         action4.moveToElement(job1).build().perform();
        
         
         //1.2.3 paygrades linktext
        // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewPayGrades" id="menu_admin_viewPayGrades">Pay Grades</a>
         
         By paygradesProperty=By.id("menu_admin_viewPayGrades");
         WebElement   paygrades=driver.findElement(paygradesProperty);
         paygrades.click();
         
         
          //  Admin LinkText Properties
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
          //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
          
          By adminProperties2=By.linkText("Admin");
          WebElement  admin2=driver.findElement(adminProperties);
         
          Actions action5=new Actions(driver);
          action5.moveToElement(admin2).build().perform();
          
          
          // job  linkText
          // <a href="#" id="menu_admin_Job" class="arrow">Job</a>
           
           By jobProperty2=By.id("menu_admin_Job");
           WebElement  job2=driver.findElement(jobProperty1);
           
           
           Actions action6=new Actions(driver);
           action6.moveToElement(job2).build().perform();
           
           
           //1.2.3 employment status linktext
           
          // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/employmentStatus" 
           //id="menu_admin_employmentStatus">Employment Status</a>
           
           By employmentstatusProperty=By.id("menu_admin_employmentStatus");
           WebElement  employmentstatus=driver.findElement(employmentstatusProperty);
            employmentstatus.click();
      
            
            
            //  Admin LinkText Properties
            // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
             //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
             
             By adminProperties3=By.linkText("Admin");
             WebElement  admin3=driver.findElement(adminProperties3);
            
             Actions action7=new Actions(driver);
             action7.moveToElement(admin3).build().perform();
             
             
             // job  linkText
             // <a href="#" id="menu_admin_Job" class="arrow">Job</a>
              
              By jobProperty3=By.id("menu_admin_Job");
              WebElement  job3=driver.findElement(jobProperty3);
              
              
              Actions action8=new Actions(driver);
              action8.moveToElement(job3).build().perform();
              
              //1.2.4 job categories linkText
              
              //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/jobCategory" 
              //id="menu_admin_jobCategory">Job Categories</a>
       
                By jobCategoryProperty=By.id("menu_admin_jobCategory");
               WebElement  jobCategory=driver.findElement(jobCategoryProperty);
               jobCategory.click();
               
               
               //  Admin LinkText Properties
               // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
                //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                
                By adminProperties4=By.linkText("Admin");
                WebElement  admin4=driver.findElement(adminProperties4);
               
                Actions action9=new Actions(driver);
                action9.moveToElement(admin4).build().perform();
               
                // job  linkText
                // <a href="#" id="menu_admin_Job" class="arrow">Job</a>
                 
                 By jobProperty4=By.id("menu_admin_Job");
                 WebElement  job4=driver.findElement(jobProperty4);
                 
                 Actions action10=new Actions(driver);
                 action10.moveToElement(job4).build().perform();
                 
                 //1.2.5 workshifts linktext
                 
                // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/workShift" 
                 //id="menu_admin_workShift">Work Shifts</a>
                 
                 By workshiftProperty=By.id("menu_admin_workShift");
                 WebElement     workshift=driver.findElement(workshiftProperty);
                 workshift.click();
                 
                 //1.3 Oragnization linkText
                 // <a href="#" id="menu_admin_Organization" class="arrow">Organization</a>
                  By orgnizationProperty=By.id("menu_admin_Organization");
                  WebElement  orgnization=driver.findElement(orgnizationProperty);
                  orgnization.click();
                  
                  Actions action11=new Actions(driver);
                  action11.moveToElement(orgnization).build().perform();
                  
                  //1.1.3 general information linktext
                 // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewOrganizationGeneralInformation" 
                	//id="menu_admin_viewOrganizationGeneralInformation">General Information</a>
                  
                  By generalinformationProperty=By.id("menu_admin_viewOrganizationGeneralInformation");
                   WebElement generalinformation=driver.findElement(generalinformationProperty);
                   generalinformation.click();
                   
                   
             //  Admin LinkText Properties
            // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
           //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                    
             By adminProperties5=By.linkText("Admin");
             WebElement  admin5=driver.findElement(adminProperties5);
                   
              Actions action12=new Actions(driver);
              action12.moveToElement(admin5).build().perform();
                   
                   
            //Oragnization linkText
              // <a href="#" id="menu_admin_Organization" class="arrow">Organization</a>
               By orgnizationProperty1=By.id("menu_admin_Organization");
               WebElement  orgnization1=driver.findElement(orgnizationProperty1);
               
               
               Actions action13=new Actions(driver);
               action13.moveToElement(orgnization1).build().perform();     
           
       //1.3.2 location linktext            
      // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewLocations" 
      //  id="menu_admin_viewLocations">Locations</a>
      
     By locationsProperty=By.id("menu_admin_viewLocations");         
     WebElement locations=driver.findElement(locationsProperty);           
     locations.click();
     
     
     //  Admin LinkText Properties
     // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
    //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
             
      By adminProperties6=By.linkText("Admin");
      WebElement  admin6=driver.findElement(adminProperties6);
            
       Actions action14=new Actions(driver);
       action14.moveToElement(admin6).build().perform();
            
            
     //Oragnization linkText
       // <a href="#" id="menu_admin_Organization" class="arrow">Organization</a>
        By orgnizationProperty2=By.id("menu_admin_Organization");
        WebElement  orgnization2=driver.findElement(orgnizationProperty2);
        
        
        Actions action15=new Actions(driver);
        action15.moveToElement(orgnization2).build().perform(); 
        
        //1.3.4 structure------linkText
        
       // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewCompanyStructure" 
        //id="menu_admin_viewCompanyStructure">Structure</a>
        
       By structureProperty=By.id("menu_admin_viewCompanyStructure");
       WebElement   structure=driver.findElement(structureProperty);
       structure.click();
       
       //1.4--- Qualification 
      // <a href="#" id="menu_admin_Qualifications" class="arrow">Qualifications</a>
       
       By qualificationProperty=By.id("menu_admin_Qualifications");
       WebElement  qualification=driver.findElement(qualificationProperty);
       qualification.click();
       
       
       Actions  action16=new Actions(driver);
       action16.moveToElement(qualification).build().perform();
                  
                  
      // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewSkills"
       //id="menu_admin_viewSkills">Skills</a> 
       
       By skillsProperty=By.id("menu_admin_viewSkills");
       WebElement   skills=driver.findElement(skillsProperty);        
       skills.click();
       
       
       //  Admin LinkText Properties
       // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
      //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
               
        By adminProperties7=By.linkText("Admin");
        WebElement  admin7=driver.findElement(adminProperties7);
              
         Actions action19=new Actions(driver);
         action19.moveToElement(admin7).build().perform();
       
       
         //--- Qualification 
         // <a href="#" id="menu_admin_Qualifications" class="arrow">Qualifications</a>
          
          By qualificationProperty1=By.id("menu_admin_Qualifications");
          WebElement  qualification1=driver.findElement(qualificationProperty1);
          
          Actions  action20=new Actions(driver);
          action20.moveToElement(qualification1).build().perform();
                     
          //1.4.2----education-----
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewEducation" 
        // id="menu_admin_viewEducation">Education</a>
       
          By educationProperty=By.id("menu_admin_viewEducation");        
         WebElement   education=driver.findElement(educationProperty);     
         education.click(); 
         
         
         //  Admin LinkText Properties
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
        //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                 
          By adminProperties8=By.linkText("Admin");
          WebElement  admin8=driver.findElement(adminProperties8);
                
           Actions action21=new Actions(driver);
           action21.moveToElement(admin8).build().perform();
         
         
           //--- Qualification 
           // <a href="#" id="menu_admin_Qualifications" class="arrow">Qualifications</a>
            
            By qualificationProperty2=By.id("menu_admin_Qualifications");
            WebElement  qualification2=driver.findElement(qualificationProperty2);
            
            Actions  action22=new Actions(driver);
            action22.moveToElement(qualification2).build().perform();
                       
            //1.4.3------licenses-----
           // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewLicenses" 
           //id="menu_admin_viewLicenses">Licenses</a>
         
        By licensesProperty=By.id("menu_admin_viewLicenses");
         WebElement   licenses=driver.findElement(licensesProperty);
         licenses.click();
         
         
     //  Admin LinkText Properties
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
        //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                 
          By adminProperties9=By.linkText("Admin");
          WebElement  admin9=driver.findElement(adminProperties9);
                
           Actions action23=new Actions(driver);
           action23.moveToElement(admin9).build().perform();
         
         
           //--- Qualification 
           // <a href="#" id="menu_admin_Qualifications" class="arrow">Qualifications</a>
            
            By qualificationProperty3=By.id("menu_admin_Qualifications");
            WebElement  qualification3=driver.findElement(qualificationProperty3);
            
            Actions  action24=new Actions(driver);
            action24.moveToElement(qualification3).build().perform();
            
            //---1.4.4-----languages----
           // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewLanguages" 
           //id="menu_admin_viewLanguages">Languages</a>
         
         By languageProperty=By.id("menu_admin_viewLanguages");
         WebElement  language=driver.findElement(languageProperty);
         language.click();
         
         
     //  Admin LinkText Properties
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
        //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                 
          By adminProperties10=By.linkText("Admin");
          WebElement  admin10=driver.findElement(adminProperties10);
                
           Actions action25=new Actions(driver);
           action25.moveToElement(admin10).build().perform();
         
         
           //--- Qualification 
           // <a href="#" id="menu_admin_Qualifications" class="arrow">Qualifications</a>
            
            By qualificationProperty4=By.id("menu_admin_Qualifications");
            WebElement  qualification4=driver.findElement(qualificationProperty4);
            
            Actions  action26=new Actions(driver);
            action26.moveToElement(qualification4).build().perform();
           
         //-----1.4.5-------memberships
           //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/membership" 
          //id="menu_admin_membership">Memberships</a>
         
         By membershipProperty=By.id("menu_admin_membership");
         WebElement   membership=driver.findElement(membershipProperty);
         membership.click();
         
         //-----1.5-nationalities
        // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/nationality" 
        //id="menu_admin_nationality">Nationalities</a>
         By nationalitiesProperty=By.id("menu_admin_nationality");
         WebElement   nationalities=driver.findElement(nationalitiesProperty);
         nationalities.click();
         
         
         //----1.6-configuration----
        // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
         By configurationProerty=By.id("menu_admin_Configuration");
         WebElement   configuration=driver.findElement(configurationProerty);
         configuration.click();
         
         Actions action28=new Actions(driver);
         action28.moveToElement(configuration).build().perform();
         
      //----1.6.1--email configuration   
     //  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/listMailConfiguration"
      //  id="menu_admin_listMailConfiguration">Email Configuration</a>
         
       By emailConfigurationProperty=By.id("menu_admin_listMailConfiguration");  
       WebElement  emailConfiguration=driver.findElement(emailConfigurationProperty);
       emailConfiguration.click();
       
       
       //  Admin LinkText Properties
       // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
      //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
               
        By adminProperties11=By.linkText("Admin");
        WebElement  admin11=driver.findElement(adminProperties11);
              
         Actions action27=new Actions(driver);
         action27.moveToElement(admin11).build().perform();
       
       
         //----configuration----
         // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
          By configurationProerty1=By.id("menu_admin_Configuration");
          WebElement   configuration1=driver.findElement(configurationProerty1);
          
          
          Actions action29=new Actions(driver);
          action29.moveToElement(configuration1).build().perform();
          
        //-----1.6.2-----email subscriptions  
      // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewEmailNotification" 
      // id="menu_admin_viewEmailNotification">Email Subscriptions</a>
       By emailSubscriptionProperty=By.id("menu_admin_viewEmailNotification");
        WebElement    emailSubscription=driver.findElement(emailSubscriptionProperty);
        emailSubscription.click();
        
        
    //  Admin LinkText Properties
        // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
       //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                
         By adminProperties12=By.linkText("Admin");
         WebElement  admin12=driver.findElement(adminProperties12);
               
          Actions action30=new Actions(driver);
          action30.moveToElement(admin12).build().perform();
        
        
          //----configuration----
          // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
           By configurationProerty2=By.id("menu_admin_Configuration");
           WebElement   configuration2=driver.findElement(configurationProerty2);
           
           
           Actions action31=new Actions(driver);
           action31.moveToElement(configuration2).build().perform();
           
     //----1.6.3-----localization-----      
    //  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/localization" 
    // id="menu_admin_localization">Localization</a>
           
     By localizationProperty=By.id("menu_admin_localization");  
     WebElement   localization=driver.findElement(localizationProperty);
     localization.click();
    
     
     //  Admin LinkText Properties
         // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
        //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
                 
          By adminProperties13=By.linkText("Admin");
          WebElement  admin13=driver.findElement(adminProperties13);
                
           Actions action32=new Actions(driver);
           action32.moveToElement(admin13).build().perform();
         
         
           //----configuration----
           // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
            By configurationProerty3=By.id("menu_admin_Configuration");
            WebElement   configuration3=driver.findElement(configurationProerty3);
            
            
            Actions action33=new Actions(driver);
            action33.moveToElement(configuration3).build().perform();
            
      
     //----1.6.4------modules
    //  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewModules" 
    //  id="menu_admin_viewModules">Modules</a>
    By modulesProperty=By.id("menu_admin_viewModules");      
   WebElement   modules =driver.findElement(modulesProperty);
   modules.click(); 
   
// Admin LinkText Properties
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
  //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
           
    By adminProperties14=By.linkText("Admin");
    WebElement  admin14=driver.findElement(adminProperties14);
          
     Actions action34=new Actions(driver);
     action34.moveToElement(admin14).build().perform();
   
   
     //----configuration----
     // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
      By configurationProerty4=By.id("menu_admin_Configuration");
      WebElement   configuration4=driver.findElement(configurationProerty4);
      
      
      Actions action35=new Actions(driver);
      action35.moveToElement(configuration4).build().perform();
      
     //----1.6.5-------media authentication---- 
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/openIdProvider" 
   //id="menu_admin_openIdProvider">Social Media Authentication</a>
   By mediaAuthenticationProperty=By.id("menu_admin_openIdProvider");
   WebElement   mediaAuthenication=driver.findElement(mediaAuthenticationProperty);
   mediaAuthenication.click();
   
   
   
// Admin LinkText Properties
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" 
  //id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
           
    By adminProperties15=By.linkText("Admin");
    WebElement  admin15=driver.findElement(adminProperties15);
          
     Actions action36=new Actions(driver);
     action36.moveToElement(admin15).build().perform();
   
   
     //----configuration----
     // <a href="#" id="menu_admin_Configuration" class="arrow">Configuration</a>
      By configurationProerty5=By.id("menu_admin_Configuration");
      WebElement   configuration5=driver.findElement(configurationProerty5);
      
      
      Actions action37=new Actions(driver);
      action37.moveToElement(configuration5).build().perform();
      
      
    //-----1.6.5----register oauthclient
    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/registerOAuthClient" 
    //id="menu_admin_registerOAuthClient">Register OAuth Client</a>
     By  registerOauthClientProperty =By.id("menu_admin_registerOAuthClient");
     WebElement  registerOauthClient=driver.findElement(registerOauthClientProperty);
     registerOauthClient.click();
     
 
     
     //----2.0----PIM---
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
  // id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
   By pimProperty=By.id("menu_pim_viewPimModule"); 
   WebElement  pim=driver.findElement(pimProperty);
   
   Actions action38=new   Actions(driver); 
   action38.moveToElement(pim).build().perform();
   
   //---2.1---Configuration
   //<a href="#" id="menu_pim_Configuration" class="arrow">Configuration</a>
   By configurationlinkProperty=By.id("menu_pim_Configuration");
   WebElement   configurationlink =driver.findElement(configurationlinkProperty);
   configurationlink.click(); 
  
   //-----2.2---optional fields
   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/configurePim"
  //id="menu_pim_configurePim">Optional Fields</a>
   By optionalFieldsProperty=By.id("menu_pim_configurePim");
   WebElement optionalFields=driver.findElement(optionalFieldsProperty);
   optionalFields.click();
   
   //----PIM---
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
  // id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
   By pimProperty1=By.id("menu_pim_viewPimModule"); 
   WebElement  pim1=driver.findElement(pimProperty1);
   
   Actions action39=new   Actions(driver); 
   action39.moveToElement(pim1).build().perform();
   
   
   //---Configuration
   //<a href="#" id="menu_pim_Configuration" class="arrow">Configuration</a>
   By configurationlinkProperty1=By.id("menu_pim_Configuration");
   WebElement   configurationlink1 =driver.findElement(configurationlinkProperty1);
   
   Actions action40= new Actions(driver);
   action.moveToElement(configurationlink1).build().perform();
   
   
   //----2.3----customfields
  
  // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/listCustomFields" 
	// id="menu_pim_listCustomFields">Custom Fields</a>
   
   By customFieldsProperty=By.linkText("Custom Fields");
   WebElement  customFields=driver.findElement(customFieldsProperty);
   customFields.click();
   
   
   //----PIM---
   // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
  // id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
   By pimProperty2=By.id("menu_pim_viewPimModule"); 
   WebElement  pim2=driver.findElement(pimProperty2);
   
   Actions action41=new   Actions(driver); 
   action41.moveToElement(pim2).build().perform();
   
   
   //---Configuration
   //<a href="#" id="menu_pim_Configuration" class="arrow">Configuration</a>
   By configurationlinkProperty2=By.id("menu_pim_Configuration");
   WebElement   configurationlink2 =driver.findElement(configurationlinkProperty2);
   
   Actions action42= new Actions(driver);
   action.moveToElement(configurationlink2).build().perform();
   
  //----2.4---data import 
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/pimCsvImport" 
//id="menu_admin_pimCsvImport">Data Import</a>
   
 By dataimportProperty=By.id("menu_admin_pimCsvImport");  
 WebElement   dataimport=driver.findElement(dataimportProperty); 
 dataimport.click(); 
   
   
 //----PIM---
 // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
// id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
 By pimProperty3=By.id("menu_pim_viewPimModule"); 
 WebElement  pim3=driver.findElement(pimProperty3);
 
 Actions action43=new   Actions(driver); 
 action43.moveToElement(pim3).build().perform();
 
 
 //---Configuration
 //<a href="#" id="menu_pim_Configuration" class="arrow">Configuration</a>
 By configurationlinkProperty3=By.id("menu_pim_Configuration");
 WebElement   configurationlink3 =driver.findElement(configurationlinkProperty3);
 
 Actions action44= new Actions(driver);
 action44.moveToElement(configurationlink3).build().perform();
 
 //---2.5-----reportingMethods
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewReportingMethods" 
//id="menu_pim_viewReportingMethods">Reporting Methods</a>
   
 By reportingMethodsProperty=By.id("menu_pim_viewReportingMethods");  
 WebElement reportingMethods=driver.findElement(reportingMethodsProperty);
 reportingMethods.click();
 
 //----PIM---
 // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
// id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
 By pimProperty4=By.id("menu_pim_viewPimModule"); 
 WebElement  pim4=driver.findElement(pimProperty4);
 
 Actions action45=new   Actions(driver); 
 action45.moveToElement(pim4).build().perform();
 
 
 //---Configuration
 //<a href="#" id="menu_pim_Configuration" class="arrow">Configuration</a>
 By configurationlinkProperty4=By.id("menu_pim_Configuration");
 WebElement   configurationlink4 =driver.findElement(configurationlinkProperty4);
 
 Actions action46= new Actions(driver);
 action46.moveToElement(configurationlink4).build().perform();
 
 
 //------2.6----termination Reasons
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewTerminationReasons"
//id="menu_pim_viewTerminationReasons">Termination Reasons</a>
 
 By terminationReasonsProperty=By.id("menu_pim_viewTerminationReasons");
 WebElement  terminationReasons=driver.findElement(terminationReasonsProperty);
 terminationReasons.click();
   
 //----2.3.-------employeelist
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" 
//id="menu_pim_viewEmployeeList">Employee List</a>
By employeeListProperty =By.id("menu_pim_viewEmployeeList");
WebElement     employeeList=driver.findElement(employeeListProperty);
employeeList.click();


 
 //------2.4------addEmployeee----
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" 
//id="menu_pim_addEmployee">Add Employee</a>
 
 By addEmployeeProperty=By.id("menu_pim_addEmployee");
WebElement	addEmployee=driver.findElement(addEmployeeProperty);
addEmployee.click();


//------2.5----reports
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/core/viewDefinedPredefinedReports/reportGroup/3/reportType/PIM_DEFINED" 
//id="menu_core_viewDefinedPredefinedReports">Reports</a>
By reportsProperty=By.id("menu_core_viewDefinedPredefinedReports");
 WebElement    reports=driver.findElement(reportsProperty);
 reports.click();
 
 //----3.0---leave
 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/leave/viewLeaveModule" 
//id="menu_leave_viewLeaveModule" class="firstLevelMenu"><b>Leave</b></a>
By leaveProperty=By.id("menu_leave_viewLeaveModule");
WebElement	leave=driver.findElement(leaveProperty);
leave.click();
      
/*
     Actions action47=new Actions(edgeBrowser);
     action47.moveToElement(leave).build().perform();
        */

  
//------4.0.----leave----  
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/time/viewTimeModule" 
//id="menu_time_viewTimeModule" class="firstLevelMenu"><b>Time</b></a>	
	
 By timeProperty=By.id("menu_time_viewTimeModule");
WebElement	time=driver.findElement(timeProperty);
time.click();

//----5.0.-----recruitment
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/recruitment/viewRecruitmentModule" 
//id="menu_recruitment_viewRecruitmentModule" class="firstLevelMenu"><b>Recruitment</b></a>
     By recruitmentProperty=By.id("menu_recruitment_viewRecruitmentModule");
	  WebElement recruitment=driver.findElement(recruitmentProperty);
	  recruitment.click();
	
	  
	  
	  //-------5.1-----candidates
	 // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/recruitment/viewCandidates" 
			  //id="menu_recruitment_viewCandidates">Candidates</a> 
	
	  By candidatesProperty=By.id("menu_recruitment_viewCandidates");
	   WebElement   candidates=driver.findElement(candidatesProperty);
	   candidates.click();
	   
	   //------5.2----vacancies
	   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/recruitment/viewJobVacancy" 
			   //id="menu_recruitment_viewJobVacancy">Vacancies</a>
	   By vacanciesProperty=By.id("menu_recruitment_viewJobVacancy");
	   WebElement   vacancies=driver.findElement(vacanciesProperty);
	   vacancies.click();
	   
	   //---------6.0-------performance
	   //<a href="#" id="menu__Performance" class="firstLevelMenu"><b>Performance</b></a>
	
	  By performanceProperty=By.id("menu__Performance");
	  WebElement  performance=driver.findElement(performanceProperty);
	  performance.click();
	  
	  
	  //-----6.1------configure--
	 // <a href="#" id="menu_performance_Configure" class="arrow">Configure</a>
	  By configureProperty=By.id("menu_performance_Configure");
	  WebElement  configure=driver.findElement(configureProperty);
	  configure.click();
	  
	     Actions action47=new Actions(driver);
	     action47.moveToElement(configure).build().perform();   
	     
	     
	     //-------6.2-------kpis
	     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/performance/searchKpi" 
	    		 //id="menu_performance_searchKpi">KPIs</a>
	     
	     By kpisProperty=By.id("menu_performance_searchKpi");
	     WebElement  kpis=driver.findElement(kpisProperty);
	     kpis.click();
	     
	  
	     
		  //----configure--
			 // <a href="#" id="menu_performance_Configure" class="arrow">Configure</a>
			  By configureProperty1=By.id("menu_performance_Configure");
			  WebElement  configure1=driver.findElement(configureProperty1);
			  
			  
			     Actions action48=new Actions(driver);
			     action47.moveToElement(configure1).build().perform(); 
			           
			     //------6.2.2------trackers--
			     //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/performance/addPerformanceTracker"
			    		 //id="menu_performance_addPerformanceTracker">Trackers</a>
	       
	             By trackerProperty=By.id("menu_performance_addPerformanceTracker");
	              WebElement  tracker=driver.findElement(trackerProperty);
	              tracker.click();
	              
	              //-------6.2-------managereviews
	             // <a href="#" id="menu_performance_ManageReviews" class="arrow">Manage Reviews</a> 
	             By manageReviewsProperty=By.id("menu_performance_ManageReviews"); 
	             
	           WebElement   manageReviews=driver.findElement(manageReviewsProperty);
	           manageReviews.click(); 
	           
	           Actions action49=new Actions(driver);
	           action49.moveToElement(manageReviews).build().perform();
	             
	           
	           //-------6.2.3------managereviews--------------------
	           //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/performance/searchPerformancReview" 
	        		   //id="menu_performance_searchPerformancReview">Manage Reviews</a>
	          By  manageReviewslinkProperty=By.id("menu_performance_searchPerformancReview");
	          WebElement    managereviews=driver.findElement(manageReviewslinkProperty);
	          managereviews.click(); 
	          
	          //-------6.3-------employeeTrackers
	          //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/performance/viewEmployeePerformanceTrackerList"
	        		  //id="menu_performance_viewEmployeePerformanceTrackerList">Employee Trackers</a>
	          By employeeTracker=By.id("menu_performance_viewEmployeePerformanceTrackerList");
	           WebElement  employee=driver.findElement(employeeTracker);
	           employee.click();
	           
	           
	}

}
