import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		
		
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		
		Select sel = new Select(multiSelect);
		sel.selectByVisibleText("Orange");
		sel.selectByVisibleText("Apple");
		sel.selectByIndex(2);
		System.out.println(sel.isMultiple());
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.deselectAll();
		
	}

}
