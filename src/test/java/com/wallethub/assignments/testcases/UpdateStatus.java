package com.wallethub.assignments.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.wallethub.assignments.base.Base;
import com.wallethub.assignments.pages.LoginPage;



public class UpdateStatus extends Base {
	
	LoginPage lpg;
	@BeforeTest
	public void setup() {
		
		Initialise();

	}
	
	
	
	@Test(priority=0)

	public void Status() {
		driver.get(prop.getProperty("facebookurl"));
		lpg=new LoginPage();
		lpg.Login();
		WebDriverWait wait=new WebDriverWait(driver,20);
	     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Home']"))));
	}
	
	@Test(priority=1)

	public void Hello() {
  System.out.println("hello");
	}
	
	
	
		
    
}
	

