package test;

import java.util.Random;
import java.util.Scanner;

public class testhighlow {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Scanner sc = new Scanner (System.in);
		int ran = rand.nextInt(100);
		
		for(int i = 1 ; i <= 11 ; i++) {
			System.out.print(" Guess " + i + ": ");
			int n = sc.nextInt();
			if (i==11) {
				System.out.println("try again");
				break;
			}else if (n> ran ) {
				System.out.println("your guess was higher");
			}else if (n<ran) {
				System.out.println("your guess was lower");

			}else if (n== ran) {
				System.out.println("your guess is Right!");
				break;
			}
		}
		

	}

}
