package javaCoolThings;

import java.util.Random;

public class RandomNumber {
	
	public int randomNumbers(int min, int max) {

		Random r = new Random();
		int Low = min;
		int High = max;
		int Result = r.nextInt(High - Low) + Low;
		return Result;

	}

}
