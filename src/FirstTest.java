import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void loginTest() {
		System.out.println("login cheking");
	}

	@Test
	public void getTitle() {
		System.out.println("Title Displayed");
	}

	@BeforeMethod
	public void LaunchBrowser() {
		System.out.println("Launched Browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Cloased Browser");
	}
	@BeforeTest
	public void dbConnection() {
		System.out.println("Open DB Connection");
	}
	
	@AfterTest
	public void closeDBConnection() {
		System.out.println("Closed DB Connection");
	}
	
	@BeforeSuite
	public void starServer() {
		System.out.println("Starting selenium server");
	}
	@AfterSuite
	public void stopServer() {
		System.out.println("Server stop");
	}
	
}
