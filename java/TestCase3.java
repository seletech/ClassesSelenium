import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Selenium\\SeleTech\\Programs\\jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // open browser
	
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		/*
		 * driver.findElement(By.className("inputtext")).sendKeys("test@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("password");
		 * driver.findElement(By.name("login")).click();
		 */
		
		//driver.findElement(By.partialLinkText("password")).click();
		
		String s = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(s);
		
		driver.findElement(By.xpath("//a[@href='https://te-in.facebook.com/']")).click();
		
	}
}
