package general_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String ReversedString = "";
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length = input.length();
		for( int  i = length -1  ;  i >= 0; i--)
		{
			ReversedString = ReversedString+input.charAt(i);
		}
		
		if(input.equals(ReversedString))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a palindrome");	
			
	}

}
