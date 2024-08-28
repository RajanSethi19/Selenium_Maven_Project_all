package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_Source.Homepage;
import Amazon_Source.Login_Amazon;

public class TestCase1 extends LaunchQuit
{
	@Test
	public void login_to_amazon()
	{
		Homepage h1=new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
	
		Login_Amazon l1=new Login_Amazon(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.signin();
	}
	
	
	
}
