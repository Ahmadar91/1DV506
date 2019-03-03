package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class salarytest {

	public static void main(String[] args) {

		ArrayList<Integer> sala = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salaraies");

		int sum = 0;
		while (sc.hasNextInt()) {
			sala.add(sc.nextInt());
		}
		for (int i = 0; i < sala.size(); i++) {
			sum += sala.get(i);
		}
		Collections.sort(sala);
		System.out.println(sala);
		System.out.println("Avrage : " + (sum / sala.size()));
		System.out.println("gap " + (sala.get(sala.size() - 1) - sala.get(0)));
		if (sala.size() % 2 == 1) {
			System.out.println("Maiden " + sala.get(sala.size() / 2));
		} else {
			System.out.println("Maiden " + (sala.get(sala.size() / 2) + sala.get((sala.size() / 2) - 1)) / 2);

		}

	}

}
