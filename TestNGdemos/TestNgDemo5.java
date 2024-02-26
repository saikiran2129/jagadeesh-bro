package TestNGdemos;

import org.testng.annotations.Test;


public class TestNgDemo5
{
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("loginTest of TestNgdemo5");
		System.out.println(0/0);
	}
	@Test(priority=2, dependsOnMethods ="loginTest")
	public void  customerDetails()
	{
		System.out.println(" customerDetails of TestNgdemo5");
		System.out.println(0/0);
	}
}

