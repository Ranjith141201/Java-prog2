package codersclubb;

import java.util.HashMap;
import java.util.Map;

public class WordFrequncy {
	public static String wordfrequency(String s)
	{
		String a[] = s.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
		return "Frequency of words";
    }
}
	
