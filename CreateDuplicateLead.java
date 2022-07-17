package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals("Logout"))
		{
			System.out.println("sucessfully logged in");
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abc");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kirubaavathy");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnasamy");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kiruba");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Kiruba");
			driver.findElement(By.className("inputBox")).sendKeys("cbe.kiruba93@gmail.com");
					
			WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select select = new Select(dropdown1);
			select.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			String title= driver.getTitle();
			System.out.println(title);
			
			String verify1 = driver.getTitle();
			System.out.println(verify1);
			if(verify1.equals("View Lead | opentaps CRM"))
			{
				System.out.println("Sucessfully loggedin in");
			}
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiru");
			driver.findElement(By.className("smallSubmit")).click();
			String title1= driver.getTitle();
			System.out.println(title1);
			
			


			
			
			
			
			
			
				
			
		}
		
	}

}
