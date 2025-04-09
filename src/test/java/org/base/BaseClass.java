package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver d;
	
	public static void launchTheBrowser() {
		WebDriverManager.edgedriver().setup();
		d = new EdgeDriver();
	}
	
	public static void maximizeBrowser() {
		d.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		d.get(url);
		}
	
	public static void closeTab() {
		d.close();
	}
	
	public static void closeEntireBrowser() {
		d.quit();
	}
	
	public static void passText(String txt , WebElement e) {
		e.sendKeys(txt);;
	}

	public static void clickButton (WebElement e) {
		e.click();;;
	}

	public static String getPageTitle() {
		String title = d.getTitle();
		//System.out.println(title);
		return title;
	}

	public static String getCurrentURL() {
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	
}
