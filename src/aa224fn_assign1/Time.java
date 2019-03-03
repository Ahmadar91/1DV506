package aa224fn_assign1;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Seconds Here");

		int sec = scan.nextInt();

		int hrs = sec / 3600; // to hours

		int min = (sec / 60) % 60; // remainder to mins
		int s = sec % 60; // rest to secs

		System.out.println("This corresponds to :" + hrs + " hours" + min  + " minutes " + " second" + s);

		scan.close();
	}

}
