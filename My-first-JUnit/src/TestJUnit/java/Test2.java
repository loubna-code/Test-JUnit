package TestJUnit.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import PackageDeFunction.classePourTest;

public class Test2 {
	 @Test
	   public void testSetup() {
		   classePourTest C= new classePourTest();
	      String str=C.fuctionPourTest("AACB");
	      String str1="CB";
	      assertEquals(str1,str);
	      System.out.println("testSetup");
	   }
}
