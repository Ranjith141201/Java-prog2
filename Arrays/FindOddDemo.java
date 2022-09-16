package Arrays;

import java.util.Scanner;

public class FindOddDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();  
		int[] a = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		a[i]=sc.nextInt();
		}
		
		System.out.print(FindOdd.findodd(a,n));
	}

}
