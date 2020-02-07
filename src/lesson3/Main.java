package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arrayWords = {"one", "two", "three", "four", "one", "two", "five", "six", "seven", "eight", "nine", "one" };

        Map<String, Integer> map = new HashMap<>();
        for (String arrayWord : arrayWords) {
            map.put(arrayWord, map.getOrDefault(arrayWord, 0) + 1);
        }

        System.out.println(map);
        System.out.println("\n");

        Set<String> words = new HashSet<>(Arrays.asList(arrayWords));
        System.out.println(words);


        PhoneBook book = new PhoneBook();
        book.add("Vasya", "12345");
        book.add("Petya", "12345");
        book.add("Vasya", "98765");
        book.add("Sveta", "12345");
        System.out.println("\n");
        System.out.println(book.get("Vasya"));
    }

}