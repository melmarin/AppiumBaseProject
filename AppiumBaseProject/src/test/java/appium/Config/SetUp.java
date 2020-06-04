package appium.Config;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class SetUp {
	protected AppiumDriver<MobileElement> driver;
	//protected Helper helper;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName","UiAutomator1");
		caps.setCapability("deviceName", "Mi Phone");
		caps.setCapability("udid", "cb7b0cac");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10 QKQ1.190825.002");
		caps.setCapability("appPackage", "com.miui.calculator");
		caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
		System.out.println("Application started");
	}
	

	@AfterMethod
	public void tearDown(ITestResult result) {
		/*System.out.println("Test: "+ result.getMethod().getDescription()+ " is: " + result.getStatus());
		if(!result.isSuccess()) {
			helper.takeScreenShot("ERROR");
		}
		for(int i=0; i<=helper.getTabs().size()-1;i++) {
			driver.switchTo().window(helper.getTabs().get(i)).close();
		}*/
	}
}
