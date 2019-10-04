
package XXLT;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleDemo {
	@Test(priority=1)
	public void CreatAccount() {
	Reporter.log("CreateAccount",true);
}
	@Test(priority=2)
	public void EditAccount() {
	Reporter.log("EditAccount",true);
}
	@Test(priority=2)
	public void DeleteAcaunnt() {
	Reporter.log("DeleteAcaunnt",true);
}

			
	
		}
	


