package codersclubb;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string");
		str= sc.nextLine();
		System.out.print(ReverseString.reverseString(str));
	}

}
