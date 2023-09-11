package org.example.anagram;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {

    private final AnagramResolver anagramResolver = new AnagramResolver();

    @Test
    public void findAnagram_success() {
        String a = "tea";
        String b = "ate";
        String c = "abc";
        String d = "eta";

        anagramResolver.isAnagram(a, b);
        anagramResolver.isAnagram(a, c);
        anagramResolver.isAnagram(a, d);

        assertTrue(anagramResolver.findAnagrams(a).containsAll(Arrays.asList(b, d)));
        assertTrue(anagramResolver.findAnagrams(b).containsAll(Arrays.asList(a, d)));
        assertTrue(anagramResolver.findAnagrams(c).isEmpty());
    }
}
