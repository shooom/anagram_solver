
### Write a Java program that provides these 2 features:

1. Checks if two texts are anagrams of each other.
2. Makes available the list of anagrams found for a given String

For feature #1: Please follow the definition described in the english wikipedia page for anagram.
For feature #2: There's no need for storage, nor interactivity, the results can be valid for a single run.
Given these hypothetical invocations of the feature#1 function -> f1(A, B), f1(A, C), f1(A, D)- *IF* A, B and D are anagrams
- f2(A) should return [B, D]
- f2(B) should return [A, D]
- f2(C) should return []
  Feel free to use your favorite:
- IDE
- Language: the solution has to be either Java 8+ or Kotlin
- Code hosting: the solution must be publicly accessible
- You can prioritize however you like (performance, readability, extensibility,…).
  P.S. Googling is a good thing :-)

### implementation

1. The 1st case is solved by utility class ValidAnagram. The isAnagram return true if two strings are anagrams for each other.
2. The implementation of the 2nd case in AnagramResolver class. A isAnagram's wrapper which also accumulate strings to a set if they are anagrams was added for this case

There is a small set of tests available for each of the classes.
Additionally, you can run a demo program to verify the functionality of these functions.

For running demo program please use next command in you console:
```code
gradle runDemoApp --console=plain
```

