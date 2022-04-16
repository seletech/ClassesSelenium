import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seletech.in/practice/");
		
		String txt = driver.findElement(By.cssSelector("//*[@id='select-class-example']/fieldset/legend")).getText();
		
		System.out.println(txt);
	}

}
