package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo1
{
	@Test
	public void Dropdown() throws InterruptedException
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement monthDropdown =driver.findElement(By.xpath("//select[@name='toMonth']"));
		System.out.println("monthDropdown:"+monthDropdown);
		Select Dropdownadress=new Select(monthDropdown);
		Dropdownadress.selectByIndex(1);
		Thread.sleep(3000);
		Dropdownadress.selectByVisibleText("August");
		Thread.sleep(3000);
		Dropdownadress.selectByValue("10");

	}
}
