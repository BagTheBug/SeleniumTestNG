package com.retail.testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.retail.utils.WebDriverUtils;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class TestSetup {
	{
		System.setProperty("atu.reporter.config", "src/test/resources/atu.properties");
	}
	WebDriverUtils utils = new WebDriverUtils();

	@BeforeClass
	public void launch() {
		utils.initialize();
	}

	@BeforeMethod
	public void loadUrl() {
		utils.launchUrl();
	}

	@AfterClass
	public void close() {
		utils.exit();
	}

}
