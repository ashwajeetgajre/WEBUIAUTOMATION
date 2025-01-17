package chrome;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WebUITesting extends Capabilities {

	public static void facebookmweb() throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://m.facebook.com");
		driver.findElementById("m_login_email").sendKeys("qwerty");
		driver.findElementById("m_login_password").sendKeys("12345");
		driver.findElementByName("login").click();
		
	}
	
	public static void espn() throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.espn.com");
		driver.findElementByCssSelector("a[id ='global-nav-mobile-trigger']").click();
		driver.findElementByCssSelector("a[class ='menu-trigger nav-pillar nav-more']").click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,480)");
		
	}
	public static void cricbuzz() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("https://m.cricbuzz.com/");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("window.scrollBy(0,480)", "");
		   Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
	}

}
