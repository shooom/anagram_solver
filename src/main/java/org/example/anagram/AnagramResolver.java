package org.example.anagram;

import org.example.anagram.Utils.AnagramUtils;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramResolver {

    Map<String, Set<String>> anagramsRepository;

    public AnagramResolver() {
        this.anagramsRepository = new HashMap<>();
    }

    public boolean isAnagram(String left, String right) {
        var result = ValidAnagram.isAnagram(left, right);
        if (!result) {
            return false;
        }

        String key = AnagramUtils.convertToKey(left);
        anagramsRepository.computeIfAbsent(key, newKey -> new HashSet<>());
        anagramsRepository.get(key).add(left);
        anagramsRepository.get(key).add(right);

        return true;
    }

    public List<String> findAnagrams(String baseStr) {
        Set<String> result = anagramsRepository.get(AnagramUtils.convertToKey(baseStr));

       if (result == null) {
           return  Collections.emptyList();
       }
       return result.stream().filter(str -> !str.equalsIgnoreCase(baseStr)).collect(Collectors.toList());
    }

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
}

