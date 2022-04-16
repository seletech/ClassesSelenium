import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssPractice {

	public static void main(String[] args) {
		// Xpath
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\OneDrive\\Selenium\\SeleTech\\Programs\\jars\\chromedriver.exe");

		// creating object for webdriver
		WebDriver driver = new ChromeDriver(); // open browser
		driver.get("https://www.saucedemo.com/");
		/*
		 * driver.findElement(By.xpath("//input[@id= 'user-name']")).sendKeys("test");
		 * driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("test");
		 * driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
		 */
		
		
		driver.findElement(By.cssSelector("//input[@data-test='username']")).sendKeys("anythong");
		driver.findElement(By.cssSelector("")).sendKeys("password");
		driver.findElement(By.cssSelector("input[data-test='login-button']")).click();
	}

}
