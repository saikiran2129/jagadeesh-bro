package TestNGdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindelementsandFindelementDemo1 
{
 
	@Test
	public void Findelementtest()
	{
		WebDriver Driver=new ChromeDriver();
		//WebElement Element=Driver.FindElement(By.id("RBG"));
		WebElement WebElementlist =Driver.findElement(By.id("sai"));
		//int listsize =WebElementlist.Size();
		System.out.println("listsize");
		System.out.println("Done");
		
	}

}
