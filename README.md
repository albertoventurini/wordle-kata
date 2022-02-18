# Wordle Kata

Goal: practice test-driven development (TDD) while implementing a Wordle-inspired game.

## Wordle game

Features:
1. Single word
2. Wordle game

### Single word
As a user, I can try to guess a word, so that I get visual feedback on which letters are correct or incorrect.

The application chooses a random 5-letter word from a dictionary. The user can enter a word
(either via standard input or another way) and the application provides a sequence of color-coded
emojis:
- a grey emoji square is an incorrect letter
- a green emoji square is a correct letter
- an orange emoji square is a letter that appears in the target word at a different place.

Example: the target word is "valid" and the user enters "lived". The application returns: 🟨🟨🟨⬜🟩.

### Wordle game

As a user, I can play a Worlde game consisting of multiple guesses.

The original Wordle game limits the number of attempts to 6, which is a reasonable number
(but could be configured to something else).

## Wordle solver

Stdout > valid
Stdin  > rrgor (r = red, g = green, o = orange)

Stdout > hello
Stdin  > rggrr
