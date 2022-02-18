package com.spandigital.wordlekata;

public class DictionaryWordle implements Wordle {

    @Override
    public String guessWord(final String input, final String target) {
        String output = "";
        for (int i  = 0; i < input.length(); i++) {
            char charInput = input.charAt(i);
            char charTarget = target.charAt(i);

            if (charInput == charTarget) {
                output += "g";
            } else if (target.indexOf(charInput) >= 0) {
                output += "o";
            } else {
                output += "w";
            }
        }
        return output;
    }

}
