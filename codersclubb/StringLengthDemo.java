package codersclubb;

import java.util.Scanner;

public class StringLengthDemo {
public static void main(String[] args) {
	String str;
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	str = sc.nextLine(); 
	System.out.print(StringLength.length(str));
}
}
