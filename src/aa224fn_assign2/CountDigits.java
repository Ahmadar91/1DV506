package aa224fn_assign2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a positive integer: ");

		int n = sc.nextInt();

		String string = Integer.toString(n);
		int even = 0;
		int odd = 0;
		int zero = 0;

		for (int i = 0; i < string.length(); i++) {

			int x = n % 10;
			n /= 10;

			if (x == 0) {

				zero++;
			} else if (x % 2 == 1) {

				odd++;

			} else {

				even++;

			}

		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		System.out.println("Zeros: " + zero);

		sc.close();

	}

}
