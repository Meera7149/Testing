package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	
	  WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://chatgpt.com/");
	driver.close();
  }
}
