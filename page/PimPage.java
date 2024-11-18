package page;

import org.openqa.selenium.By;

import base.TestBase;

public class PimPage  extends TestBase {
	
	By employeeName = By.xpath("//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]//input");
	
	void searchEmployee()
	{
		driver.findElement(employeeName).sendKeys("abc");
	}
	

}
