import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String args[])
	{
		
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.geeksforgeeks.org/");
	}
}
