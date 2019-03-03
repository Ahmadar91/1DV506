package aa224fn_assign1;

import java.lang.Math;
import java.util.Formatter;
import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x1"); // x1 in point 1
		double xone = sc.nextDouble();

		System.out.println("Enter y1"); // y1 in point 1
		double yone = sc.nextDouble();

		System.out.println("Enter x2"); // x2 in point 2
		double xtwo = sc.nextDouble();

		System.out.println("Enter y2"); //y2 in point 2 
		double ytwo = sc.nextDouble();

		double distance = Math.sqrt((xone - xtwo) * (xone - xtwo) + (yone - ytwo) * (yone - ytwo)); // forumela
		
		Formatter fmt = new Formatter(); // foramtter help us with decimal points
		fmt.format("%.3f", distance); // "%.3f" 3 decimals after the coma
		System.out.println("Distance is " + fmt);

		sc.close();
		fmt.close();
	}

}
