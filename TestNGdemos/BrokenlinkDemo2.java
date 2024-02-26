package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenlinkDemo2 
{

	@Test
	public void Brokenlink()
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("file:///C:/Users/admin/Downloads/link2.html");
		WebElement Brokenlink =Driver.findElement(By.tagName("a"));
		String linkvalue=Brokenlink.getAttribute("href");
		System.out.println("linkvalue :"+linkvalue);
		Assert.assertNotEquals(linkvalue,"","link is broken");
		System.out.println("Done");
		

}

}
