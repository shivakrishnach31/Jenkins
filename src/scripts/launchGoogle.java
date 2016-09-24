package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchGoogle {
	@Test
	public void openingBrowserWithGoogleWebsite() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
