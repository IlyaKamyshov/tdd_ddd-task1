package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneBookTest {

    @Test
    void add() {
        String name = "Sleepy Joe";
        String phoneNumber = "+1-(555)-555-1234";
        int expected = 1;
        int actual = PhoneBook.add(name, phoneNumber);
        assertThat(actual, is(expected));
    }

    @Test
    void findByNumber() {
        PhoneBook.add("Sleepy Joe", "+1-(555)-555-1234");
        String expectedName = "Sleepy Joe";
        String actualPhoneNumber = "+1-(555)-555-1234";
        String actualName = PhoneBook.findByNumber(actualPhoneNumber);
        assertThat(actualName, is(expectedName));
    }

    @Test
    void findByName() {
        PhoneBook.add("Sleepy Joe", "+1-(555)-555-1234");
        String expectedPhoneNumber = "+1-(555)-555-1234";
        String actualName = "Sleepy Joe";
        String actualPhoneNumber = PhoneBook.findByName(actualName);
        assertThat(actualPhoneNumber, is(expectedPhoneNumber));
    }

}
