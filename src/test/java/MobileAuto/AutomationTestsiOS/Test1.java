package MobileAuto.AutomationTestsiOS;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.core.CoreiOSMethods;
import com.core.FunctionLbrary;

import Repository.iOSRepo;
import io.appium.java_client.MobileElement;

public class Test1 extends IOSObjectRepo{
@BeforeClass
public void setup() throws MalformedURLException, IOException, InterruptedException
{
	
	startApplication();
	Thread.sleep(10000);
}
@Test
public void SearchItem() throws InterruptedException
{
	
//	MobileElement searchField = (MobileElement) driver.findElement(By.name("Search Products"));
//	searchField.tap(1, 3000);
//	Thread.sleep(5000);
//	searchField.sendKeys("315515");
//	searchField.sendKeys(Keys.ENTER);
//	Thread.sleep(15000);
	
	
	tapiOS(searchField,1);
	sendKeysiOS(searchField,"315515");
	sendKeysiOS(searchField,"\n");
	iosDriverTimeOut(5);
	System.out.println(getTextOnLocator(ItemNo));
	
}
@AfterTest
public void tearDown()
{
	//stopServeriOS();
}
}
