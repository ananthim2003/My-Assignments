package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args)  throws InterruptedException 
	{
	     //1. Launch  Chrome browser 
		 ChromeDriver driver=new ChromeDriver();
		
		 //2. Load the URL
		 driver.get(" https://www.amazon.in/");
	
		 //maximize the window
	 	 driver.manage().window().maximize();
	 	 
	 	 // add  implicitlyWait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	     //3) Type "Bags" in the Search box
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
		 // driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		 // 4.Choose the item in the result (bags for boys)
		 driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		  
		 //5.Print the total number of results (like 50000)1-48 of over 50,000 results for "bags for boys"
		 System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		
		 //6.select the first 2 brands in the left menu(like american tourister, generic)
		 driver.findElement(By.xpath("//span[text()='Skybags'and @class='a-size-base a-color-base']")).click();
		 driver.findElement(By.xpath("//span[text()='Safari' and @class='a-size-base a-color-base']")).click();
			  
		 //7.choose the new arrivals\
		 driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
			    
		 //8.print the first resulting bag info(name ,discount price)
	     System.out.println(driver.findElement(By.xpath("//span[text()='Safari']")).getText());
	     System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
			    
	     //9,get the page title and choose the browser(driver.close())
		 System.out.println(driver.getTitle());
		 Thread.sleep(10000);
	      driver.close();
			
			
	}

}
