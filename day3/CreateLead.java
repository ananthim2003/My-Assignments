package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//lanuch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//1.Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser      
		driver.manage().window().maximize();
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		  // 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		//6. Click on Create Lead 
		driver.findElement(By.partialLinkText("Create")).click();
		
		//7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
	    //8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ananthi");

		//9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");

		//10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Andhu");
		
		  // 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		//12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Engineer");
		
		//
		
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("29g109ananthi@gmail.com");
		
		//  14. Select State/Province as NewYork Using Visible Text
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD=new Select(State);
		stateDD.selectByVisibleText("New york");
		
		 //  15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		//16.Get the title of resulting page.refer the video using driver.getTitle()
		String expectedTitle="view Lead|opentaps CRM";
		String actualTitle=driver.getTitle();
		if(expectedTitle==actualTitle) {
			System.out.println("page is displayed");
		}else {
			System.out.println("page is not displayed");
		}
	}




	
	
	
	}


