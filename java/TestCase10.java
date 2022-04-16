import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://seletech.in/practice/");
	List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println(checkboxs.size());
	
	//enhaced for loop
	for(WebElement c : checkboxs) {
		c.click();
	}
	
	for(int i=0;i<checkboxs.size();i++) {
		checkboxs.get(i).click();
	}
}
}
