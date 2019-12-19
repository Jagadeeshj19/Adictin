package org.base;

import org.openqa.selenium.WebElement;
import org.testdef.Hooks;

public class BaseClass {

	public static void launch(String url) {
		Hooks.driver.get(url);
	}
	public static void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void click(WebElement w) {
		w.click();
	}
	public static void SelectByText(WebElement w,String s) {
		w.sendKeys(s);
	}
	
}
