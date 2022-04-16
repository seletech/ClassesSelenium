import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
		System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
		System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
		System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
		

		// creating object for webdriver
		WebDriver driver = new ChromeDriver(); // open browser
		
		
		driver.get("https://www.facebook.com/"); // open the url
		// get will wait until page is completly loadded
		System.out.println("hi"); // print hi
		System.out.println(driver.getTitle()); // print title

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//driver.close();
		//quit
	driver.quit();
	}
}

