package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Day1 {
	
	@BeforeSuite
public void beforesuite() 
{
System.out.println("Before suite");	
}
@BeforeClass	
public void beforeclass() 
{
System.out.println("Before class");	
}
@BeforeTest
public void beforetest() 
{
System.out.println("Before test");	
}
@BeforeMethod
public void beforemethod() 
{
System.out.println("Before method");	
}
@AfterMethod
public void aftermethod() 
{
System.out.println("After Method");	
}
@AfterTest
public void afterTest() 
{
System.out.println("After Test");	
}
@AfterClass
public void afterClass() 
{
System.out.println("After class");	
}
@AfterSuite
public void afterSuite() 
{
System.out.println("After suite");	
}
}
