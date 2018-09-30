package AppiumDriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCapabilityIOS {
    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {
        DesiredCapabilities desired = new DesiredCapabilities();
        desired.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        desired.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desired.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        desired.setCapability(MobileCapabilityType.APP, "/Users/anoopambunhi/Desktop/Tajawal.ipa");

        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), desired);
        return driver;
    }
}
