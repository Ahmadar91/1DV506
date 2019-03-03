package aa224fn_assign2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an odd number");
		int n = sc.nextInt();

		if (n % 2 == 1) {
			System.out.println("Right Angled Triangle: "); // angled triangle
			for (int i = 0; i < n; i++) {

				for (int j = n; j >= i; j--) {
					System.out.print(" ");
				}
				
				for (int k = 0; k <= i; k++) {
					System.out.print("*");
				}
				
				System.out.println();

			}
			System.out.println("Isosceles Triangle: "); // isosceles triangle
			for (int i = 0; i <= n; i += 2) {
				for (int j = 1; j <= (n - i - 1) / 2; j++)
					System.out.print(" ");
				for (int k = 0; k <= i; k++)
					System.out.print("*");
				System.out.print("\n");
			}

		} else
			System.out.println(" Error! Enter an odd postive integer." + "");

		sc.close();
	}

}
