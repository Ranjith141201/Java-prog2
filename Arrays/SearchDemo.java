package Arrays;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String args[]){  
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();  
		int[] num = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		num[i]=sc.nextInt();
		}
		System.out.println("Enter element to search: ");  
		int toFind=sc.nextInt();
		System.out.println(Search.search(num, toFind));
	}
}
