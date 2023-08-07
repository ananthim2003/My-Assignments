package week3.day5;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
	        	//Launch The Browser
				ChromeDriver driver =new ChromeDriver();
				
				//load the URL
				driver.get(" https://en-gb.facebook.com/");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//add implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//click on create new account button
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				
				//enter the firstname
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ananthi");
				
				//enter the last name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("m");
				
				//enter the mobile number
				driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8567625781");
				
				//enter the password
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ananthi");
				
				// handle all the three dropdowns
				//date
				WebElement state = driver.findElement(By.xpath("//select[@id='day']"));
				Select state1=new Select(state);  
				state1.selectByValue("10");
				
				//month
				WebElement state2 = driver.findElement(By.xpath("//select[@id='month']"));
				Select state3=new Select(state2);
				state3.selectByValue("3");
				
				//year
				WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
				Select yearDD=new Select(year);
				yearDD.selectByValue("2003");
				
				//.click the gender
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				

	}

}
