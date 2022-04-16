import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\OneDrive\\Selenium\\SeleTech\\Programs\\jars\\chromedriver.exe");

		// creating object for webdriver
		WebDriver driver = new ChromeDriver(); // open browser
		//maximizing the browser
		driver.get("https://www.facebook.com/");
		
	
		driver.manage().window().minimize();
		//driver.manage().window().fullscreen();

		
		//java any method ()
		//variable 
		// two interfaces option window
		//create object only the class
		String str = "string";
		int i =11;
		//variable declaration
		Options opt = driver.manage();
		Window win = opt.window();
		System.out.println(win.getPosition().getX());
		System.out.println(win.getPosition().getY());

		
		//driver.manage().window().setPosition(new Point(100,300));
		
		
		
		//20 15.6 14 
		//testing
		//driver.manage().window().maximize();
	//	win.maximize();
		
	//	driver.manage().window().maximize();
		//win.maximize();
		//win.fullscreen();
		
		//create object
		
		//Dimension d = new Dimension(500,100); //
		
		//win.setSize(d);
		
			driver.manage().window().setSize(new Dimension(500,100));
		
		//classes
		//interfaces
		//methods
	
	}
}
