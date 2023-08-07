package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) {
		        // Launch  Chrome browser 
				ChromeDriver driver=new ChromeDriver();
				//1) Load the URL
				driver.get(" https://www.pvrcinemas.com/");
				//max the 
				driver.manage().window().maximize();
				//02) Click  on Movie Library
				    //click on navigate icon
				driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
				      //click on movie library
				driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
				
				//03) Select the City -->chennai
				//driver.findElement(By.xpath("//input[contains(@class,'p-element ng-tns-c73-1')]")).click();
				//driver.findElement(By.linkText("Chennai")).click();
				WebElement city=driver.findElement(By.xpath("//select[@name='city']"));
				Select city1=new Select(city);
				city1.selectByVisibleText("Chennai");
				
				//4.select the genre animation 
				WebElement first=driver.findElement(By.xpath("//select[@name='genre']"));
				Select first1=new Select(first);
				first1.selectByVisibleText("ANIMATION");
				
				//5. select the language as english
			     WebElement first2=driver.findElement(By.xpath("//select[@name='lang']"));
				Select frist3=new Select(first2);
				frist3.selectByVisibleText("ENGLISH");
				
				//06) Click on Apply
				driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
				
				//07) Click on first resulting animation movie
				 driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
				 //08) Click proceed to book
				 driver.findElement(By.xpath("//div[text()='Proceed To Book']")).click();
				 //9) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
			WebElement cinema=driver.findElement(By.id("cinemaName"));
			Select cinema1=new Select(cinema);
			cinema1.selectByVisibleText("PVR Heritage RSL ECR Chennai");
			
				//enter the name fields
				 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ananthi");
				 
				 //enter the prefered show time 
				WebElement show=driver.findElement(By.xpath("//select[@name='timings']"));
				Select show1=new Select(show);
				show1.selectByVisibleText("09:00 AM - 12:00 PM");
				
				//enter the no.of.seats
				driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
			
				//f&b requirements
				WebElement f=driver.findElement(By.xpath("//select[@name='food']"));
				Select d=new Select(f);
				d.selectByVisibleText("Yes");
				
				//enter mobile number
				driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8997625781");
				
				//enter the email id
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("20g109ananthi.m@gmail.com");
				
				//10) Click on copy to self 
				driver.findElement(By.xpath("//label[contains(@class,'custom-control custom-radio')]")).click();
				
				//11) Click on  Send Request
				driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
				
				//12) Click cancel 
				driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
				
				//13.verify the title of the page
				String title=driver.getTitle();
				System.out.println(title);
				
				
				
				
			
			

	}

}
