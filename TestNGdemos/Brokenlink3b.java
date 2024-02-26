package TestNGdemos;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brokenlink3b 
{
	@Test
	public void Brokenlink() throws IOException
	{

		URL url=new URL("https://rbgtechnologies.com/");
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