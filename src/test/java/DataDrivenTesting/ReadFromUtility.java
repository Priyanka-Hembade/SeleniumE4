package DataDrivenTesting;

import java.io.IOException;

import com.crm.FileUtility.ReadProperties;

public class ReadFromUtility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String username = ReadProperties.property("username");
		String password = ReadProperties.property("password");
		System.out.println(username);
		System.out.println(password);
	}

}
