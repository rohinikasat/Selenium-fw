package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSXdata;

public class MyFirstTest extends BaseTest{
	
	@Test(dataProviderClass = ReadXLSXdata.class, dataProvider = "testData")
	public static void LoginTest(String username, String password) throws InterruptedException {
		System.out.println(loc.getProperty("signin_button"));
		driver.findElement(By.xpath(loc.getProperty("signin_button"))).click();
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		Thread.sleep(4000);
		
	}
}
