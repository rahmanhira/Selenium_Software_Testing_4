
	
	//what the data provider function does,- when the class get data from any other source like excel sheet, its mostly 
	//confidential files like passwords
	//when run the browser with different sets of data every time you run it then you can take help from data provider 
	
	package tests;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import base.Config;
	import locators.locators1;

	public class dataProviderTest extends Config{
		locators1 loc = new locators1();


		@Test (dataProvider = "auth")
		public void testDataProvider (String email, String pass){
			typeByXpath (loc.emailLoc,email);
			typeByXpath (loc.passLoc,pass);
			// login button
		}
		
		
		@DataProvider ( name = "auth")
		public static Object [][] credentials(){
			return new Object [][]{
				{"mafuz", "Test@123"},
				{"sumi", "test.232"}, 
				{"Taltekc@gmail.com", "test234245"}
			};
		}

	}
