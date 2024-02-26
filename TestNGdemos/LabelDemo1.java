package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelDemo1 
{
	@Test
	public void LabelDemo()
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.switchTo().frame(0);
		
		WebElement label=driver.findElement(By.xpath("*[@id='Blog1']/div[1]/div/h2/span]"));
		String actuallabel=label.getText();
		System.out.println("actuallabel is :"+actuallabel);
		String expectedlabel="saturday 3 January 2015";
		Assert.assertEquals(actuallabel, expectedlabel, "data is not macthing");
		driver.switchTo().defaultContent();
		WebElement  dataentering=driver.findElement(By.xpath(" "));
		dataentering.sendKeys("hydrabad");
	}
}















































