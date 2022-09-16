package Arrays;

public class FindOdd {
public static int findodd(int a[],int n) {
{{
	int i, oddCount = 0;
	 
	for(i = 0; i < n; i++)
	{
		if(a[i] % 2 != 0)
		{
			System.out.print(a[i] + " ");
			oddCount++;
		}
	}
	return oddCount;
}
}
}
}