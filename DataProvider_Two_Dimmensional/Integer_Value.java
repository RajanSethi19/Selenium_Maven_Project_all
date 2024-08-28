package DataProvider_Two_Dimmensional;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Integer_Value {
	
	
	@DataProvider(name="data1")
	public Object [][] method1(){
		
		return new Object[][] {{10},{20},{30},{40}};
		
		
	}
	@Test(dataProvider= "data1")
	public void testcase1(int a) {
		Reporter.log("The data is "+a);
		
	}
	

}
