package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		 int count=0;
		 int retry=1;
		 if(count<retry) 
		 {
			 count++;
			 return true;
		 }
		return false;
	}

}
