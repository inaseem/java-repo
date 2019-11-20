package general_programs;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String  str = sc.nextLine();
		char y[] = str.toCharArray();
		int size = y.length;
		char x[] = new char[size];		
		int i=0;
		while(i != size)
		{
			x[size-1-i] = y[i];
			i++;
		}
		System.out.println("Reversed string:" + new String(x));
	}

}
