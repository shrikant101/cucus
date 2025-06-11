package com.stepdefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLogin {
WebDriver driver;
WebElement textSearch ;
	@Given("User Is On Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fintechaustralia.org.au");
	}

	@When("User Types a Text a Value")
	public void user_types_a_text_a_value() {
		textSearch =  driver.findElement(By.xpath("//a[@href='https://www.fintechaustralia.org.au/become-a-member'][1]")); 
		textSearch.click();
	}

	@When("User Clicks on Login Button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

	@Then("User Gets the Necessary Outcome")
	public void user_gets_the_necessary_outcome() {
	}
	
	@Given("Testing Log Messages")
	public void testing_log_messages() throws IOException {
		System.out.println("Dummy Test");
		URL url = new URL("https://htasdfdsfdsftpbin.org/status/200");
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		 
		int responseCode = huc.getResponseCode();
		 
		Assert.assertEquals(HttpURLConnection.HTTP_OK, responseCode);
	}
}
