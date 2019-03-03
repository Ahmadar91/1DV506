package aa224fn_assign1;

import java.util.Formatter;
import java.util.Scanner;
import java.lang.Math;

public class windchill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Tempreture in C"); // temp

		double temp = sc.nextDouble();

		System.out.println("Enter Wind Speed in m/s"); // meter per sec

		double wS = sc.nextDouble();

		double kh = (wS * 18) / 5; // kh per hour

		double twc = 13.12 + 0.6215 * temp - 11.37 * Math.pow(kh, 0.16) + 0.3965 * temp * Math.pow(kh, 0.16); // wind chill
		Formatter fmt = new Formatter();  // using fromatter we can decide decimal numbers
		fmt.format("%.1f", twc); // "%.1f" 1 decimal after the coma
		System.out.println("Distance is " + fmt);

		fmt.close();
		sc.close();
	}

}
