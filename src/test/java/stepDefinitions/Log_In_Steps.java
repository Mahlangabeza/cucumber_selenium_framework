package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Log_In_Steps extends Base_PO {

    private WebDriver driver = getDriver();

    private Login_PO login_po;

    public  Log_In_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }
     @Given("I have visited the webdriver university login page")
    public void i_have_visited_the_webdriver_university_login_page() {
       login_po.navigateTo_webDriverUniversity_login_Page();
    }

    @When("I enter a username {word}")
    public void i_enter_a_username_webdriver(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }
    @When("I enter {word} into the username text box")
    public void i_enter_a_valid_username_into_the_username_text_box(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }
    @When("I enter a password {word}")
    public void i_enter_a_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("I enter {word} into the password text box")
    public void i_enter_a_valid_password_into_the_password_text_box(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("an alert text box with {string} should be displayed")
    public void an_alert_text_box_with_validation_succeeded_should_be_displayed(String message) {

        String alert_Message = driver.switchTo().alert().getText();
        Assert.assertEquals(alert_Message, message);

    }

    @Then("I should be presented with the following validation message {}")
    public void i_should_be_presented_with_the_following_validation_message_validation_succeeded(String validationMessage) {
        String validation_message = driver.switchTo().alert().getText();

        Assert.assertEquals(validation_message, validationMessage);

    }
}
