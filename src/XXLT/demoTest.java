package XXLT;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest {

	
		@Test(invocationCount=10)
		public void SMS() {
			Reporter.log("SendSms",true);
		}

	}


