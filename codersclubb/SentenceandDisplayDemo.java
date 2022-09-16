package codersclubb;

import java.util.Scanner;

public class SentenceandDisplayDemo {

	public static void main(String[] args) {
		String str;  
		Scanner sc = new Scanner(System.in); 
 		System.out.println("Enter a string");  
 		str = sc.nextLine(); 
 		System.out.println(SentenceandDisplay.sentencedisplay(str));
	}

}
