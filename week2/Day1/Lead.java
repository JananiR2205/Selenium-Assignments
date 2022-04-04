package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {
	
	public static ChromeDriver chrome;
	
	public static ChromeDriver setUp(String url) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		chrome = new ChromeDriver();
		chrome.get(url);
		chrome.manage().window().maximize();
		return chrome;
		
	}
	
	public void createLead() throws InterruptedException {
		
			//step 1 :  Launch URL
				chrome.get("http://leaftaps.com/opentaps/control/login");
				chrome.manage().window().maximize();
				
				//  2. Enter UserName and Password Using Id Locator
				chrome.findElement(By.id("username")).sendKeys("DemoSalesManager");
				chrome.findElement(By.id("password")).sendKeys("crmsfa");
				
				// 3. Click on Login Button using Class Locator
				chrome.findElement(By.className("decorativeSubmit")).click();
				
				//	4. Click on CRM/SFA Link
				chrome.findElement(By.linkText("CRM/SFA")).click();
				
				//	5. Click on Leads Button
				chrome.findElement(By.linkText("Leads")).click();
				
				// 6. Click on Create Lead 
				chrome.findElement(By.linkText("Create Lead")).click();
				
				//	7. Enter CompanyName Field Using id Locator
				chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
						
				
				//	8. Enter FirstName Field Using id Locator
				
				chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
				
				//	 9. Enter LastName Field Using id Locator
				chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
				
				
				//  10. Enter FirstName(Local) Field Using id Locator
				chrome.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janani");
				
				//	11. Enter Department Field Using any Locator of Your Choice
				chrome.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				
				//  12. Enter Description Field Using any Locator of your choice
				chrome.findElement(By.name("description")).sendKeys("Joined newly to this team");
				
				
				//  13. Enter your email in the E-mail address Field using the locator of your choice
				chrome.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("janumca11@gmail.com");
				
				//  14. Select State/Province as NewYork Using Visible Text
				
			      WebElement state = chrome.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			      Select stateoption = new Select(state);
			      stateoption.selectByVisibleText("New York");
						
				//	 15. Click on Create Button
					chrome.findElement(By.name("submitButton")).click();
						
				//   16. Get the Title of Resulting Page. 
				String title = chrome.getTitle();
				System.out.println(title);
				
				
		
	}
	
	public void editlead() throws InterruptedException {
		
    	
		chrome.findElement(By.linkText("Edit")).click();
		chrome.findElement(By.xpath("//textarea[@name='description'] ")).clear();
		chrome.findElement(By.xpath("//textarea[@name='importantNote'] ")).sendKeys("Important");
		chrome.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = chrome.getTitle();
		System.out.println(title);
	
		
	}
	
	public void duplicatelead() throws InterruptedException {
		
    	
		chrome.findElement(By.linkText("Duplicate Lead")).click();
		chrome.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		chrome.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro");
		chrome.findElement(By.xpath("//input[@id='createLeadForm_firstName'] ")).clear();
		chrome.findElement(By.xpath("//input[@id='createLeadForm_firstName'] ")).sendKeys("Sahitya");
		chrome.findElement(By.id("createLeadForm_firstNameLocal")).clear();
		chrome.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sahitya");
		chrome.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = chrome.getTitle();
		System.out.println(title);
		chrome.close();
	
		
	}

	public static void main(String[] args) throws Exception {
		
		Lead.chrome = Lead.setUp("http://leaftaps.com/opentaps");
		
		Lead createlead = new Lead();
		createlead.createLead();
		createlead.editlead();
		createlead.duplicatelead();
	

	}


}
