package codersclubb;

import java.util.Scanner;

public class ReverseSentenceDemo {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence");
		str=sc.nextLine();
		 System.out.println(ReverseSentence.reversesentence(str));

	}

}
