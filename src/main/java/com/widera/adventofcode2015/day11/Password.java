package com.widera.adventofcode2015.day11;

import java.util.Objects;

class Password {

    static Password of(final String input) {
        return new Password(input);
    }

    private final String input;

    private Password(final String input) {
        this.input = input;
    }

    private String string() {
        return this.input;
    }

    boolean isIncreasingStraightThreeLettersValid() {
        for(int c = 0; c < this.input.length() - 2; c++) {
            if (this.input.charAt(c) + 1 == this.input.charAt(c+1) && this.input.charAt(c) + 2 == this.input.charAt(c+2)) {
                return true;
            }
        }
        return false;
    }

    boolean isNotAllowedLettersValid() {
        for(int c = 0; c < this.input.length(); c++) {
            if (this.input.charAt(c) == 'i' || this.input.charAt(c) == 'o' || this.input.charAt(c) == 'l') {
                return false;
            }
        }
        return true;
    }

    boolean isTwoDoubleLettersValid() {
        int matches = 0;
        for(int c = 0; c < this.input.length() - 1; c++) {
            if(this.input.charAt(c) == this.input.charAt(c + 1)) {
                matches++;
                c++;
            }
        }
        return matches >= 2;
    }

    boolean isEightLettersValid() {
        return this.input.length() == 8;
    }

    boolean isLowerCaseLettersValid() {
        for(int c = 0; c < this.input.length(); c++) {
            if (this.input.charAt(c) < 'a' || this.input.charAt(c) > 'z') {
                return false;
            }
        }
        return true;
    }

    boolean isValid() {
        return isNotAllowedLettersValid() && isIncreasingStraightThreeLettersValid() && isLowerCaseLettersValid()
                && isTwoDoubleLettersValid() && isEightLettersValid();
    }

    Password nextValidPassword() {
        Password incrementedPassword = Password.of(this.input);
        do {
            incrementedPassword = increment(incrementedPassword.string().toCharArray(), incrementedPassword.string().length() - 1);
        } while (!incrementedPassword.isValid());
        return incrementedPassword;
    }

    private Password increment(final char[] chars, final int position) {
        Password result;
        if (chars[position] == 'z') {
            chars[position] = 'a';
            result = increment(chars, position - 1);
        } else {
            chars[position]++;
            result = Password.of(String.valueOf(chars));
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(input, password.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input);
    }

    @Override
    public String toString() {
        return this.input;
    }
}
