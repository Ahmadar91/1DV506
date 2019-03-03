package test;

public class arraystest {

	public static void main(String[] args) {

		int[] n = { 3, 4, 5, 6, 7 };

		System.out.println("sum is " + sum(n));

		System.out.println("n = " + toString(n));
		System.out.println("addN = " + toString(addN(n, 5)));
		System.out.println("Reverse = " + toString(Reverse(n)));
		System.out.println("HasN = " + (hasN(n,10)));
		relpaceAll(n,5,8);
		System.out.println("new Array = " + toString(n));
		System.out.println("Sort = " + toString((Sort(n))));
		System.out.println("n = " + toString(n));
	}

	private static int sum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	private static String toString(int[] arr) {

		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += " " + arr[i];

		}
		return str;

	}

	private static int[] addN(int[] arr, int x) {
		int[] add = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			add[i] = arr[i] + x;
		}

		return add;
	}
	
	
	private static int [] Reverse(int [] arr) {
		int [] rev = new int [arr.length];
		for (int i = 0 ; i < arr.length; i++) {
			
			rev[i] = arr[arr.length-1-i];
			
		}
			
		return rev;

		}
	
	private static boolean hasN(int [] arr, int x) {

		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]==x)
				return true;
		}
		return false;
		
	}
	private static void relpaceAll(int[] arr ,int old , int nw) {
		
		for (int i = 0 ;i < arr.length; i++) {
			if (arr[i]== old)
				arr[i]=nw;
		}
		
	}
	
	private static int [] Sort(int [] arr) {
		int k = 1;
		int [] sort = new int [arr.length];
		int temp = 0;
		for (int i = 0; i<arr.length-1;i++) {
			for (int j=i+1; j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				sort= arr;
				k++;
				}
			}
		}
		return sort;
		
	}
}
