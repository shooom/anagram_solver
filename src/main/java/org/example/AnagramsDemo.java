package org.example;

import org.example.anagram.AnagramResolver;
import org.example.anagram.Utils.AnagramUtils;

import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class AnagramsDemo {

    private static final String CLOSE_SYMBOL = "3";

    private final AnagramResolver resolver;

    public AnagramsDemo(AnagramResolver resolver) {
        this.resolver = resolver;
    }

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
        sc.nextLine();
        System.out.println("Enter a word:");
        String baseStr = sc.nextLine();
        List<String> anagrams = resolver.findAnagrams(baseStr);
        System.out.println(format("The anagrams for word %s : %s", baseStr, AnagramUtils.printAnagrams(anagrams)));
    }

    public void validateTwoStrings(Scanner sc) {
        sc.nextLine();
        System.out.println("Enter the first word:\n");
        String first = sc.nextLine();

        System.out.println("Enter the second word:\n");
        String second = sc.nextLine();

        if (resolver.isAnagram(first, second)) {
            System.out.println(format("%s & %s are anagrams!", first, second));
        } else {
            System.out.println(format("%s & %s are not anagrams!", first, second));
        }
    }
}
