package org.testdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	
	   public void bef() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jagad\\eclipse-workspace\\org.net\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	
	public void aft() {
		driver.quit();

}
}