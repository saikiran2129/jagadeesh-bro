package TestNGdemos;

 import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo1 
{
 
@Test
public void funA()
{
	System.out.println("funA HardAssertDemo1");
	String excepted="selenium";
	String  actual="selenium";
	Assert.assertEquals(actual, excepted);
 	System.out.println("funA is done");
}
@Test
public void funB()
{
	System.out.println("funB HardAssertDemo1");
	String excepted="selenium";
	String  actual=" java";
	Assert.assertEquals(actual, excepted);
 	System.out.println("funBis done");
}
@Test
public void funC()
{
	System.out.println("funC HardAssertDemo1");
	String excepted="selenium";
	String  actual=" java";
	Assert.assertEquals(actual, excepted);
 	System.out.println("funC is done");
}
}

