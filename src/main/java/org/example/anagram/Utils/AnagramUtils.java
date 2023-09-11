package org.example.anagram.Utils;

import java.util.Arrays;
import java.util.List;

public class AnagramUtils {

    public static String convertToKey(String str) {
        char[] array = prepareString(str).toCharArray();
        Arrays.sort(array);

        return new String(array);
    }

    public static String prepareString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static String printAnagrams(List<String> list) {
        return "[" + String.join(", ", list) + "]";
    }
}
