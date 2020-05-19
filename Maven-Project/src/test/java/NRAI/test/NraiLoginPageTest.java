package NRAI.test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseClassPackage.BaseClassMaven;
import NRAI.pages.NraiDashboardPage;
import NRAI.pages.NraiLoginPage;


public class NraiLoginPageTest extends BaseClassMaven{
	
	NraiLoginPage loginPage;
	NraiDashboardPage dashboardPage;
	
	
	public NraiLoginPageTest(){
		super();
	}
	
	
    @BeforeTest
	public void loginInitlizarion(){
    	
    System.out.println(prop.getProperty("browser"));	
	
		initialization();
		loginPage=new NraiLoginPage();
	}
  
	@Test
	public void logintest(){
		
		dashboardPage =loginPage.login(prop.getProperty("SuperAdmin"), prop.getProperty("Password"));
	}
	
}
