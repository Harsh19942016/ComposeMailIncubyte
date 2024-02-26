package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComposeStepDef {
   WebDriver driver;
    @Given("User is on Gmail login page")
    public void user_is_on_gmail_login_page() {
        driver=new ChromeDriver();
        driver.get("https://accounts.google.com/");

    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        WebElement enterMail=driver.findElement(By.xpath("//input[@type=\"email\"]"));
        enterMail.sendKeys("email id");

        WebElement nextButton= driver.findElement(By.xpath("//span[text()=\"Next\"]"));
        nextButton.click();

        WebElement enterPass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
        enterPass.sendKeys("password");

        WebElement passNext= driver.findElement(By.xpath("//span[text()='Next']"));
        passNext.click();


    }

    @Then("User should be able to open the compose window")
    public void user_should_be_able_to_open_the_compose_window() {
        WebElement compose= driver.findElement(By.xpath("//div[text()='Compose']"));
        org.testng.Assert.assertTrue(compose.isDisplayed());
        compose.click();

    }

    @Then("User should be able to close the compose window")
    public void user_should_be_able_to_close_the_compose_window() {
        WebElement Closecompose= driver.findElement(By.xpath("xpath for closing the compose"));
        org.testng.Assert.assertTrue(Closecompose.isDisplayed());
        Closecompose.click();



    }

    @When("User  able opens the compose window")
    public void user_able_opens_the_compose_window() {
        WebElement compose= driver.findElement(By.xpath("xpath for open compose"));
        org.testng.Assert.assertTrue(compose.isDisplayed());
        compose.click();

    }

    @Then("User should be able to enter a subject in the email")
    public void user_should_be_able_to_enter_a_subject_in_the_email() {
        WebElement subjectField= driver.findElement(By.xpath("xpath for sub field"));
        org.testng.Assert.assertTrue(subjectField.isDisplayed());
        subjectField.sendKeys("Incubyte Deliverables");

    }

    @Then("User should be able to verify the entered subject")
    public void user_should_be_able_to_verify_the_entered_subject() {

        WebElement subjectAttribute= driver.findElement(By.xpath("xpath for sub "));
        String actual=subjectAttribute.getAttribute("value");
        String expected ="Incubyte Deliverables";
        org.testng.Assert.assertEquals(actual,expected);
    }

    @When("User able opens the compose window")
    public void userAbleOpensTheComposeWindow() {
        WebElement compose= driver.findElement(By.xpath("xpath for open compose"));
        org.testng.Assert.assertTrue(compose.isDisplayed());
        compose.click();
    }

    @Then("User should be able to enter a body in the email")
    public void user_should_be_able_to_enter_a_body_in_the_email() {
        WebElement emailBody= driver.findElement(By.xpath("email body xpath"));
        org.testng.Assert.assertTrue(emailBody.isDisplayed());
        emailBody.sendKeys("Automtion QA test for Incubyte");

    }

    @Then("User should be able to verify the entered body")
    public void user_should_be_able_to_verify_the_entered_body() {
        WebElement bodyOfEmail= driver.findElement(By.xpath("mail body xpath"));
        String actualBody=bodyOfEmail.getAttribute("value");
        String expectedBody ="Automtion QA test for Incubyte";
        org.testng.Assert.assertEquals(actualBody,expectedBody);

    }

    @Then("User opens the compose window")
    public void user_opens_the_compose_window() {
        WebElement compose= driver.findElement(By.xpath("xpath for open compose"));
        org.testng.Assert.assertTrue(compose.isDisplayed());
        compose.click();

    }

    @Then("User fills recipient, subject, and body fields")
    public void user_fills_recipient_subject_and_body_fields() {
        WebElement recipent  = driver.findElement(By.xpath("recipent mail id"));
        recipent.sendKeys("recipent mail id");
        WebElement subjectField= driver.findElement(By.xpath("xpath for sub field"));
        subjectField.sendKeys("Incubyte Deliverables");
        WebElement emailBody= driver.findElement(By.xpath("email body xpath"));
        emailBody.sendKeys("Automtion QA test for Incubyte");


    }

    @Then("User should be able to send the email")
    public void user_should_be_able_to_send_the_email() {
        WebElement sendButton= driver.findElement(By.xpath("xpath for send button"));
        org.testng.Assert.assertTrue(sendButton.isDisplayed());
        sendButton.click();

    }

    @Then("User should view  confirmation message")
    public void user_should_view_confirmation_message() {
        WebElement confirmationMessage= driver.findElement(By.xpath("xpath for confirmation message"));
        org.testng.Assert.assertTrue(confirmationMessage.isDisplayed());

        driver.close();

    }



}

