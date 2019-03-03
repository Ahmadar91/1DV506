package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseordertest {

	public static void main(String[] args) {
		//int [] number = new int []
		ArrayList<Integer> number = new ArrayList <Integer>();
		Scanner sc= new Scanner(System.in);
		int n = 0;
		int k = 0;
		System.out.print("Enter numbers");
		while (n>=0) {
			 n = sc.nextInt();
			// if(n>=0)
			number.add(n);
			k++;
		}
		Collections.reverse(number);
		number.remove(0);
		System.out.println(" Array content: " + number);
	}

}
