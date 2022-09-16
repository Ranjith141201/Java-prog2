package codersclubb;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		String mystring;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		 mystring=sc.nextLine();
		 System.out.println(Palindrome.palindrome(mystring));
	}
	}


