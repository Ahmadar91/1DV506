package test;

import java.util.Scanner;

public class countatest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String");
		String test = sc.nextLine();
		int a = 0;
		int A = 0;
		
		for (int i = 0 ; i <test.length();i++) {
			
			if (test.charAt(i)== 'A') {
				A++;
			}else if (test.charAt(i) == 'a') {
				a++;
			}
		}
		System.out.println("number of A is " + A);
		System.out.println("number of a is " + a);
		
		
		sc.close();
	}

}
