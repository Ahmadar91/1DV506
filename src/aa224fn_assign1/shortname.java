package aa224fn_assign1;

import java.util.Scanner;

public class shortname {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fName = sc.nextLine();

		System.out.println("Enter Last Name:");
		String lName = sc.nextLine();

		char firstChar = fName.charAt(0);

		lName = lName.substring(0, 4); // give us lastname 1st 4 letters

		System.out.println("Short name: " + firstChar + ". " + lName);

		sc.close();
	}

}
