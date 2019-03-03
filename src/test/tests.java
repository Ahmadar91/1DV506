package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tests {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int x = sc.nextInt();
		int i;
		int[] a = new int[x];
		System.out.println("Enter positive integers: ");
		for (i = 0; i < x; i++) {
			a[i] = sc.nextInt();

		}
		System.out.print("All positive integers: ");
		for (int j = 0; j < x; j++) {

			if (a[j] > 0) {
				System.out.print("" + a[j] + " ");
			}
		}
		sc.close();
	}

}
