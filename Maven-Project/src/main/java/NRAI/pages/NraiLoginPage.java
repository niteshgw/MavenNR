package NRAI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClassMaven;


public class NraiLoginPage extends BaseClassMaven{
	
	//Page Factory - OR:
		@FindBy(name="email")
		WebElement email;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="user_check")
		WebElement AdminCheck;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		
		
		
	public NraiLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public NraiDashboardPage login(String username, String pass){
		
		//System.out.println(prop.getProperty("SuperAdmin"));
		
		email.sendKeys(username);
		password.sendKeys(pass);
		AdminCheck.click();
		submit.click();
		
		return new NraiDashboardPage();		
	}
	
	
	
	
}   
