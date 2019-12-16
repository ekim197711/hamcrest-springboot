package com.example.hamcrestspringboot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class MyHamcrestTest {

    @Test
    void tryString() {
        String spaceshipname = "Hawk 4000";
        assertThat(spaceshipname,
                describedAs("Lets test the name of the spaceship",
                        allOf(
                                anyOf(equalTo("Hawk 4000"), endsWith("5000")),
                                anyOf(hasLength(9), containsString("Swan")),
                                startsWith("Hawk"),
                                equalToCompressingWhiteSpace("    Hawk 4000         \n")
                        )
                )
        );
    }

    @Test
    void tryNumbers() {
        Double magicnumber = 42.0d;
        assertThat(magicnumber,
                describedAs("Test the magic number",
                        is(closeTo(100.d, 60.d))
                ));

        assertThat(magicnumber,
                describedAs("The number again",
                        allOf(greaterThanOrEqualTo(40.0d),
                                lessThanOrEqualTo(50.0d)
                        )));
    }

    @Test
    void tryMaps(){
        Map<String, Double> map = Map.of("first", 100.0d, "second", 200.0d, "third", 300.0d);
        assertThat("We are testing the map",
                map,
                allOf(
                hasEntry("first", 100.0d),
                        hasKey("second"),
                        hasValue(300.0d)
                )
                );

    }

}

















