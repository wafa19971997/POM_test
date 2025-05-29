package stepDefinition;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome_Products_Object;
import pageObject.PageSignUp_Login_Object;

public class CT_Register_User {
	
	WebDriver driver= SetUp.getDriver();
	
	
	PageSignUp_Login_Object sign= new PageSignUp_Login_Object (driver);
	
	PageHome_Products_Object home =new PageHome_Products_Object (driver);
	
	@Given("Navigate to url {string}")
	public void navigate_to_url(String string) {
	    home.acceder_a_url(string);
	}

	@Then("Verify that Home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
	    Assert.assertTrue(home.txt_home.isDisplayed());

	}

	@When("Click on SignupLogin button")
	public void click_on_signup_login_button() {
	  home.cliquer_sur_le_bouton_signUp_Login();
	}

	@Then("Verify That {string} is visible")
	public void verify_that_is_visible(String string) {
	    Assert.assertEquals(sign.get_new_user(), string);

	}

	@When("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String string, String string2) {
	   sign.saisir_un_username(string);
	   sign.saisir_un_adresse_mail(string2);
	}

	@When("Click Signup button")
	public void click_signup_button() {
	   sign.cliquer_sur_le_bouton_SignUp();
	}

	@Then("Verify the visibility {string}")
	public void verify_the_visibility(String string) {
	    Assert.assertTrue(sign.txt_create_account.isDisplayed());

	}

	@When("Fill details: Title {string} , Name {string} , Email {string}, Password {string}")
	public void fill_details_title_name_email_password(String string, String string2, String string3, String string4) {
	 sign.remplir_formulaire_part_1(string, string4);
	 Assert.assertEquals(sign.recuperer_nom_user(), string2);
		Assert.assertEquals(sign.recuperer_mail_user(), string3);
	}

	@When("Fill Date of birth {string} , {string} , {string}")
	public void fill_date_of_birth(String string, String string2, String string3) {
	    
	}

	@When("Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!")
	public void select_checkbox_sign_up_for_our_newsletter_and_select_checkbox_receive_special_offers_from_our_partners() {
	   
	}

	@When("Fill details: First name {string} , Last name {string} , Company {string}")
	public void fill_details_first_name_last_name_company(String string, String string2, String string3) {
	    
	}

	@When("Fill details: Address {string} , Address2, Country {string} , State {string} , City {string} , Zipcode {string} , Mobile Number {string}")
	public void fill_details_address_address2_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5, String string6) {
	 
	}

	@When("Click Create Account button")
	public void click_create_account_button() {
	   
	}

	@Then("Verify {string} is visible")
	public void verify_is_visible(String string) {
	   
	}

	@When("Click Continue button")
	public void click_continue_button() {
	
	}

	@Then("Verify that {string} is visibly")
	public void verify_that_is_visibly(String string) {
	   
	}

	@When("Click Delete Account button")
	public void click_delete_account_button() {
	   
	}
}
