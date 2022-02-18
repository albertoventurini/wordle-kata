package com.spandigital.wordlekata;

public interface Wordle {

    /**
     * Given an input word, returns the result of guessing the word.
     * @param input a word
     * @return a string of emojis encoding the result
     */
    String guessWord(String input);

}
