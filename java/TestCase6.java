import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.cssSelector("#email")).sendKeys("test");
	driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("pass");
	System.out.println(driver.findElement(By.cssSelector("div#reg_pages_msg")).getText());
	System.out.println(driver.findElement(By.cssSelector("img.fb_logo")).getAttribute("height"));
	driver.findElement(By.cssSelector("input#pass[type='password']")).clear();
	driver.findElement(By.cssSelector("input.inputtext#email[placeholder='Email address or phone number']")).clear();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
}
}
