package CircleCIIntegration.CircleCIIntegration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() throws InterruptedException {
		
 		
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
//		((DesiredCapabilities) caps).setCapability(“takesScreenshot”, true);
		((DesiredCapabilities) caps).setCapability(
		PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		"/Users/bapur/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs"
		);
		WebDriver driver = new PhantomJSDriver(caps);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		System.out.println("driver instance :" + driver);
 				
	}

}
