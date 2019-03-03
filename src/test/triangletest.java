package test;

import java.util.Scanner;

public class triangletest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			
			for (int j = i; j < number; j++) {
				System.out.print(" ");
			}
				
				for (int k = 1; k < (i * 2); k++) {
					System.out.print("*");
				}
					System.out.println();
			

		}	

		sc.close();
	}

}
