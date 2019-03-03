package test;

import java.util.Scanner;

public class salaraytest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter price");

		double price = sc.nextDouble();

		System.out.println("enter paymnet");

		int payment = sc.nextInt();

		int change = (int) (payment - price);

		System.out.println("change = " + change);
		

		int th = change / 1000;
		System.out.println("1000 " + th);
		change %= 1000;

		int five = change / 500;
		change %= 500;
		System.out.println("500: " + five);

		int two = change / 200;
		change %= 200;
		System.out.println("200 " + two);

		int hundred = change / 100;
		change %= 100;
		System.out.println("100 " + hundred);

		int fifty = change / 50;
		change %= 50;
		System.out.println("50 " + fifty);

		int twenty = change / 20;
		change %= 20;
		System.out.println("20 " + twenty);

		int ten = change / 10;
		change %= 10;
		System.out.println("10 " + ten);

		int f = change / 5;
		change %= 5;
		System.out.println("5 " + f);
		int one = change / 1;
		change %= 1;
		System.out.println("1 " + one);

	}

}
