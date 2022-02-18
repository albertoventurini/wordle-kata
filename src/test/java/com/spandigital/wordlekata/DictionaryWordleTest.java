package com.spandigital.wordlekata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryWordleTest {

    private final Wordle dictionaryWordle = new DictionaryWordle();

    @Test
    public void withTargetWordValid_whenUserGuessesLived_returnsResponse() {

        final String response = dictionaryWordle.guessWord("lived", "valid");

        assertEquals("ooowg", response);
    }

    @Test
    public void withTargetWordValid_whenUserGuessesLiver_returnsResponse() {

        final String response = dictionaryWordle.guessWord("liver", "valid");

        assertEquals("oooww", response);
    }
}
