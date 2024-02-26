package TestNGdemos;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkDemo3a
{
	@Test
	public void Brokenlink() throws IOException
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get(" file:///C:/Users/admin/Downloads/BrokenLink1.html");
		WebElement Brokenlink =Driver.findElement(By.tagName("a"));
		String linkpresent=Brokenlink.getAttribute("href");
		System.out.println("linkpresent:"+linkpresent);
		System.out.println("Done");
		URL url=new URL(linkpresent);
		HttpsURLConnection hurl=(HttpsURLConnection)url.openConnection();
		int ResponseCode= hurl.getResponseCode();
		System.out.println("ResponseCode:"+ResponseCode);
		if(ResponseCode>=400)
		{
			System.out.println("link is broken");
		}
		else
		{
			System.out.println("link is working fine");
	
		}
}
}