package week3.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DeplicateLead {

	public static void main(String[] args) {
			//1.Launching the URL
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//Maximizes the window
			driver.manage().window().maximize();
			
			//2.Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		    
			//3. Click on Login Button using Class Locator
	        driver.findElement(By.className("decorativeSubmit")).click();
	        
	        //4.Click on CRM/SFA Link
	        driver.findElement(By.linkText("CRM/SFA")).click();
	       
	        //Check whether we are the page is correct using the text over there and print it
	        String text=driver.findElement(By.tagName("h2")).getText();
	        System.out.println(text);
	       
	        //5.click leads button
	        driver.findElement(By.linkText("Leads")).click();
	        
	        //6.click on create leads 
	        driver.findElement(By.partialLinkText("Create")).click();
	       
	        //7.enter the company name field using id locator
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	        
	        //8.enter the first name field using id locator
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ananthi");
	       
	        //9.enter the last name field using id locator
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	        
	        //10. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Andhu");
			
	        //11.enter the department field using any locator of your choice
	        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	        
	        //12.enter the description field  field using any locator of your choice
	        driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Engineer");
	       
	        //13.enter the email  in the e-main address field using the  locator of your choice
	        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("20g109ananthi.m@gmail.com");
	        
	        //14.select the state/Provinces newyork using visible text
	         WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        //create an object to select the state
	        Select StateDropDown = new Select(StateDD);
	        StateDropDown.selectByVisibleText("New York");
	        //15.click create button
	        driver.findElement(By.name("smallSubmit")).click();
	        
	        //16.get the title of resulting page. using driver.getTitle()
	        String text1="View Lead | opentaps CRM";
	        String text2=driver.getTitle();
	        if(text1.equals(text2)) {
	        	System.out.println("true");
	        }
	       else {
	        	System.out.println("False");
	        }
	        //17.create on duplicate button
	        driver.findElement(By.className("subMenuButton")).click();
	       
	        //18.clear the companyname field using .clear() and enter new companyname 
	        driver.findElement(By.id("createLeadForm_companyName")).clear();
	        //enter another new input in company name
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf1");
	        
	        //19.clear the first name field using .clear() and enter new firstname 
	        driver.findElement(By.id("createLeadForm_firstName")).clear();
	        //enter the new first name
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Andhu");
	        //20.click on create lead button
	        driver.findElement(By.className("smallSubmit")).click();
	        
	        //21.get the title of resulting page and using driver.getTitle()
	        String text3="View Lead | opentaps CRM";
	        String text4=driver.getTitle();
	        if(text3.equals(text4)) 
	        {
	        	System.out.println("True");
	        }
	        else
	        {
	        	System.out.println("False");
	       }
	        
	        
	        
		}

	

}
