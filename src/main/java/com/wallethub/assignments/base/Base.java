package com.wallethub.assignments.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wallethub.assignments.util.Utilities;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public  static void Initialise() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\wallethub\\assignments\\config\\config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_TIMEOUT,TimeUnit.SECONDS);
		///driver.get(prop.getProperty("facebookurl"));
		
		
		
	}
	

}
