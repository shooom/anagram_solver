package org.example.anagram;

import static org.example.anagram.Utils.AnagramUtils.convertToKey;

public class ValidAnagram {

    public static boolean isAnagram(String left, String right) {
        if (left == null || right == null) {
            return false;
        }
        String preparedStr1 = convertToKey(left);
        String preparedStr2 = convertToKey(right);

        if (preparedStr1.length() != preparedStr2.length()) {
            return false;
        }
        return preparedStr1.equalsIgnoreCase(preparedStr2);
    }
}
