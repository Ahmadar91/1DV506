package aa224fn_assign1;

import java.util.Scanner;

public class sumofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number from 0 to 999"); 

		int number = sc.nextInt(); // int number

		int oneDigit = number % 10; // ( last number)
		number /= 10; // dvide the remainder 

		int twoDigits = number % 10; // ( last 2 numbers)
		number /= 10;

		int threeDigits = number % 10; // ( all numbers)
		number /= 10;

		int sum = oneDigit + twoDigits + threeDigits;

		System.out.println("The sum of digits is: " + sum);

		sc.close();
	}

}
