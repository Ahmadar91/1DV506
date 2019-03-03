package test;

import java.util.Scanner;

public class secondstest {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner (System.in);
		 System.out.println("hours");
		 int hr = sc.nextInt();
		 
		 System.out.println("min");
		 int mn = sc.nextInt();
		
		 System.out.println("secods");
		 int sec = sc.nextInt();
		 
		 
		 
		 hr *= 3600;
		 mn *=60;
		 
		 
		 System.out.println("time in seconds is " + (hr+mn + sec));
		 
		 
		
	}

}
