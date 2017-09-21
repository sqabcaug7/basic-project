package com.sqa.jf.core;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class BasicChromeTest extends BasicTest {

	public BasicChromeTest(String baseUrl) {
		super(baseUrl);
	}

	@Override
	@BeforeClass
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
	}
}
