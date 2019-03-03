package aa224fn_assign2;

import java.util.Scanner;

public class backwards {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Text here: ");

		String text = sc.nextLine();

		System.out.print("reverse order is: ");

		for (int i = text.length() - 1; i >= 0; i--) {

			System.out.print(text.charAt(i));
		}

		sc.close();

	}

}


