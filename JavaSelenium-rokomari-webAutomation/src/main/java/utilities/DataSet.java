package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

	@DataProvider(name = "invalidCredentials")
	public static Object dataset() {
		Object[][] objects = {{"0118999955", "155555", " Wrong email/phone or password"},
				{"0178999955", "155555", " Wrong email/phone or password"}};
		
		return objects;
	}
	
}
