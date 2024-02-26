package TestNGdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class SoftAssertionDemo1 
{

	public void funA()
	{
		System.out.println("funA of SoftAssertionDemo1");
		String excepted="selenium";
		String  actual="selenium";
		SoftAssert saiAssert=new SoftAssert();
		saiAssert.assertEquals(actual, excepted);
		System.out.println("Testcase1 is completed");

		String excepted2="selenium";
		String  actual2="selenium";
		saiAssert.assertEquals( excepted2,actual2);
		System.out.println("Testcase2 is completed");

		String excepted3="selenium";
		String  actual3="selenium";
		saiAssert.assertTrue(true);
		System.out.println("Testcase3 is completed");

		String excepted4="selenium";
		String  actual4="selenium";
		saiAssert.assertTrue( false);
		System.out.println("Testcase4 is completed");

		String excepted5="selenium";
		String  actual5="selenium";
		saiAssert.assertTrue( false);
		System.out.println("Testcase5 is completed");

		String excepted6="selenium";
		String  actual6="selenium";
		saiAssert.assertTrue(true);
		System.out.println("Testcase6 is completed");
		saiAssert.assertAll();
	}
}
