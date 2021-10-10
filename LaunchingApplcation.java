package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplcation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://leaftaps.com/opentaps/");
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
