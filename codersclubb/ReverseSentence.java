package codersclubb;


public class ReverseSentence {
	public static String reversesentence(String str){  
		char ch; String nstr="";
		for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }return nstr;
	}
}