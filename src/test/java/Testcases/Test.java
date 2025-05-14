package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	
	public static void main(String[] args) 
	
	{
	

		//WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://chatgpt.com/");
	}

}
