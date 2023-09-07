package org.example.anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @ParameterizedTest
    @MethodSource("getAnagramsData")
    void findAnagrams_success(String[] anagrams, int resultSize) {
        List<List<String>> result = GroupAnagrams.findAnagrams(anagrams);

        assertEquals(resultSize, result.size());
    }

    private static Stream<Arguments> getAnagramsData() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs1 = {"Lies, let's recount", "tan","ate", "Election results", "nat","I not select rules"};

        return Stream.of(
                Arguments.of(strs, 3),
                Arguments.of(strs1, 3)
        );
    }
}
