
package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Examples.Objects;

public class Ghh  extends Objects{
WebDriver driver;
@Test
	public void browser() {
		
		 System.setProperty("webdriver.firefox.marionette", "C:\\Users\\pallavi\\Desktop\\Nageshwari files\\drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		   driver = new FirefoxDriver();
driver.get("http://opensource.demo.orangehrmlive.com/");

Ghh t=new Ghh();
t.open();
t.close();

	}



	
	
	
}
