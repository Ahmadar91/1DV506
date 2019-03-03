package test;

import java.util.Scanner;

public class Countdigitstest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter a integer: ");
		int n = sc.nextInt();
		String str = Integer.toString(n);
		int zero = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0 ; i <str.length();i ++) {
			
			int num = n%10;
			n/=10;
			
			if (num == 0) {
				zero++;
			}else if (num%2==1) {
				odd++;
			}else
				even++;
		}
		System.out.println("Number of zeros: " + zero);
		System.out.println("Number of odd: " + odd);
		System.out.println("Number of Even: " + even);

	}

}
