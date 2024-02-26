package TestNGdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertdemo4 
{
	@Test
	public void Alertdemo() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/manage-bookings.html");
		WebElement bookings=driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		bookings.click();
		Thread.sleep(4000);
		
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='btn theme-btn btn-default']"));
		searchbutton.click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
	
		String alertText=driver.switchTo().alert().getText();
		System.out.println("alertText:"+alertText);
		alert.accept();
		
 		WebElement label=driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		String actualdata=label.getText();
		System.out.println(actualdata);
}
}