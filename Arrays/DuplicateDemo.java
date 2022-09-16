package Arrays;

import java.util.Scanner;

public class DuplicateDemo {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter the number of elements you want to store");
 int n=sc.nextInt();
 int[] arr = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	arr[i]=sc.nextInt();
	}
	System.out.println(Duplicate.duplicate(arr));
	}

}
