package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.NewRegisterMethod;

public class NewRegister {
	
	private WebDriver driver;

	public NewRegister() {
		driver = Hooks.driver;
	}
	@Given("User is on new register form {string}")
	public void user_is_on_new_register_form(String url) throws InterruptedException {
            NewRegisterMethod.launchBrowser(driver, url);
	}


	@And("User enters the firstname as {string}, the lastname as {string} and the email as {string}")
	public void user_enters_the_firstname_as_the_lastname_as_and_the_email_as(String fname, String lname, String email) {
	   NewRegisterMethod.EnterFirstName(driver, fname);
	   NewRegisterMethod.EnterLastName(driver, lname);
	   NewRegisterMethod.EnterEmail(driver, email);
	}

	@And("User clik on the gender as {string}")
	public void user_clik_on_the_gender_as(String gender) {
		NewRegisterMethod.selectGender(driver);

	}

	@And("Enter the mobile number as {string}")
	public void enter_the_mobile_number_as(String mobilenumber) {
		NewRegisterMethod.EnterMobileNumber(driver, mobilenumber);
	    
	}

	@And("User select the date")
	public void user_select_the_date() {
		NewRegisterMethod.selectDOB(driver);
	    
	}

	@And("User enter the subject as {string}, Hobbies as {string}")
	public void user_enter_the_subject_as_hobbies_as(String subject, String hob) {
		NewRegisterMethod.enterNewSubject(driver, subject);
		NewRegisterMethod.selectNewHobbies(driver, hob);
	    
	}

	@And("Upload the profile picture")
	public void upload_the_profile_picture() {
		NewRegisterMethod.SelectPicture(driver);
	   
	}

	@And("User select the {string}")
	public void user_select_the(String address) {
		NewRegisterMethod.SelectAddress(driver, address);
	   
	}

	@And("Select the state as {string} and city as {string}")
	public void select_the_state_as_and_city_as(String state, String city) {
		NewRegisterMethod.selectNewState(driver, state);
		NewRegisterMethod.selectNewCity(driver, city);
	   
	}

	@And("Click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		NewRegisterMethod.Submit(driver);
	   
	}

	@Then("User should be loggen in to the portal")
	public void user_should_be_loggen_in_to_the_portal() throws InterruptedException {
		NewRegisterMethod.Submit(driver);
	}

}
