package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
    	Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.name("PASSWORD"));
		Password.sendKeys("crmsfa");
		Thread.sleep(2000);
		WebElement LoginSubmit = driver.findElement(By.className("decorativeSubmit"));
		LoginSubmit.click();
		
		WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFA.click();
		
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		
		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
		CreateLead.click();
		
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
        CompanyName.sendKeys("Pyraworkz");
        
        WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
        FirstName.sendKeys("Elakkyaselvan");
        
        WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
        LastName.sendKeys("Devarajan");
        
        WebElement SubmitCreateLead = driver.findElement(By.className("smallSubmit"));
        SubmitCreateLead.click();
	}

}
