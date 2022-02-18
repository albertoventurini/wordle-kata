package com.spandigital.wordlekata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class WordGenerator {

    private final List<String> words;

    private Random random = new Random();

    public WordGenerator(final Set<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.words = new ArrayList<>(words);
    }

    public String getWord() {
        int index = random.nextInt(words.size());
        return words.get(index);
    }
}
