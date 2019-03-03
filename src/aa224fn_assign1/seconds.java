package aa224fn_assign1;

import java.util.Scanner;

public class seconds {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Hours");
		int hours = sc.nextInt();

		System.out.println("Enter minutes");
		int min = sc.nextInt();

		System.out.println("Enter Seconds");
		int sec = sc.nextInt();

		int awns = (hours * 60 * 60) + (min * 60) + sec;
		System.out.println("total time in seconds: " + awns);

		sc.close();
	}

}
