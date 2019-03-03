package aa224fn_assign2;

import java.util.Scanner;

public class countA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your text here: ");
		String text = sc.nextLine();
		int A = 0;
		int a = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'A')
				A++;

			else if (text.charAt(i) == 'a')
				a++;
		}

		System.out.println("Number of \'A\': " + A);
		System.out.println("Number of \'a\': " + a);

		sc.close();
	}

}
