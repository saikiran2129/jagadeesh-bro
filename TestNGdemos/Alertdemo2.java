
package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertdemo2 
{
	@Test
	public void Alertdemo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/manage-bookings.html");
		WebElement bookings=driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		bookings.click();
		Thread.sleep(4000);
		
		WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		searchbutton.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		WebElement label=driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		String actualdata=label.getText();
		System.out.println("actualdata:"+actualdata);
	}
}