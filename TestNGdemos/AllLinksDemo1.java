package TestNGdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinksDemo1<webElement> 
{
	@Test
	public void AllLinks()
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.bbc.com/");
		List<WebElement> allLinks = Driver.findElements(By.xpath("//a"));
		int linkcount=allLinks.size();
		System.out.println("The total links are :"+linkcount);
	}
}