package test;

import java.util.Scanner;

public class backwardstest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Text Here ");
		String str = sc.nextLine();
		for (int i = str.length()-1; i >=0; i--) {
			
			System.out.print(str.charAt(i));
			
			
		}
	}

}
