package aa224fn_assign2;

import java.util.Random;

public class FrequencyTable {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] dice = new int [6000];
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("Frequencies when rolling a dice 6000 times.");
		for (int i = 0; i < 6000; i++) {
			dice[i] = (1 + 1 * rand.nextInt(6));
				if (dice[i] == 1)
				one++;
				if (dice[i] == 2)
				two++;
				if (dice[i] == 3)
				three++;
				if (dice[i] == 4)
				four++;
				if (dice[i] == 5)
				five++;
				if (dice[i] == 6)
				six++;
		}
		System.out.println("1: " + one + "\n2: " + two + "\n3: " + three + "\n4: " + four + "\n5: " + five + "\n6: " + six);
	}

}
