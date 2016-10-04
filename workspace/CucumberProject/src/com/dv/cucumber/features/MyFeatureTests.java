package com.dv.cucumber.features;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFeatureTests {
	
	WebDriver driver = new ChromeDriver();	

	@Given("^landed on the mercury tours page$")
	public void landOnHomePage() throws Throwable {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@When("^Clicked on register button$")
	public void clickOnRegister() throws Throwable {
		WebElement webelement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		webelement.click();
		Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours");
	}

	@When("^filled in all the forms$")
	public void fillinForm() throws Throwable {
		WebElement fnElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		fnElement.sendKeys("Venkat");
		WebElement lnElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		lnElement.sendKeys("Dantuluri");
		WebElement phElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
		phElement.sendKeys("(210)798-8987");
		WebElement emailElement = driver.findElement(By.id("userName"));
		emailElement.sendKeys("sample@gmail.com");
		WebElement addressElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		addressElement.sendKeys("15761 chase hill blvd");
		WebElement cityElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
		cityElement.sendKeys("San Antonio");
		WebElement stElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		stElement.sendKeys("Texas");
		WebElement codeElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
		codeElement.sendKeys("78256");
		WebElement unElement = driver.findElement(By.id("email"));
		unElement.sendKeys("rahul");
		WebElement pw1Element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		pw1Element.sendKeys("thisissamplepwd");
		WebElement pw2Element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"));
		pw2Element.sendKeys("thisissamplepwd");
	}

	@When("^Clicked on the submit button$")
	public void hitSubmit() throws Throwable {
		WebElement webelement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
		webelement.click();
		
	}

	@Then("^create account success page should be displayed$")
	public void validateSuccessPage() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		
	}



}
