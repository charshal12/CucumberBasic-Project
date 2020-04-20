package com.tau.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDataTableEx {

	private WebDriver driver;

//@Given("I am in the Login page")
	@Given("I am in the Login page of Para Bank Application using DataTable")
	public void i_am_in_the_Login_page_of_Para_Bank_Application_using_DataTable() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Eclipse Programs - Copy\\Interview\\workspace\\tau-cucumber-com\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("I enter valid credentials using DataTable")
	public void i_enter_valid_credentials_using_DataTable(DataTable table) {
		List<String> loginForm = table.asList();
		driver.findElement(By.name("username")).sendKeys(loginForm.get(0));
		driver.findElement(By.name("password")).sendKeys(loginForm.get(1));
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}

	@Then("I should be taken to the Overview Page using DataTable")
	public void i_should_be_taken_to_the_Overview_Page_using_DataTable() {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).isDisplayed();
		driver.findElement(By.linkText("Log Out")).click();
	}

}