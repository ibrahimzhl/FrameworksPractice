package test;

import org.testng.annotations.Test;

import page.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LoginPageTest {
	
	LoginPage loginPage;
  @Test
  public void f() {
	  loginPage.login("admin", "admin123");
	  System.out.println("User logged in");
  }
  @BeforeClass
  public void beforeClass() {
	  loginPage = new LoginPage();
	  System.out.println("Object created for LoginPage");
  }

  @AfterClass
  public void afterClass() {
  }

}
