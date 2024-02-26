package TestNGdemos;

import org.testng.annotations.Test;

public class TestNgDemo1 
{
	@Test(groups="sanity")
	 public void funA()
	 {
		 System.out.println("funA of TestNgDemo2");
	 }
	@Test(groups="sanity" )
	public void funB()
	{
		 System.out.println("funB of TestNgDemo2");
	}
	@Test( groups="regression")
	public void funC()
	{
		 System.out.println("funCof TestNgDemo2");
	}
	@Test(groups="regression")
	public void funD()
	{
		 System.out.println("funD of TestNgDemo2");
		

	}
}
