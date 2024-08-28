package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_Source.Homepage;
import Amazon_Source.Login_Amazon;
import Amazon_Source.Registration;

public class TestCase3 extends LaunchQuit{
	@Test
	public void registration()
	{
		
		Homepage h1=new Homepage(driver);
		h1.accountlist(driver);
		h1.registration_start();
		
		
		Registration r= new Registration(driver);
		r.user_name();
		r.Phone_no();
		r.Password();
		r.continue_now();
}
}
