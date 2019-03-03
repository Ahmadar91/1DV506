package test;

import java.util.Scanner;

public class BMItest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter legnhth");
		double ln = sc.nextDouble();
		System.out.println(" Enter wight");
		int x = sc.nextInt();

		double bmi = x / Math.pow(ln, 2);

		System.out.println(" BMI " + Math.round(bmi));

	}
}
