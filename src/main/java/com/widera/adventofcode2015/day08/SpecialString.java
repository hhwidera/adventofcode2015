package com.widera.adventofcode2015.day08;

class SpecialString {

    private final String string;

    SpecialString(String string) {
        this.string = string;
    }

    int numberOfCharactersOfCode() {
        return this.string.length();
    }

    int numberOfCharacters() {
        int counter = 0;
        for (int c = 1; c < this.string.length() - 1; c++) {
            if (this.string.charAt(c) == '\\') {
                switch (this.string.charAt(c+1)) {
                    case '"':
                    case '\\':
                        c++;
                        break;
                    case 'x':
                        c += 3;
                        break;
                    default:
                }
            }
            counter++;
        }
        return counter;
    }

    SpecialString encode() {
        StringBuilder encodesString = new StringBuilder("\"");
        for (int c = 0; c < this.string.length(); c++) {
            if (this.string.charAt(c) == '"' || this.string.charAt(c) == '\\') {
                encodesString.append("\\");
            }
            encodesString.append(this.string.charAt(c));
        }
        encodesString.append('"');
        return new SpecialString(encodesString.toString());
    }
}
