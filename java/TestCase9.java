import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase9 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		
		driver.findElement(By.cssSelector("input[value='apple']")).click();
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='apple']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
	}
}
