package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class EditLead {
	public static void main(String[] args) {
		//1.Launch the URL
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximizes the window
		driver.manage().window().maximize();
		
		//2.enter username and possword using id located
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    
	    //3.click on login button using class locator 
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //
        String text=driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        
        //4.click on  crm/sfa button
        driver.findElement(By.linkText("CRM/SFA")).click();
       
        //5.click on leads Button
        driver.findElement(By.linkText("Leads")).click();
       
        //6.click oncreate Lead 
        driver.findElement(By.partialLinkText("Create")).click();
        
        //7.enter the company name field using id locator
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
        //8.enter the first name field using id locator
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ananthi");
        
        //9.enter the last name field using id locator
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
       
        //10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Andhu");
      
		//11.enter the departmentname Field Using id Locator
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
      
        //12.enter the description Field Using any Locator of your choice
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Engineer");
       
        //13.enter the email id Field Using the Locator of your choice
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("20g109ananthi.m@gmail.com");
        
        //14.select the state using drop down with the help of Select keyword
        WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        //create an object to select the state
        Select StateDropDown = new Select(StateDD);
        StateDropDown.selectByVisibleText("New York");
        
        //15.click create button
        driver.findElement(By.name("submitButton")).click();
        //check the current page visible is right by comparing
        
        //16.click on Editing button
        driver.findElement(By.linkText("Edit")).click();
        
        //17.clear the description field using .clear()
        driver.findElement(By.id("updateLeadForm_description")).clear();
        
        //18.fill importantNote field with any text
        driver.findElement(By.name("importantNote")).sendKeys("Manual and Automation");
        
        //119.click on update  button
        driver.findElement(By.name("submitButton")).click();
        
        //20.get the title of resulting page. using driver.getTitle()
        String text1="View Lead | opentaps CRM";
        String text2=driver.getTitle();
        if(text1.equals(text2))
        //if(text1==text2)
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
        }        
        
	}

}





