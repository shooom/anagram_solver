package org.example.anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource("anangramsData")
    void isAnagram_success(String first, String second, boolean result) {
        assertEquals(result, ValidAnagram.isAnagram(first, second));
    }

    private static Stream<Arguments> anangramsData() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("Election results", "Lies, let's recount", true),
                Arguments.of("The Morse Code signals", "Here come dot's signals", true),
                Arguments.of("ab", "ac", false),
                Arguments.of(null, null, false)
                );
    }
}
