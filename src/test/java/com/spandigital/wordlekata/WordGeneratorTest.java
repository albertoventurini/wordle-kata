package com.spandigital.wordlekata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordGeneratorTest {

    @Test
    public void constructor_whenInputSetIsEmpty_ThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new WordGenerator(Collections.emptySet());
        });
    }

    @Test
    public void constructor_whenInputSetIsNotEmpty_DoesntThrowException() {
        Assertions.assertDoesNotThrow(() -> {
            new WordGenerator(Set.of("something"));
        });
    }

    @Test
    public void getWord_withSingleWordDictionary_returnsTheWord() {
        final var wordSet = Set.of("word1");
        final var wordGenerator = new WordGenerator(wordSet);

        final String word = wordGenerator.getWord();

        assertTrue(wordSet.contains(word));
    }

    @Test
    public void getWord_withMultiWordDictionary_returnsAWordInDictionary() {
        final var wordSet = Set.of("word2", "word3");
        final var wordGenerator = new WordGenerator(wordSet);

        final String word = wordGenerator.getWord();

        assertTrue(wordSet.contains(word));
    }

}
