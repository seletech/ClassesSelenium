import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");

		String arr[] = { "Select", "Option1", "Option2", "Option3" };

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select obj = new Select(dropDown);
		List<WebElement> actual = obj.getOptions();
		

		for (int i = 0; i <= 3; i++) {
			obj.selectByIndex(i);
			System.out.println(actual.get(i).getText());
			if (actual.get(i).getText().equals(arr[i])) {
				System.out.println("pass");
			}
		}

		
		
	}
}
