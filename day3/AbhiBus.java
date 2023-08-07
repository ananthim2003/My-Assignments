package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AbhiBus {

	public static void main(String[] args) {
		//01) Launch  Chrome browser 
		ChromeDriver driver=new ChromeDriver();
		//2) Load the URL
		driver.get("https://www.abhibus.com/");
		//maixmize the window
		driver.manage().window().maximize();
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//3.Click on Bus
		driver.findElement(By.linkText("Bus")).click();
	
		//4.Type "chennai" in the TO text box
		driver.findElement(By.id("source")).sendKeys("Chennai");
		
		//05) Click the first option from the pop up box
		//driver.findElement(By.className("container mt-5")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//06) Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
	
		// 07) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		 //08) Select tomorrow's date in the Date field
	    driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		
		//09) Click Search Buses
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	
		//09) Print the name of the first resulting bus (use .getText())
		WebElement name=driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
		name.click();
		String name1=name.getText();
		System.out.println("name of the first resulting bus"+name1);
		
		 //10) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.id("Bustypes4")).click();
		 //11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		WebElement seat=driver.findElement(By.xpath("//p[text()='17 Seats Available']"));
	    seat.click();
		String seat1=seat.getText();
		System.out.println("seat selected:"+seat1);
		 //12) Click SelectSeat
		driver.findElement(By.className("book")).click();
		 //13) Choose any one Available seat
		driver.findElement(By.className("pillow")).click();
		
		 //14) Print Seats Selected ,Total Fare
		//WebElement total=driver.findElement(By.xpath("//p[@id='seatnos']"));
		WebElement total=driver.findElement(By.id("seatnos"));
		total.click();
		String total1=total.getText();
		System.out.println("seat seleceted:"+total1);
		//Total Fare
		WebElement fare=driver.findElement(By.id("ticketfare"));
		fare.click();
		String fare1=fare.getText();
		System.out.println("fare:"+fare1);
		
	//15) Select Boarding Point  
		WebElement point=driver.findElement(By.id("boardingpoint_id"));
		point.click();
		Select pointd=new Select(point);
		pointd.selectByVisibleText("Sirsuri-22:00");
		//select dropping point
		WebElement drop=driver.findElement(By.id("droppingpoint_id"));
		drop.click();
		Select drop1=new Select(drop);
		drop1.selectByVisibleText("Majestic-06:32");
		//16.get the title of the page(use.getTitle())
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		//17.close the browser
		driver.close();
		

		

	}

}
