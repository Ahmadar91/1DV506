package test;

import java.util.Scanner;

public class largestktest {

	public static void main(String[] args) {

		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int sum = 0;
		int k = 0;
		while (sum<n){
		
		k += 2;
		sum+= k;
		
		System.out.println(k);
		System.out.println("sum "+sum);
		}
		System.out.println("Largest k  " + ( k -2));
	}
	
	

}
