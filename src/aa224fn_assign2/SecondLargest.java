package aa224fn_assign2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 integers:");
		int max = 0;
		int min = 0;

		for (int i = 1; i < 11; i++) {

			int n = sc.nextInt();

			if (n > max) {
				min = max;
				max = n;
			}

			//if (n < max && n > min) {

		//		min = n;
			//}

		}
		System.out.println("The second largest number is: " + min);

		sc.close();
	}

}
