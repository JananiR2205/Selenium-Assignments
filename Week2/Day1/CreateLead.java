package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver create = new ChromeDriver();
		
		//step 1 :  Launch URL
		create.get("http://leaftaps.com/opentaps/control/login");
		create.manage().window().maximize();
		
		//  2. Enter UserName and Password Using Id Locator
		create.findElement(By.id("username")).sendKeys("democsr");
		create.findElement(By.id("password")).sendKeys("crmsfa");
		
		// 3. Click on Login Button using Class Locator
		create.findElement(By.className("decorativeSubmit")).click();
		
		//	4. Click on CRM/SFA Link
		create.findElement(By.linkText("CRM/SFA")).click();
		
		//	5. Click on Leads Button
		create.findElement(By.linkText("Leads")).click();
		
		// 6. Click on Create Lead 
		create.findElement(By.linkText("Create Lead")).click();
		
		//	7. Enter CompanyName Field Using id Locator
		create.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
		
		//	8. Enter FirstName Field Using id Locator
		
		create.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		
		//	 9. Enter LastName Field Using id Locator
		create.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		
		//  10. Enter FirstName(Local) Field Using id Locator
		create.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janani");
		
		//	11. Enter Department Field Using any Locator of Your Choice
		create.findElement(By.id("createLeadForm_departmentName")).sendKeys("Janani");
		
		//  12. Enter Description Field Using any Locator of your choice
		create.findElement(By.name("description")).sendKeys("Joined newly to this team");
		
		
		//  13. Enter your email in the E-mail address Field using the locator of your choice
		create.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("janumca11@gmail.com");
		
		//  14. Select State/Province as NewYork Using Visible Text
		
	      WebElement state = create.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	      Select stateoption = new Select(state);
	      stateoption.selectByVisibleText("New York");
				
		//	 15. Click on Create Button
			create.findElement(By.name("submitButton")).click();
				
		//   16. Get the Title of Resulting Page. 
		String title = create.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		create.close();
	

	}

}
