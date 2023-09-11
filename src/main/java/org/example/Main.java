package org.example;

import org.example.anagram.AnagramResolver;

public class Main {
    public static void main(String[] args) {
        AnagramResolver resolver = new AnagramResolver();
        AnagramsDemo demo = new AnagramsDemo(resolver);
        demo.runDemo();
    }
}