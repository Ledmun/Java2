package lesson3;

import java.util.*;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    Map<String, HashSet<String>> map;


    public PhoneBook() {
        this.map = new HashMap<>();
    }


    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }
    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}