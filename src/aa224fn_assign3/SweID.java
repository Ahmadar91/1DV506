package aa224fn_assign3;
import java.util.Scanner;

public class SweID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Personal Number YYMMDD-NNNN:");
		
		String num = sc.next();
		System.out.println(getFirstPart(num) + "-" + (getSecondPart(num)));
		System.out.println("Is Female: " + isFemaleNumber(num));
		System.out.println("Is Male: " + isMaleNumber(num));
		String x = (getFirstPart(num)) + (getSecondPart(num));
		System.out.println("the personal number is: " + isCorrect(x));
		System.out.print("Enter another personal number: ");
		String sec = sc.next();
		System.out.println("Equal personal Number: " + areEqual(num, sec));
		
		
		 sc.close();
	}

	private static String getFirstPart(String fpart) {
		String firstpart = "";
		for (int i = 0; i < 6; i++) {
			firstpart = firstpart + fpart.charAt(i);

		}
		return firstpart;
	}

	private static String getSecondPart(String spart) {
		String secondpart = "";
		for (int i = 7; i < 11; i++) {
			secondpart += spart.charAt(i);
		}
		return secondpart;
	}

	private static boolean isFemaleNumber(String female) {

		if (female.charAt(9) % 2 == 0) {
			return true;
		}
		return false;
	}

	private static boolean isMaleNumber(String male) {

		if (male.charAt(9) % 2 == 1) {
			return true;
		}
		return false;
	}

	private static boolean areEqual(String first, String second) {
		for(int i =0 ;i<11;i++)
		if (first.charAt(i) != second.charAt(i)) {
			return false;
		}
		return true;
	}

	private static boolean isCorrect(String correct) {
		int sum = 0, all = 0, even = 0, odd = 0, e = 0, k = 0, p = 0, l = 0;
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 1) {
				sum = sum + odd;
			} else {
				even = Character.getNumericValue(correct.charAt(i)) * 2;
				if (even > 9) {
					int oneDigit = even % 10;
					even /= 10;
					int twoDigit = even % 10;
					even /= 10;
					k = oneDigit + twoDigit;
					p = p + k;
				}
				all = all + even;
				l = all + p;
			}
		}
		e = l + sum;
		int ld = e % 10;
		e /= 10;
		int m = 10 - ld;
		if (Character.getNumericValue(correct.charAt(9)) == m)
			return true;

		return false;
	}
	
}
