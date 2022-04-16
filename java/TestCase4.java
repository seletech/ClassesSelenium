import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seletech.in/practice/");
		//driver.manage().window().maximize();
		
		String txt = driver.findElement(By.tagName("legend")).getText();
		System.out.println(txt);
		String attibute= driver.findElement(By.cssSelector("input[value='apple']")).getAttribute("type");
		System.out.println(attibute);
		
		String href = driver.findElement(By.partialLinkText("Example")).getAttribute("href");
		System.out.println(href);
		
		String color = driver.findElement(By.id("openwindow")).getCssValue("background-color");
		System.out.println(color);
		// 4==5
		if(color.equals("rgba(57, 148, 154, 1)")) {
			System.out.println("pass");
		}
		WebElement img =driver.findElement(By.cssSelector("img[height='100']"));
		
		System.out.println(img.getCssValue("vertical-align"));
		System.out.println(img.getSize());
		System.out.println(img.getLocation());
	
	}

}
