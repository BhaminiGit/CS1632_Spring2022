

import java.util.Random;

public class RandomValue {
	private int val = 0;
	private Random rand;

	public RandomValue(Random r) {
		rand = r;
	}
	public void incVal() {
		val += rand.nextInt(2);
	}

	public int getVal() {
		return val;
	}
}