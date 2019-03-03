package aa224fn_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {

		File inputfilename = new File("C:\\Users\\Ahmad\\eclipse-workspace\\Histogram.txt");
		Scanner input = new Scanner(inputfilename);
		System.out.println("Reading integers from file: " + args[0]);

		ArrayList<Integer> list = new ArrayList<Integer>();

		int x = 0;
		while (input.hasNext()) {
			x = input.nextInt();
			list.add(x);
		}

		Print(list);
		input.close();

	}

	static void Print(ArrayList<Integer> input) {

		int[] star = new int[11];

		for (int i = 0; i < input.size(); i++) {
			int x = input.get(i);
			if (x < 0 || x > 100) {
				star[10]++;
			} else if (x % 10 == 0) {
				star[x / 10 - 1]++;
			} else
				star[x / 10]++;

		}
		int total = 0;
		;
		for (int i = 0; i < 10; i++)
			total += star[i];
		System.out.println("Number of integers in the interval [1,100]: " + total);
		System.out.println("Others: " + star[10]);
		System.out.println("Histogram");
		int min = 1;
		int max = 10;
		for (int k = 0; k < 10; k++) {
			System.out.printf("%-2d - %-3d | ", (min), (max));

			min += 10;
			max += 10;

			for (int d = 0; d < star[k]; d++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static String toString(ArrayList<Integer> input) {
		String str = "";
		for (int i = 0; i < input.size(); i++)
			str = str + String.valueOf(input.get(i) + " ");

		return str += ",";
	}

}
