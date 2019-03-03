package aa224fn_assign2;

import java.util.Random;
import java.util.Scanner;

public class Highlow {

	public static void main(String[] args) {
		Random rand = new Random();
		int ran = rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		

		for (int i = 1; i < 11; i++) {
			System.out.print("Guess " + i + ":");
			int n = sc.nextInt();
			if (i == 10) {

				System.out.println("Try again!");
				break;
			}
			if (n < ran)

				System.out.println("Clue: higher ");

			else if (n > ran)

				System.out.println("Clue: lower ");

			else if (n == ran) {

				System.out.println("your Guess is right! ");
				break;
			}

		}
		sc.close();
	}

}
