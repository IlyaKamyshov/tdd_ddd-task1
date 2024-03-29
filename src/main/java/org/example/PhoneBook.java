package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private static TreeMap<String, String> phoneBook = new TreeMap<>();

    public static int add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        return phoneBook.size();
    }

    public static String findByNumber(String phoneNumber) {
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (phoneNumber.equals(entry.getValue())) {
                return entry.getKey().toString();
            }
        }
        throw new RuntimeException("Number is missing in PhoneBook");
    }

    public static String findByName(String name) {
        return phoneBook.get(name);
    }

    public static String printAllNames() {
        List<String> list = new ArrayList<>();
        for (Map.Entry entry : phoneBook.entrySet()) {
            String string = entry.getKey().toString();
            list.add(string);
            System.out.println(string);
        }
        return list.toString();
    }

}
