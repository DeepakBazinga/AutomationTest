package MobileAuto.AutomationTestsiOS;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Repository.iOSRepo;

public class Test2RealDevice extends IOSObjectRepo {
	
		@BeforeClass
		public void setup() throws MalformedURLException, IOException, InterruptedException
		{
			startApplication();
			Thread.sleep(10000);
		}
		@Test
		public void InShorts() throws InterruptedException
		{
			for(int i=0;i<10;i++){
			swipeToBottomOfPage();
			Thread.sleep(10000);}
		}
	

}
