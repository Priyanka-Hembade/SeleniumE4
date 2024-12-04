package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadFromXml {
	@Parameters({"browser" , "username" , "password" , "url"})
@Test
public void main(String browser,String username,String password,String url)
{
	System.out.println(browser);
	System.out.println(username);
	System.out.println(password);
	System.out.println(url);
}
}
