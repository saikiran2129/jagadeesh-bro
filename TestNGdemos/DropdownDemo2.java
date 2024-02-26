package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo2 
{
 
	@Test
	public void Dropdown() throws InterruptedException 
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement departingdropdown=driver.findElement(By.xpath("//select[@name='fromPort']"));
 		Select departingdropdown1 =new Select(departingdropdown);
 		departingdropdown1.selectByIndex(3); 	
 		Thread.sleep(3000);
 		departingdropdown1.selectByVisibleText("London");
		Thread.sleep(3000);
		departingdropdown1.selectByValue("Sydney");
 		Thread.sleep(3000);

}
}