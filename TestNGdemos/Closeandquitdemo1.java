package TestNGdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Closeandquitdemo1
{
	@Test
	public void closeAndQuit()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
		driver.quit();
	}
}
