package aa224fn_assign2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integers. End by giving a negative integer. ");
		int n = 0;
		int count = -1;
		int k = 0;
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (n >= 0) {
			k++;
			System.out.print("integer " + k+ ":");
			n = sc.nextInt();
			
				list.add(n);
			count++;
		}
		System.out.println("Number of positive integers: " + count);
		Collections.reverse(list);
		list.remove(0);
		System.out.print("In Reverse order: ");
		System.out.println(list);

		sc.close();
	}
}
