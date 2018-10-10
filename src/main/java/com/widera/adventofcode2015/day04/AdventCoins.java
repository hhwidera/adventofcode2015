package com.widera.adventofcode2015.day04;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class AdventCoins {

    private final String secret;

    AdventCoins(final String secret) {
        this.secret = secret;
    }

    int mine(int sizeOfStartingZeros) {
        final String breakCondition = buildStringOfZeros(sizeOfStartingZeros);
        int counter = 0;
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ignore) {
            throw new IllegalArgumentException();
        }

        String hash;
        do {
            counter++;
            hash = bytesToHex(digest.digest((this.secret + counter).getBytes(StandardCharsets.UTF_8)));
        } while (!hash.startsWith(breakCondition));
        return counter;
    }

    private String bytesToHex(byte[] hashBytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte hashByte : hashBytes) {
            String hex = Integer.toHexString(0xff & hashByte);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private String buildStringOfZeros(int size) {
        StringBuilder condition = new StringBuilder();
        for (int i = 0; i < size; i++) {
            condition.append("0");
        }
        return condition.toString();
    }
}
