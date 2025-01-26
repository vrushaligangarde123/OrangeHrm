package StepDefinations;

import BaseLayerPackage.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


public class Hooks extends BaseClass{
	@BeforeAll
	public static void setUpBrowser() {
		BaseClass.intialization();
	}
	@After
	public static void refreshBrowser() {
		getDriver().navigate().refresh();
		
	}
      @AfterAll
	public static void tearDown() {
		getDriver().quit();
	}
}
