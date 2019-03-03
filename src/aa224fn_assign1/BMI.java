package aa224fn_assign1;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Lenght");
		double length = sc.nextDouble();

		System.out.println("Enter your Weight");
		int weight = sc.nextInt();

		int bmi = (int) (weight / (length * length)); // results in int
		System.out.println("Your BMI is: " + bmi);

		sc.close();
	}

}
