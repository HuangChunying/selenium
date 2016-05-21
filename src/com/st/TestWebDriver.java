package com.st;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestWebDriver {
	private WebDriver wd;
	private String url;
	// @Before
	// public void setUp()throws IOException{
	// //driver = new FirefoxDriver();
	// String chDriver = new File(new File(".").getCanonicalPath()+"\\" +
	// "driver/chromedriver.exe").getCanonicalPath();
	// System.setProperty("webdriver.chrome.driver", chDriver);
	// System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)"
	// + "\\Google\\Chrome\\Application\\chrome.exe");
	// url = "https://www.baidu.com/";
	// wd = new ChromeDriver();
	// wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// }

	public static void StartFireFoxNotByDefault() {
		System.out.println("start firefox browser...");
		System.setProperty("webdriver.firefox.bin", "D:/firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		Navigation navigation = driver.navigate();
		navigation.to("http://www.baidu.com/");
		System.out.println("start firefox browser succeed...");
	}

	public static void firefoxstart() {

		// 如果火狐浏览器没有默认安装在C盘，需要制定其路径
		System.setProperty("webdriver.firefox.bin", "D:/firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");

		driver.manage().window().maximize();

		WebElement txtbox = driver.findElement(By.name("wd"));
		txtbox.sendKeys("air");

	//	WebElement btn = driver.findElement(By.id("su"));
		WebElement btn = driver.findElement(By.xpath(".//*[@id='su']"));
		
		btn.click();
		//driver.close();

	}

	public static void StartFireFoxLoadPlugin() {
		System.out.println("start firefox browser...");
		System.setProperty("webdriver.firefox.bin", "D:/firefox/firefox.exe");
		File file = new File("C:/Users/luoer/AppData/Roaming/Mozilla/Firefox/Profiles/0fq627tu.default/extensions/firebug@software.joehewitt.com.xpi");
		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		profile.setPreference("extensions.firebug.currentVersion", "2.0.16");
		// active firebug extensions
		profile.setPreference("extensions.firebug.allPagesActivation", "on");
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.baidu.com");
		System.out.println("start firefox browser succeed...");
	}

	// @Test
	// public void testWD(){
	// wd.get(url);
	// }
	
	@Test
	public void firefox() {
		StartFireFoxLoadPlugin();
		//firefoxstart();
		// StartFireFoxNotByDefault();
	}

}
