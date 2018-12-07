package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_In_TestNG_XML {
	
	
	@Test
	@Parameters("Parm1")
	
	public void readParameter(String Parm1)
	{
		System.out.println("String "+Parm1);
		
		
	}

}
