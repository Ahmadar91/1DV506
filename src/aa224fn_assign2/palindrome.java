package aa224fn_assign2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Text here: ");

		String text = sc.nextLine();
		String lower = text.toLowerCase();
		
		boolean ok = true;
		int k = 0;
		for (int i = lower.length() - 1; i >0; i--, k++) {
			if (!Character.isLetter(i))
				i--;
			if (!Character.isLetter(k))
				k++;
			if (lower.charAt(i) != lower.charAt(k)) {
				System.out.println("Text is not a Palindrome!");
				ok = false;
				break;

			}
		}
		if (ok == true)
			System.out.print("Text is a palindrome!");

		sc.close();
		
	}
}
