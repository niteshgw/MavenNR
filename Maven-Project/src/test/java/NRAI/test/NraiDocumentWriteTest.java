package NRAI.test;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import BaseClassPackage.BaseClassMaven;
import NRAI.pages.NraiDashboardPage;
import NRAI.pages.NraiDocumentWriteUpPage;
import NRAI.pages.NraiLoginPage;



//@Listeners(TestListeners.class)    //Listen from TestListers class. which is created under Test Util Package.
public class NraiDocumentWriteTest extends BaseClassMaven{
	
    NraiLoginPage loginPage;
	NraiDocumentWriteTest doctest;
	NraiDocumentWriteUpPage docpage;
	NraiDashboardPage dashboardPage;
	    //Test
	
	public NraiDocumentWriteTest(){
		
		super();
	}
	
	@BeforeTest
	public void docwriteupInit(){
		
		initialization();
		 
		 loginPage= new NraiLoginPage();
		 
		 dashboardPage =loginPage.login(prop.getProperty("SuperAdmin"), prop.getProperty("Password"));
		 
		// docpage=dashboardPage.clickDocWriteup();
		 
	 	 JavascriptExecutor js=(JavascriptExecutor)driver;
	   //  js.executeScript("window.ScrollBy(0,2000)");
		// js.executeScript("arguments[0].scrollIntoView();",dashboardPage.documentWriteUp );
	 	 
	 	 //This will scroll the web page till end.		
	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 docpage=dashboardPage.clickDocWriteup();
	     	     
	}
	
	@DataProvider
	public Object[][] getTestData() throws Exception{
		Object data[][] = TestUtility.TestUtil.getTestData("DocWtiteup");
		return data;
	}
	
	
	@Test(priority=1)
	public void  TestingScreenshot(){
		
		Assert.assertEquals(true, false);
		
	}
	
	
	@Test(priority=2,dataProvider="getTestData")
	public void NraiDocTest(String TitleText, String Paragraph){
	
		docpage.CrateDoc(TitleText, Paragraph);
	}
}
