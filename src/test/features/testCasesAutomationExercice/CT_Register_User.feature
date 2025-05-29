@Register
Feature: creation compte
  je veux creer un compte utilisateur

  @RegisterUser
  Scenario: creation compte utilisateur
		And Navigate to url "http://automationexercise.com"
		Then Verify that Home page is visible successfully
		When Click on SignupLogin button
		Then Verify That "New User Signup!" is visible
		When Enter name "mohamed" and email address "mohamed.ahmed@gmail.com"
		When Click Signup button
		Then Verify the visibility "ENTER ACCOUNT INFORMATION"
		When Fill details: Title "Mr" , Name "mohamed" , Email "mohamed.ahmed@gmail.com", Password "Test$123" 
		And Fill Date of birth "10" , "11" , "1990"  
		And Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!
		And Fill details: First name "ahmed" , Last name "mohamed" , Company "proservices" 
		And Fill details: Address "120 avenue de paris" , Address2, Country "Canada" , State "tunis" , City "tunis" , Zipcode "75014" , Mobile Number "24252623"
		And Click Create Account button
		Then Verify "ACCOUNT CREATED!" is visible
		When Click Continue button
		Then Verify that "Logged in as mohamed" is visibly
		When Click Delete Account button
		Then Verify "ACCOUNT DELETED!" is visible 
		When Click Continue button
		
		
		
		

