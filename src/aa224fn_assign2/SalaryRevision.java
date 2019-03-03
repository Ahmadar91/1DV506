package aa224fn_assign2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class SalaryRevision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		System.out.println("Provide salaries (and terminate input with 'X'): ");
		int sum = 0;
		while (sc.hasNextInt()) {
			int salary = sc.nextInt();
			list.add(salary);
			sum = sum + list.get(count);
			count++;
		}
		Collections.sort(list);
		int median = (list.get(count / 2) + list.get((count / 2) - 1));
		if (count % 2 == 1) {
			System.out.println("Median: " + Math.round((list.get(count / 2))));
		} else if (count % 2 == 0) {
			System.out.println("Median: " + Math.round((median / 2)));
		}
		System.out.println("Avrage: " + Math.round((sum / count)));
		System.out.println("Gap: " + Math.round((list.get(count - 1) - list.get(0))));
		sc.close();
	}
}
