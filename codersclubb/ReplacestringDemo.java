package codersclubb;

import java.util.Scanner;

public class ReplacestringDemo {

	public static void main(String[] args) {
		String source;
		String target;
		String replacement;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter target string  ");
		source=sc.nextLine();
		System.out.println("Enter pattern string ");
		target=sc.nextLine();
		System.out.println("Enter replace string  ");
		replacement=sc.nextLine();
		System.out.println(Replacestring.replace(source, target, replacement));
	}

}
