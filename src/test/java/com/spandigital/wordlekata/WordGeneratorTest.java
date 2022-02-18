package com.spandigital.wordlekata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordGeneratorTest {


    public void constructor_whenInputSetIsEmpty_ThrowsException() {


        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new WordGenerator(new HashSet<>());
        });

        Assertions.assertEquals("some message", thrown.getMessage());
    }

}
