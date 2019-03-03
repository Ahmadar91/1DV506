package aa224fn_assign1;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Tempreutre in Fahrenheit");

		int Fahrenheit = sc.nextInt(); // Tempreture in Fahrenheit

		int celsius = (Fahrenheit - 32) * 5 / 9; // convert

		System.out.println("Tempreture in Celsius is: " + celsius); // Results

		sc.close();

	}

}
