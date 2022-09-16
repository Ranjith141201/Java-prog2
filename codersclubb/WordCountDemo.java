package codersclubb;
import java.util.Scanner;
public class WordCountDemo {

	public static void main(String[] args) {
	String string;
	Scanner sc=new Scanner(System.in);
	System.out.print(System.in);
	string=sc.nextLine();
	
	System.out.println(WordCount.wordcount(string));

	}

}
