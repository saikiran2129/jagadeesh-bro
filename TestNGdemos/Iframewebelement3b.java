package TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframewebelement3b 
{
	@Test
	public void Iframewebelement() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/Iframe1%20(1).html");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frame1);
		WebElement frame1_date=driver.findElement(By.xpath("//span[text()='Saturday 31 January 2015']"));
		String text1=frame1_date.getText();
		System.out.println("actual text of text1 : "+text1);
		
		driver.switchTo().defaultContent();
		WebElement inputBox=driver.findElement(By.xpath("//input[@typt='text']"));
		inputBox.sendKeys(text1);
		
		Thread.sleep(3000);
		driver.switchTo().frame(frame1);
		WebElement inner_Frame1=driver.findElement(By.xpath("//iframe[@name='frame1']"));
		driver.switchTo().frame(inner_Frame1);
		WebElement inner_text1=driver.findElement(By.xpath("//span[text()='Saturday 3 January 2015']"));
		String text2=inner_text1.getText();
		System.out.println("actual inner text2 : "+text2);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame1);
		WebElement cityInputBox=driver.findElement(By.xpath("//input[@name='Town']"));
		cityInputBox.sendKeys(text2);
		
		
	}
	
	
	

	}


