package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObjects.Base_PO;



public class Contact_Us_Steps extends Base_PO {

    private WebDriver driver = getDriver();


    @Given("I access the WebDriver university contact us page")
    public void i_access_the_web_driver_university_contact_us_page() {
       navigateTo_URL("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        driver.findElement(By.name("first_name")).sendKeys("AutoFN" + generateUniqueNumber(5));
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        driver.findElement(By.name("last_name")).sendKeys("AutoFN"+ generateUniqueNumber(5));
    }
    @And("enter a valid email address")
    public void enter_a_valid_email_address() {
        sendKeys(By.name("email"),"Martin@learningCucumber.com");
    }
    @And("enter a unique comment")
    public void enter_a_unique_comment() {
        driver.findElement(By.name("message")).sendKeys(generateRandomString(15));
    }

    @When("I enter a specific name {word}")
    public void i_enter_a_specific_name(String firstName) {
        driver.findElement(By.name("first_name")).sendKeys(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        driver.findElement(By.name("last_name")).sendKeys(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        driver.findElement(By.name("message")).sendKeys(comment);
    }

    @And("submit the form")
    public void submit_the_form() {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }
    @Then("I should be presented with a thank you message")
    public void i_should_be_presented_with_a_thank_you_message() {

        WebElement contact_Us_Submission_message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(contact_Us_Submission_message.getText(), "Thank You for your Message!");

    }
}
