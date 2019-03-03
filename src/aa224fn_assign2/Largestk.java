package aa224fn_assign2;

import java.util.Scanner;

public class Largestk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int n = sc.nextInt();

		int sum = 0;
		int k = 0;

		if (n >= 0) {
			
			while (sum < n) {

				k = k + 2;
				sum = sum + k;
				
			}
				System.out.println("The largest K such that 0+2+4+6+...+K < " +n);
				System.out.println("Largest k = " + (k - 2 ));
		} else {
			System.out.println("Error! Please enter a positive number.");
		}

		sc.close();
	}

}


