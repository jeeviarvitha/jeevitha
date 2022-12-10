package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingUpIneuron {

	public static void main(String[] args) throws InterruptedException {
		     
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("http://ineuron-courses.vercel.app/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='subLink']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("name")).sendKeys("jeevitha");
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("jeevi@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("sus123");
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[text()='Testing']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Female']")).click();
			Thread.sleep(1000);
			WebElement stateDropdown=driver.findElement(By.cssSelector("select#state"));
			Select s1=new Select(stateDropdown);
			s1.selectByIndex(12);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
			driver.get("http://ineuron-courses.vercel.app/login");
			Thread.sleep(1000);
			driver.findElement(By.id("email1")).sendKeys("jeevi@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password1")).sendKeys("sus123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
