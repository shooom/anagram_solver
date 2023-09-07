package org.example;

import org.example.anagram.GroupAnagrams;
import org.example.anagram.ValidAnagram;

import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class AnagramsDemo {

    private static final String CLOSE_SYMBOL = "3";

    public void runDemo() {
        Scanner sc = new Scanner(System.in);
        String option = "";

        while (!option.equals(CLOSE_SYMBOL)) {
            printMenu();
            option = sc.next();
            switch (option) {
                case "1":
                    validateTwoStrings(sc);
                    break;
                case "2":
                    findAnagramsInList(sc);
                    break;
                case "3":
                    System.out.println("See you!");
                    break;
                default:
                    System.out.println("Wrong action. Try again, please!");
                    break;
            }
        }
    }

    public void printMenu() {
        System.out.println("what do you want to do?");
        System.out.println("Enter [1] if you check 2 strings if they are anagrams");
        System.out.println("Enter [2] if you want to find anagrams for a string in a list of strings");
        System.out.println("Enter [3] if you want to close the program");
        System.out.print("So... ");
    }

    public void findAnagramsInList(Scanner sc) {
        System.out.println("Enter a list of words (devided by comma)");
        sc.nextLine();
        String casesStr = sc.nextLine();
        String[] cases = casesStr.split(",\\s+");
        List<List<String>> anagrams = GroupAnagrams.findAnagrams(cases);
        System.out.println(format("The groupped anagrams are %s", GroupAnagrams.printAnagrams(anagrams)));
        sc.nextLine();
    }

    public void validateTwoStrings(Scanner sc) {
        System.out.println("Enter the first word:\n");
        String first = sc.next();

        System.out.println("Enter the second word:\n");
        String second = sc.next();

        if (ValidAnagram.isAnagram(first, second)) {
            System.out.println(format("%s & %s are anagrams!", first, second));
        } else {
            System.out.println(format("%s & %s are not anagrams!", first, second));
        }
    }
}
