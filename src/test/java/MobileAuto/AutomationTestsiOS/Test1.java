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
	tapiOS(searchField,1);
	sendKeysiOS(searchField,"315515");
	sendKeysiOS(searchField,"\n");
	waitforElement(ItemNo);
	verifyElementContainsText(ItemNo, "315515");
	swipeToBottomOfPage();
	swipeToBottomOfPage();
	swipeFromBottomToTopiPhone();
	Thread.sleep(5000);
	swipeFromTopToBottomiPhone();
	Thread.sleep(5000);
	swipeFromTopToBottomiPhone();
	Thread.sleep(5000);
	swipeFromBottomToTopiPhone();
}
@AfterTest
public void tearDown()
{
	//stopServeriOS();
}
}
