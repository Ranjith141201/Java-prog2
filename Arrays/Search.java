package Arrays;

public class Search {
public static String search(int[] num,int toFind)
{
	boolean found = false;
	for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      return "element found";
	    else
	    return "element not found";
}
}
