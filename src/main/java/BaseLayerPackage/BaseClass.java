package BaseLayerPackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    private static ThreadLocal<WebDriver>td=new ThreadLocal<WebDriver>();
	public static WebDriver getDriver() {
		return td.get();
	}
	
	public static void intialization() {
		String browsername=PropertiesReader.getProperty("Browsername");
		if(browsername.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
			WebDriver localdriver=new ChromeDriver();
			td.set(localdriver);
		}
		else if(browsername.equalsIgnoreCase("edge")) {
//			WebDriverManager.chromedriver().setup();
			WebDriver localdriver=new EdgeDriver();
			td.set(localdriver);
		}
		else if(browsername.equalsIgnoreCase("incognito")) {
//			WebDriverManager.chromedriver().setup();
			WebDriver localdriver=new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
			td.set(localdriver);
		}
		else if(browsername.equalsIgnoreCase("headless")) {
//			WebDriverManager.chromedriver().setup();
			WebDriver localdriver=new ChromeDriver(new ChromeOptions().addArguments("--headless"));
			td.set(localdriver);
		}
		else {
			System.out.println("enter valid browsername");
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().deleteAllCookies();
		String url=PropertiesReader.getProperty("Base_URL");
		getDriver().get(url);
	}
    
	
}
