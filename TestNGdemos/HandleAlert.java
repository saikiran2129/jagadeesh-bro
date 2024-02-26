package TestNGdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlert 
{
	@Test
	public HandleAlert() throws InterruptedException
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement element=Driver.findElement(By.id("alertBOX"));
		element.click();
		Alert alert=Driver.switchTo().alert();
		String Alerttext=alert.getText();
		System.out.println(Alerttext);
		Thread.sleep(3000);
		alert.accept();
	}

}
