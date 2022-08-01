package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    @DisplayName("This is my first Test")
    public void firstTest(){
        Assertions.assertEquals("U, PG & 12 films are available.",1);
    }

    @Test
    @DisplayName("Given the time is 21, return Good Evening")
    void giveTheTimeIs21ReturnGoodEvening(){
        Assertions.assertEquals("Good Evening", Greeter.getGreeting(21));
    }
}
