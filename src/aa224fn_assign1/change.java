package aa224fn_assign1;

import java.util.Scanner;

public class change {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price");
		double price = sc.nextDouble();

		System.out.println("Enter Payment");
		int payment = sc.nextInt();

		int change = (int) (payment - price);
		System.out.println("Change " + change + " Kronor");

		int thouthand = change / 1000; // 1000   
		System.out.println("1000kr bill: " + thouthand);
		change %= 1000; // remainder of 1000

		int fiveh = change / 500; // 500
		System.out.println("500kr bill: " + fiveh);
		change %= 500; // remainder of 500

		int twoh = change / 200; // 200
		System.out.println("200kr bill: " + twoh);
		change %= 200; // remainder of 200

		int oneh = change / 100; // 100
		System.out.println("100kr bill: " + oneh);
		change %= 100; // remainder of 100

		int fifty = change / 50; // 50
		System.out.println("50kr bill: " + fifty);
		change %= 50; //remainder of 50

		int twinty = change / 20; // 20
		System.out.println("20kr bill: " + twinty);
		change %= 20; // remaider of 20

		int ten = change / 10; // 10
		System.out.println("10kr bill: " + ten);
		change %= 10; // remainder of 10

		int five = change / 5; // 5
		System.out.println("5kr bill: " + five);
		change %= 5; // remaidner of 5

		int one = change / 1; // 1
		System.out.println("1kr bill: " + one);
		change %= 1;// remainder of 1

		sc.close();

	}

}
