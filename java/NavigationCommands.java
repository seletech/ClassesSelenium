import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NavigationCommands {
	public static void main(String[] args) {

		// WebDriverManager 
		WebDriverManager.edgedriver().setup();

		// creating object for webdriver
		WebDriver driver = new EdgeDriver(); // open browser
		driver.get("https://www.saucedemo.com/");
		
		//navigation commands
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://seletech.in/practice/");


	}
}
