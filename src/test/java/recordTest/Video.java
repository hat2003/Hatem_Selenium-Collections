package recordTest;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Video {
	
	
	ATUTestRecorder recorder;
	
	public void recordVideo() throws ATUTestRecorderException {
		
		recorder = new ATUTestRecorder("Location","Video Name",false);
		recorder.start();
		
		/*
		 * Test
		 * Test 
		 */
		
		
		recorder.stop();
	}

}
