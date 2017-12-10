package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import utils.webDriverApi;

public class Config extends webDriverApi{
//this it the configuration class 
	
	//initialize
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","/Users/mustafizurrahman/Downloads/geckodriver");
	    driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
//Intialize the driver 
		//open browser
		//go to the url
		//close the browser
		
	}
	
}
