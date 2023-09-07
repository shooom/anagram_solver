package org.example.anagram.Utils;

public class AnagramUtils {
    public static String prepareString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
