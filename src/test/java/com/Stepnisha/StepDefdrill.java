package com.Stepnisha;

import java.awt.AWTException;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefdrill {
	static WebDriver driver;
	ArrayList<String> al = new ArrayList<String>();
	public static int i;

	@Given("^Open the URL_Nisha$")
	public void open_the_URL() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://elastic.rapidtestpro.com:8086/index");
		driver.manage().window().maximize();

		// throw new PendingException();
	}

	@When("^when i enter username and password as password \"([^\"]*)\"_Nisha$")
	public void when_i_enter_username_and_password_as_password__Nisha(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		i = Integer.parseInt(arg1); // type casting //0
		al = Mysqldata.getFromDB("Username");
		driver.findElement(By.id("username")).sendKeys(al.get(i));
		al.clear();
		al = Mysqldata.getFromDB("Password");
		driver.findElement(By.id("password")).sendKeys(al.get(i));
		al.clear();
		driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary btn-block']")).click();
		// throw new PendingException();
	}

	@When("^Navigate to Savings Balance_Nisha$")
	public void navigate_to_Savings_Balance_Nisha() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//div[@class='panel panel-success']//span[@class='pull-left'][contains(text(),'View Details')]"))
				.click();

		// throw new PendingException();
	}

	@Then("^close_Nisha(\\d+)$")
	public void close_nisha(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		// throw new PendingException();
	}

	@Given("^login with credentials \"([^\"]*)\"_Nisha$")
	public void login_with_credentials__Nisha(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://elastic.rapidtestpro.com:8086/index");
		driver.manage().window().maximize();

		i = Integer.parseInt(arg1);
		al = Mysqldata.getFromDB("Username");
		driver.findElement(By.id("username")).sendKeys(al.get(i));
		al.clear();
		al = Mysqldata.getFromDB("Password");
		driver.findElement(By.id("password")).sendKeys(al.get(i));
		al.clear();

		driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary btn-block']")).click();
		// throw new PendingException();
	}

	@When("^click on view(\\d+) details_Nisha$")
	public void click_on_view_details_Nisha(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//div[@class='panel panel-info']//span[@class='pull-left'][contains(text(),'View Details')]"))
				.click();

		// throw new PendingException();
	}

	@When("^enter the filter criteria_db$")
	public void enter_the_filter_criteria_db() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='example_length']")));
		java.util.List<WebElement> e = dropdown.getOptions();
		int count = e.size();
		al = Mysqldata.getFromDB("Sort Entries");
		dropdown.selectByValue(al.get(i));
		al.clear();
		al = Mysqldata.getFromDB("Search");
		driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys(al.get(i));
		al.clear();
	}

	@Then("^close_Nisha$")
	public void close() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.close();
		// throw new PendingException();
	}
}
