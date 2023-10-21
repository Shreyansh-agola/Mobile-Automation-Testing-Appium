package com.assesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class AmazonLogin {
	
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
		cap.setCapability("appPackage", "com.miui.amazon");
		cap.setCapability("appActivity", "com.miui.amazon.cal.amazonActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723/");
		driver= new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		/*
		 * test
		 */
		driver.findElement(By.id("user-name")).sendKeys("shreyansh.agola@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Shreyansh@agola2411");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		//find product with search-box
		driver.findElement(By.cssSelector("button.btn.btn-default.bb-search")).click();
		Thread.sleep(2000);
		//add to cart product
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		Thread.sleep(2000);
		//main cart page
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
