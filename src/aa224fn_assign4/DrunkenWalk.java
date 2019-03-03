package aa224fn_assign4;

import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size: ");
		int size = sc.nextInt();

		System.out.print("Enter the number of steps: ");
		int maxSteps = sc.nextInt();

		System.out.print("Enter the number of walks: ");
		int people = sc.nextInt();

		int fall = 0;

		for (int i = 0; i < people; i++) {
			RandomWalk rw = new RandomWalk(maxSteps, size);
			rw.walk();
			if (!rw.inBounds()) {
				fall++;
			}
		}
		System.out.println("out of " + people + " Drunk people " + fall + " (" + (int) (fall / 150.0 * 10000) / 100.0
				+ "%) fell in to the water.");

		sc.close();
	}

}
