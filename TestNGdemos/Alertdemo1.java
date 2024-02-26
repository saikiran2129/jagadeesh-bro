package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  Alertdemo1 
{
	@Test
	public void Alertdemo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/manage-bookings.html");
		WebElement  booking=driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		booking.click();
		Thread.sleep(4000);
		WebElement searching=driver.findElement(By.xpath("//button[@type='submit']"));
		searching.click();
		Thread.sleep(4000);
		WebElement get=driver.findElement(By.xpath("//span[text( )='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		String text= get.getText();
		System.out.println("the text is:"+text);

	}
}


//unhandling alert exception