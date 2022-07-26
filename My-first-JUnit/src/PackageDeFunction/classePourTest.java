package PackageDeFunction;

import org.junit.runner.JUnitCore ;
import org.junit.runner.Result ;
import org.junit.runner.notification.Failure ;

public class classePourTest {
  public String fuctionPourTest(String Word) {
	  if(Word.length()<=2) {
		  return Word.replace("A","");
	  }
	  else {
		  String debut=Word.substring(0,2);
		  String fin=Word.substring(2);
		  return debut.replace("A","")+fin;
	  }  
  }
  public boolean fuctionPourTest2(String Word) {
	  
	  if(Word.length()<=1) {
		  return false;
	  }
	  else if(Word.length()==2) {
		  return true;
	  }
	  else {
		  String debut=Word.substring(0,2);
		  String fin=Word.substring(Word.length()-2);
		  if(fin.equals(debut))
			  return true;
		  else
			  return false;
	  }  
	}	      
}
