package org.example;

import java.util.TreeMap;

public class PhoneBook {

    private static TreeMap<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        return phoneBook.size();
    }

}
