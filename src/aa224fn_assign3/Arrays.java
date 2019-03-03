package aa224fn_assign3;

public class Arrays {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 14, 7, 5, 9 };
		int[] sub = { 3, 5, 7, 1, 2, 3 };
		System.out.println("sum = " + sum(num));
		System.out.println("Array content = " + toString(num));
		System.out.println("After AddN = " + toString(addN(num, 2)));
		System.out.println("Reverse order = " + toString(reverse(num)));
		System.out.println("HasN = " + hasN(num, 4));
		replaceAll(num, 4, 10);
		System.out.println("Replace= " + toString(num));
		System.out.println("Sort= " + toString(sort(num)));
		System.out.println("Sequence= " + hasSubsequence(num, sub));
	}

	private static int sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}
		return sum;

	}

	private static String toString(int[] arr) {
		String str = "{ ";
		for (int i = 0; i < arr.length; i++)
			str = str + String.valueOf(arr[i] + " ");

		return str += '}';

	}

	private static int[] addN(int[] arr, int n) {

		int[] add = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			add[i] = arr[i] + n;

		}
		return add;
	}

	private static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			reverse[i] = arr[arr.length - 1 - i];
		}
		return reverse;
	}

	private static boolean hasN(int[] arr, int n) {
		// int [] array = new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i])
				return true;
		}
		return false;
	}

	private static void replaceAll(int[] arr, int old, int nw) {
		for (int i = 0; i < arr.length; i++) {
			if (old == arr[i])
				arr[i] = nw;
		}
	}

	private static int[] sort(int[] arr) {
		int[] sorted = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					sorted = arr;
				}
			}
		}
		return sorted;
	}

	private static boolean hasSubsequence(int[] arr, int[] sub) {
		boolean seq = false;
		for (int i = 0; i <= arr.length - sub.length; i++) {
			for (int j = 0; j < sub.length; j++) {
				if (arr[i + j] != sub[j]) {
					seq = false;
					break;
				} else
					seq = true;
			}
			if (seq)
				return true;
		}
		return false;
	}
}
