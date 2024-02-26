package TestNGdemos;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgDemo4 
{
	@Test
	 public void funA()
	 {
		 System.out.println("funA of TestNgDemo2");
		
	 }
	@Test
	public void funB()
	{
		 System.out.println("funB of TestNgDemo2");
		 System.out.println(0/0);
	}
	@Test
	public void funC()
	{
		 System.out.println("funC of TestNgDemo2");
		//throw new Exception();
		
		throw new SkipException("SkipException error message");
	}
	@Test(enabled =false)
	public void funD()
	{
		 System.out.println("funD of TestNgDemo2");
		 
}
}