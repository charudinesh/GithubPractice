package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatetoRyanair {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://sit-aem.ryanair.com/gb/en");
		driver.navigate().forward();
		driver.navigate().back();
		
	}

}
