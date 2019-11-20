package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginEl {
	
		private WebDriver driver; 
		
		public LoginEl(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
				
		@FindBy(id="login")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="form-login_submitAuth")
		private WebElement loginBtn; 
		
		@FindBy(linkText="I lost my password")
		private WebElement lostBtn;
		
		@FindBy(linkText="Sign up!")
		private WebElement signup;
		
		@FindBy(xpath="//p[text()='Teach courses']")
		private WebElement register;
		
			
		@FindBy(id="registration_firstname")
		private WebElement firstname;
		
		@FindBy(id="registration_lastname")
		private WebElement lastname;
		
		@FindBy(id="registration_email")
		private WebElement email;
		

		@FindBy(id="username")
		private WebElement username;

		@FindBy(id="pass1")
		private WebElement passwordreg;

		@FindBy(id="pass2")
		private WebElement confirmpassword;

		@FindBy(id="registration_phone")
		private WebElement phone;
		
		@FindBy(className="btn dropdown-toggle btn-default")
		private WebElement lang;
		
		@FindBy(id="registration_official_code")
		private WebElement code;
		
		@FindBy(id="extra_skype")
		private WebElement skype;
		
		@FindBy(id="extra_linkedin_url")
		private WebElement linkurl;
		
		@FindBy( )
		
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
		}
		
		public void clickLoginBtn() {
		this.loginBtn.click(); 
		}
		
		public void clicklostbutton()
		{
			this.lostBtn.click();
		}

		public void clicksignUp()
		{
			this.signup.click();
			this.register.click();
						
		}
		
		public void regfirstname(String firstname)
		{
			this.firstname.clear();
			this.firstname.sendKeys(firstname);
		}
		
		public void reglastname(String lastname)
		{
			this.lastname.clear();
			this.lastname.sendKeys(lastname);
		}
		
		public void regemail(String email)
		{
			this.email.clear();
			this.email.sendKeys(email);
		
		}
		
		public void regusername(String username)
		{
			this.username.clear();
			this.username.sendKeys(username);
		}
		
		public void regpass1(String pass1)
		{
			this.passwordreg.clear();
			this.passwordreg.sendKeys(pass1);
			this.confirmpassword.clear();
			this.confirmpassword.sendKeys(pass1);
			
		}
		
		public void regphone(String phone)
		{
			this.phone.clear();
			this.phone.sendKeys(phone);
			
		}
		
		public void regcode(String code)
		{
			this.code.clear();
			this.code.sendKeys(code);
		}
		
		public void regskype(String skype)
		{
			this.skype.clear();
			this.skype.sendKeys(skype);
		}
		
		public void reglinkurl(String linkurl)
		{
			this.linkurl.clear();
			this.linkurl.sendKeys(linkurl);
		}
		
		/*public void Lang(String Lang) {
			Select lang= new Select(this.driver.findElement(By.id("registration_language")));
			lang.selectByValue("german");*/
			
		}
	}


