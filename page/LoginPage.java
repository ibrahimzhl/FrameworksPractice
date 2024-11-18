package page;

import org.openqa.selenium.By;

import base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		super();
	}
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By loginButton = By.xpath("//button[@type=\"submit\"]");
	
	public void login (String usernameText, String passwordText)
	{
		driver.findElement(username).sendKeys(usernameText);
		driver.findElement(password).sendKeys(passwordText);
		driver.findElement(loginButton).click();
		
	}

}
