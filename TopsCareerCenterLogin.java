package com.assesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class TopsCareerCenterLogin {
	
	static AppiumDriver driver=null;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		openinstagram();
		
	}
	
	public static void openinstagram() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi 2201117TI");
		cap.setCapability("udid", "e1b0f00a");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13.0");
		cap.setCapability("appPackage", "com.miui.chrome");
		cap.setCapability("appActivity", "com.miui.chrome.cal.chromeActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		driver= new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Tops Career Center");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();
		Thread.sleep(2000);
		/*
		 * Actions enter=new Actions(driver); WebElement
		 * search=driver.findElement(By.id("APjFqb")); Action key=(Action) enter
		 * .moveToElement(search) .sendKeys("Tops Career Center") .sendKeys(key.RETURN);
		 * .
		 */
		
		driver.findElement(By.id("user-name")).sendKeys("9157238002");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("9157238002");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
