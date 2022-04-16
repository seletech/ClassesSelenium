import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCommands {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://seletech.in/practice/");
		
		//web element commands
		WebElement username = driver.findElement(By.id("email"));
		
		//operational commands
		username.sendKeys("test");
		username.clear();
		WebElement loginButton = driver.findElement(By.name("login"));
		//loginButton.click();
		loginButton.submit();
		
		
		 WebElement checkbox = driver.findElement(By.cssSelector("input[value='apple']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled()); */
		
		driver.get("https://www.facebook.com/");
		 WebElement submit = driver.findElement(By.name("login"));
		// submit.click();
			System.out.println(submit.isSelected());
			System.out.println(submit.isDisplayed());
			System.out.println(submit.isEnabled());
			
	}

}
