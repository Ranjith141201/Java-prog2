package codersclubb;

import java.util.Scanner;

public class VowelorconsonantDemo {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		 ch= sc.next().charAt(0);
		 System.out.println(Vowelorconsonant.vowelorconsonant(ch));
	}

}
