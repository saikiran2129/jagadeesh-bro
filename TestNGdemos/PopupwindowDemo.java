package TestNGdemos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupwindowDemo
{
	@Test
	public void popupwindow()
	{
		WebDriver driver = new ChromeDriver();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://gmail.com");
		driver1.manage().window().maximize();

		WebElement linkData =driver1.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/span/div/div/a"));
		linkData.click();

		Set<String > windowIds = driver1.getWindowHandles();
		Iterator<String> windowsList=windowIds.iterator();
//		String parentWindow=windowsList.next();
//		String childWindowId1=windowsList.next();
//		String childWindowId2=windowsList.next();

		//driver.switchTo().window(childWindowId2);
		for(int i=0;1<windowIds.size();)i++;
		{
			driver.switchTo().window(windowsList.next());
			String expected="";
			
		}
		

		WebElement label=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
		String labelText=label.getText();
		System.out.println("labelText :"+labelText);
	}
}