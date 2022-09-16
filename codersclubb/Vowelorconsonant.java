//01. Write a Java class to find out whether a given character is a vowel or a consonant.

package codersclubb;

public class Vowelorconsonant {
public static String vowelorconsonant(char ch)
{
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        return "vowel";
    else
    	return "consonant";
}
}
