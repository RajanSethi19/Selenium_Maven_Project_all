package DataProvider_Two_Dimmensional;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class String_Value {

	@DataProvider(name = "data")
	public Object[][] method1(){
		
		return new Object [][] {{"Rajan"},{"Sethi"},{"Mother"},{"Father"}};
	}
	
	@Test(dataProvider="data")
		
		public void testcase1(String s) {
			Reporter.log("The vales area "+s);
			
		}
	}


