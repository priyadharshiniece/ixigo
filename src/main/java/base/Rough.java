package base;

import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {
	public static WebDriver driver;
	 private static final DecimalFormat df = new DecimalFormat("0.000");
	
	@Test
	public void tc() {
		
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	  
	driver.get("https://www.ixigo.com/search/result/flight?from=YTO&to=BOM&date=07042022&returnDate=12042022&adults=1&children=0&infants=0&class=e&source=Modify%20Search%20Form");
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	driver.findElement(By.xpath("//div[@class='more-fltrs u-link']")).click();
	WebElement x = driver.findElement(By.xpath("//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-lower']"));
	WebElement y1 = driver.findElement(By.xpath("//div[@class='fltr layover-duration']//div[@class='noUi-handle noUi-handle-upper']"));
	int totalduration = (Integer.parseInt(driver.findElement(By.xpath("//div[@class='fltr layover-duration']//div[@class='u-ib u-rfloat']")).getText()));
	System.out.println(totalduration);
	Point classname = x.getLocation();
	Point clas = y1.getLocation();
			
			int xcordi = classname.getX();
    System.out.println("Element's Position from left side"+xcordi +" pixels.");
    int ycordi = clas.getX();
    System.out.println("Element's Position from top"+ycordi +" pixels.");
    int t = ycordi-xcordi;
	Actions a = new Actions(driver);
	//a.clickAndHold(x);
	
	  float d= (float)t/totalduration; 
	  String s = df.format(d);
	  System.out.println(s); float g = Float.parseFloat(s); float j =(g*3);
	  System.out.println(j); int y = (int)j; a.dragAndDropBy(x, y,
	  0).release(x).perform();
	 
	
	/*
	 * Dimension sliderSize = x.getSize(); int sliderWidth =sliderSize.getWidth();
	 * System.out.println(sliderWidth); int xCoord = x.getLocation().getX();
	 * System.out.println(xCoord);
	 * 
	 * Actions builder = new Actions(driver); builder.dragAndDropBy (x,xCoord +
	 * sliderWidth+totalduration, 0) .build() .perform();
	 */
	

}
}
