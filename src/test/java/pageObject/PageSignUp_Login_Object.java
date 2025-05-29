package pageObject;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSignUp_Login_Object {

	public  WebDriver driver;
	
	//creation constructeur 
	
	
    public PageSignUp_Login_Object  (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    //identification des elements 
	@FindBy(how = How.XPATH, using = "//div[@class='signup-form']//h2")
	WebElement txt_new_user;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	WebElement txt_name;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	WebElement txt_mail;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	WebElement bt_signup;
    
    @FindBy(how = How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	 public WebElement txt_create_account;
	
    @FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
		WebElement title_mr;
	   
	@FindBy(how = How.XPATH, using = "//input[@id='id_gender2']")
		WebElement title_mme;

	@FindBy(how = How.XPATH, using = "//input[@id='name']")
	WebElement txt_name_formulaire;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement txt_mail_formulaire;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement txt_password;
	
	
	// construction des methodes
	public String get_new_user() {
		String var = txt_new_user.getText();
		return var;
	}
	
	public void saisir_un_username(String user) {
		txt_name.sendKeys(user);
	}
	
	public void saisir_un_adresse_mail(String mail) {
		txt_mail.sendKeys(mail);
	}
	
	public void cliquer_sur_le_bouton_SignUp () {
		bt_signup.click();
	}
	
	public void remplir_formulaire_part_1(String sexe,String pass) {
		if (sexe.contentEquals("Mr")) {
			
			title_mr.click();
			
		}
		
		else {
			title_mme.click();
		}
		 
		txt_password.sendKeys(pass);
	}
	
	public String recuperer_nom_user()
	{
		String resultat_name = txt_name_formulaire.getAttribute("value");
        return resultat_name;
	}	
	
	public String recuperer_mail_user()
	{
		String resultat_mail = txt_mail_formulaire.getAttribute("value");
        return resultat_mail;
	}	
	
	
	
	
}










