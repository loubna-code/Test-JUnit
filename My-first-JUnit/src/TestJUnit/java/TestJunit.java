package TestJUnit.java ;
   
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PackageDeFunction.classePourTest;
public class TestJunit {
	@BeforeClass
	public static void connexionToDataBase() {
		System.out.println("connexion succeful to data base!!!!!");
	}
 
  @Test
  public void Test2() {
	  classePourTest C= new classePourTest();
	  boolean b=C.fuctionPourTest2("fadkscxbska");
	  assertEquals(b,false);
	  System.out.println("Test2");
  }
  @AfterClass
	public static void endToDataBase() {
		System.out.println("Ending succeful of data base!!!!!");
	}
  
  
}