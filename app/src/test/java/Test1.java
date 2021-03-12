import org.junit.Test;

import java.net.MalformedURLException;

public class Test1 {
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy Tab A");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("udid", "R9WN10YN5GJ");
        capabilities.setCapability("appPackage", "com.zimad.unityaiotest");
        capabilities.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    public void testAddition() {
        MobileElement SelectServer = (MobileElement) driver.findElementBy;
    }

    @AfterMethod
    public void teardown() { driver.quit(); }
}
