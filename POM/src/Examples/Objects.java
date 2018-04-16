package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Execution.Ghh;

public class Objects{

	WebDriver driver;
	
	
	public void open() {
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();


	}
	public void logout() {
		
	}
	
	public void close() {
		
		driver.quit();
		System.out.println("hi");
	}
	
}
