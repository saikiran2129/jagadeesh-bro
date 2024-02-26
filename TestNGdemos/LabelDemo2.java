package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelDemo2
{
	@Test
	public void labelDemo()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/Iframe1%20(1).html");
		
		
 		driver.switchTo().frame(0);
		WebElement label=driver.findElement(By.xpath("*[@id='Blog1']/div[1]/div/h2/span"));
		String actuallabel=label.getText();
		System.out.println("actuallabel is :"+actuallabel);
		String expectedlabel="saturday 3 January 2015";
		Assert.assertEquals(actuallabel, expectedlabel, "data is not macthing");
		driver.switchTo().defaultContent();
		WebElement  Townfiled=driver.findElement(By.xpath("//input[@id='text1'][1]"));
		Townfiled.sendKeys(actuallabel);
		
		/*
		driver.switchTo().frame( );
		WebElement label=driver.findElement(By.xpath("*[@id='Blog1']/div[1]/div/h2/span]"));
		String actuallabel=label.getText();		System.out.println("actuallabel is :"+actuallabel);
		String expectedlabel="saturday 3 January 2015";
		Assert.assertEquals(actuallabel, expectedlabel, "data is not macthing");
		driver.switchTo().defaultContent();
		WebElement  Townfiled=driver.findElement(By.xpath("//input[@id='text1']"));
		Townfiled.sendKeys(actuallabel);
		*/
		

	}
}
