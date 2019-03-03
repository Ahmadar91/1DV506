package aa224fn_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("C:\\Users\\Seiya\\Documents\\lNU Workspace\\HistoryOfProgramming.txt");
		Scanner read = new Scanner(file);
		read.useDelimiter("");
		int WhiteSpace = 0;
		int Digit = 0;
		int UpperCase = 0;
		int LowerCase = 0;
		int others = 0;
		while (read.hasNext()) {

			char ch = read.next().charAt(0);

			if (Character.isUpperCase(ch))
				UpperCase++;
			else if (Character.isLowerCase(ch))
				LowerCase++;
			else if (Character.isDigit(ch))
				Digit++;
			else if (Character.isWhitespace(ch))
				WhiteSpace++;
			else
				others++;

		}

		System.out.println("Number of UpperCase: " + UpperCase);
		System.out.println("Number of LowerCase: " + LowerCase);
		System.out.println("Number of Digits: " + Digit);
		System.out.println("Number of whitespace: " + WhiteSpace);
		System.out.println("Others: " + others);
		read.close();
	}

}
