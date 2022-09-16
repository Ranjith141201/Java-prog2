package codersclubb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacestring {
	    public static String replace(String source, String target, String replacement) {
	        return Pattern.compile(target, Pattern.LITERAL).matcher(source)
	                .replaceAll(Matcher.quoteReplacement(replacement));
	    }
	}
