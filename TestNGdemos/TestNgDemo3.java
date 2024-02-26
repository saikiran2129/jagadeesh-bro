package TestNGdemos;

import org.testng.annotations.Test;

public class TestNgDemo3 
{
	@Test(priority=4)
	 public void funA()
	 {
		 System.out.println("funA of TestNgDemo2");
	 }
	@Test(priority=3)
	public void funB()
	{
		 System.out.println("funB of TestNgDemo2");
	}
	@Test(priority=2)
	public void funC()
	{
		 System.out.println("funCof TestNgDemo2");
	}
	@Test(priority=1)
	public void funD()
	{
		 System.out.println("funD of TestNgDemo2");
		
	}
}
