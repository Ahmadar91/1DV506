package aa224fn_assign4;

import java.util.Random;

public class RandomWalk {

	int x;
	int y;
	int max;
	int StepsTaken;
	int size;

	public RandomWalk(int max, int size) {
		int x = 0;
		int y = 0;
		this.max = max;
		this.size = size;
	}

	public String toString() {
		return StepsTaken + " " + "[ x=" + x + ", y=" + y + "]";
	}

	void takeStep() {
		Random rand = new Random();
		int step = rand.nextInt(4);
		if (step == 1)
			x++;
		else if (step == 2)
			x--;
		else if (step == 3)
			y++;
		else
			y--;
		StepsTaken++;
	}

	boolean moreSteps() {
		return StepsTaken < max;

	}

	boolean inBounds() {
		return x < size && y < size && x > (size * -1) && y > (size * -1);
	}

	void walk() {
		while (moreSteps() && inBounds()) {
			takeStep();
		}

	}
}
