package NRAI.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseClassPackage.BaseClassMaven;

public class NraiDashboardPage extends BaseClassMaven{
	
	@FindBy(xpath=("/html/body/section/section/section/div/div/div/ul/li[38]/a/div[2]/h4"))    //  
	public
	WebElement documentWriteUp;
	
	
	
	public NraiDashboardPage(){
		
		PageFactory.initElements(driver, this);
	}
	

	public NraiDocumentWriteUpPage clickDocWriteup(){
	documentWriteUp.click();
	return new NraiDocumentWriteUpPage();
	
	}

}
