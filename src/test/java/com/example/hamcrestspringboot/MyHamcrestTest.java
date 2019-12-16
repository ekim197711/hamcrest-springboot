package com.example.hamcrestspringboot;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MyHamcrestTest {

    @Test
    void tryStuff(){
        String s = "Test123";
        String n1 = null;
        assertThat(s,
                describedAs("String should end with 123",
                allOf(
                        endsWith("123"),
                        startsWith("Test"))
                )
        );
        assertThat(s, anyOf(endsWith("1234"), startsWith("Test")) );
        assertThat(n1, anything());

        assertThat(0.0/0, notANumber());

        Double magicnumber = 42.d;
        assertThat(magicnumber, allOf(
                closeTo(50.0d, 10.0d),
                greaterThan(30.0d)
        ));

        String whitespace = "  Test123                        \n";
        assertThat(whitespace, equalToCompressingWhiteSpace("    Test123             "));

        Map<String, Integer> map = Map.of("first",1,"second",2);
        assertThat(map, hasEntry("first", 1));
        assertThat(map, hasKey("second"));


    }
}
