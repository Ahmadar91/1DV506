package test;

import java.util.Scanner;

public class sumof3test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of form xxx");
		int n = sc.nextInt();
		int sum = 0;
		
		
		
		
		for(int i = 0; i <3 ;i++) {
			
			int one = n%10 ;
			n /= 10;
			sum = sum + one ;
		}
		
		System.out.println("sum of three "+ sum);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		/*
		int one = n%10 ;
		n /= 10;
		int two= n % 10;
		n /= 10;
		
		int three= n% 10;
		n /= 10;
		System.out.println( sum = one+two+three);*/
		
	
	}
	
	
}
