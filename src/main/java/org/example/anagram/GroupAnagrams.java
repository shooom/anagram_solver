package org.example.anagram;

import org.example.anagram.Utils.AnagramUtils;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> findAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for (String str : strs) {
            char[] nextArr = AnagramUtils.prepareString(str.toLowerCase()).toCharArray();
            Arrays.sort(nextArr);
            String nextKey = new String(nextArr);

            result.computeIfAbsent(nextKey, key -> new ArrayList<>());
            result.get(nextKey).add(str);
        }

        return result.values().stream().toList();

    }

    public static String printAnagrams(List<List<String>> list) {
        String[] strings = list.stream()
                .map(lst -> String.join(", ", lst))
                .map(str -> "[" + str + "]")
                .toArray(String[]::new);

        return "[" + String.join(", ", strings) + "]";
    }

}

