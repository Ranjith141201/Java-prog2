package codersclubb;

public class SentenceandDisplay {
public static String sentencedisplay(String str)
{
	String[] arr = str.split(" "); 
	  
    for (String s : arr) 
        System.out.println(s); 
    return "splitted words";
} 
}

	