package NRAI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClassMaven;



//@Listeners(TestListeners.class)  
public class NraiDocumentWriteUpPage extends BaseClassMaven{
	
	
	@FindBy(xpath=("//a[@title='Create Document']"))
	WebElement CreateDocBtn;
	
	@FindBy(name=("title"))
	WebElement title;
	
	@FindBy(xpath=("//div[@role='textbox']"))
	WebElement textbox;

	
	@FindBy(xpath=("//button[@aria-label='Bold (CTRL+B)']"))
	WebElement bold;
	
	@FindBy(xpath=("//button[@aria-label= 'Italic (CTRL+I)']"))
	WebElement Italic;
	
	@FindBy(xpath=("//button[@aria-label= 'Underline (CTRL+U)']"))
	WebElement Underline;
	
	
	@FindBy(xpath=("//button[@title= 'Picture']"))
	WebElement Picture;
	
	@FindBy(xpath=("//input[@type='submit']"))
	WebElement submit;
	
	
	@FindBy(xpath=("//button[@class='confirm']"))
	WebElement confirm;


	public NraiDocumentWriteUpPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	

/*	public Object[][] getTestData() throws Exception{
		Object data[][] = TestUtility.TestUtil.getTestData("DocWtiteup");
		return data;
	}*/
		
	public void CrateDoc(String TitleText,String Paragraph){
		
		CreateDocBtn.click();
		title.sendKeys(TitleText);
		textbox.sendKeys(Paragraph);
		
		Picture.sendKeys("C:\\Users\\nitesh\\Desktop\\html\\images\\virat.jpg");
		//String select = Keys.chord(Keys.CONTROL, "a");
		textbox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		bold.click();
		Italic.click();
		Underline.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	//	submit.click();
		
		confirm.click();
	}

}
