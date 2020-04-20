package com.tau.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Eclipse Programs - Copy\\Interview\\workspace\\tau-cucumber-com\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	//@Given("I am in the Login page")
	@Given("I am in the Login page of Para Bank Application")
	public void i_am_in_the_Login_page_of_Para_Bank_Application() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_credentials(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}

	@Then("I should be taken to the Overview Page")
	public void i_should_be_taken_to_the_Overview_Page() {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).isDisplayed();
		driver.findElement(By.linkText("Log Out")).click();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
