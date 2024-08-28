package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_Source.Homepage;

public class Testcase2 extends LaunchQuit
{

	@Test
	public void seraching_the_product()
	{
		Homepage h1=new Homepage(driver);
		h1.search();
	
}
}