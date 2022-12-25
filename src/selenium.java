import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class selenium {
	
public static void main(String[] args) {
	
	//Step1 : system--class, setProperty --static Method 
	
	// classname.methodname("key","value")
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\senth\\SeleniunTest\\drivers\\chromedriver.exe");
	
	
	//step 2 create instances
	
	WebDriver driver = new ChromeDriver();
	
	// step 3  launch the url--->get("url")
	
	driver.get("https://www.facebook.com/");
	
	//step 4 : maximize the window
	
	driver . manage().window().maximize();
	
	//or
  // Options manage = driver.manage();
   //Window window = manage.window();
   //window.maximize();
  
	
}
}
