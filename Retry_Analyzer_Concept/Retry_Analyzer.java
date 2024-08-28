package Retry_Analyzer_Concept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer {
int current_count=0;
int Retry_Count=2;

	@Override
	public boolean retry(ITestResult result) {
		
		
		if(current_count<Retry_Count)
		{
			current_count++;
		
		return true;
		}
		return false;
	}
	

}
