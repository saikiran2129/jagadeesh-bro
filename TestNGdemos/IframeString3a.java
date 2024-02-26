package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeString3a 
{
	@Test
	public void LabelDemo()
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/Iframe1%20(1).html");
		driver.switchTo().frame(0);
		WebElement label=driver.findElement(By.xpath("//span[text()='Tuesday 28 January 2014']"));
		String actuallabel=label.getText();
		System.out.println("actuallabel is :"+actuallabel);
		String expectedlabel="saturday 3 January 2015";
		Assert.assertEquals(actuallabel, expectedlabel, "data is not macthing");
		driver.switchTo().defaultContent();
		WebElement  dataentering=driver.findElement(By.xpath(" "));
		dataentering.sendKeys("Tuesday 28 January 2014");
	}
}
