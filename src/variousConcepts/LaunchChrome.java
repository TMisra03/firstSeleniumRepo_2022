package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	//properties // variables // fields
	// methods // contains statements
	
	public static void main(String[] args) {
		
		// webdriver object
		WebDriver driver = new ChromeDriver();
		// fetching the application
		driver.get("https://www.google.com/");
		// maximize
		driver.manage().window().maximize();
		// type in box
		driver.findElement(By.name("q")).sendKeys("selenium");
		// click on button
		driver.findElement(By.name("btnK")).click();
	}
}
