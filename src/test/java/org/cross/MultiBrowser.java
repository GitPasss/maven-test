package org.cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultiBrowser {

	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		
		WebDriver d;
		
		{if(browserName.equals("ChromeBrowser")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().window().maximize();
		}
		else if(browserName.equals("EdgeBrowser")){
			WebDriverManager.edgedriver().setup();
			d= new EdgeDriver();
			d.manage().window().maximize();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			d= new FirefoxDriver();
			d.manage().window().maximize();
		}
	}
		d.get("https://www.facebook.com/");
		}
	
}
