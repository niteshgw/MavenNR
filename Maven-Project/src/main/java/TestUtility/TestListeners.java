package TestUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import BaseClassPackage.BaseClassMaven;
import TestUtility.TestUtil;

public class TestListeners extends BaseClassMaven implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			TestUtil.takeScreenshotAtEndOfTest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
   

	
	
}
