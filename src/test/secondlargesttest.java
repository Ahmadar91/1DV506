package test;

import java.util.Scanner;

public class secondlargesttest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 10 value: ");

		int min = 0;
		int max = 0;

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if (n > max) {
				min = max;
				max = n;
			}
		}

		System.out.println("second largest value is " + min);
	}

}
