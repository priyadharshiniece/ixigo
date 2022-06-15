package base;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;


import utilities.ExtentUtility;

public class Page {

	
	public static WebDriver driver;

	public ExtentReports rep = ExtentUtility.getInstance();
	public static ExtentTest test;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	//public static ExcelReader excel = new ExcelReader(
		//	System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\ixiGo (1).xlsx");
	
	
	//public static TopNavigationPage topnavPage;
	public static final DecimalFormat df = new DecimalFormat("0.000");
	public static int totalLayoverduration;
	public static int finalduration = 0;
	
	public static void initConfiguration() {
		Date d = new Date();
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		PropertyConfigurator
				.configure(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\log4j.properties");
		if (Constants.browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.debug("Launching Firefox");
		} else if (Constants.browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
		
			driver = new ChromeDriver(options);
			
			
			log.debug("Launching Chrome");
		} else if (Constants.browser.equals("ie")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.debug("Launching IE");
		}

		driver.get(Constants.url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);

	//	topnavPage = new TopNavigationPage(driver);
	}
	
	public static int splitTime(String time) {
		
		int tot = 0;
		int tot1 = 0;
		String[] array = time.split(" ");
		if (array.length > 1) { // if it has minute and hour content
			String Hour = array[0];
			String[] H = Hour.split("hr");
			String Min = array[1];
			String[] M = Min.split("min");

			int hour = Integer.parseInt(H[0]);
			int minute = Integer.parseInt(M[0]);
			tot = hour * 60 + minute;
			System.out.println(tot);
		} else {
			String[] array1 = time.split(" ");
			String onlyHour1 = array1[0];
			String[] H = onlyHour1.split("hr");
			int hour = Integer.parseInt(H[0]);
			tot1 = hour * 60;
			System.out.println(tot1);
		}
		finalduration = tot + tot1;
		return finalduration;
	}

	public static void quit() {
		driver.close();
	}
}