package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFace {

	@Test
	public void testFace(){
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Sunny\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	System.out.println("Dude congrats");
	driver.quit();
	 
	}
}
