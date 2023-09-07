package org.example.anagram;

import java.util.Arrays;

import static org.example.anagram.Utils.AnagramUtils.prepareString;

public class ValidAnagram {

    public static boolean isAnagram(String left, String right) {
        if (left == null || right == null) {
            return false;
        }
        String preparedStr1 = prepareString(left);
        String preparedStr2 = prepareString(right);

        if (preparedStr1.length() != preparedStr2.length()) {
            return false;
        }
        char[] sArray = preparedStr1.toCharArray();
        char[] tArray = preparedStr2.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return new String(sArray).equalsIgnoreCase(new String(tArray));
    }
}
