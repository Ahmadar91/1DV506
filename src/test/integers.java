package test;

import java.util.ArrayList;
import java.util.Scanner;

public class integers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("integer 0: ");

		int count = -1;
		int k = 0;
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			k++;
			System.out.print("integer " + k+ ":");
			if (n>=0)
				list.add(n);
			count++;
		}
		System.out.println(list);
		

	}

}
