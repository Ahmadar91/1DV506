package test;

import java.util.Random;
import java.util.Scanner;

public class dicetest {

	public static void main(String[] args) {
		
		int[] numbers = new int [64];
		for(int i = 0; i < numbers.length; i++)
			numbers[i]=i;

		reverse(numbers, 0);
	}

	public static void reverse(int[] arr, int position) {
		// BASE
		if (position == arr.length)
			return;
		// RECURSIVE

		reverse(arr, position + 1);

		System.out.print(arr[position] + " ");
	}

}