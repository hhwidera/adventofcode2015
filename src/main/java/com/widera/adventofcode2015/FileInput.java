package com.widera.adventofcode2015;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileInput {

    public static String readAsString(final String file) {
        try (Stream<String> fileLines = Files.lines(Paths.get(file))) {
            return fileLines.collect(Collectors.joining());
        } catch (IOException exception) {
            return "";
        }
    }

    public static List<String> readLinesAsString(final String file) {
        try (Stream<String> fileLines = Files.lines(Paths.get(file))) {
            return fileLines.collect(Collectors.toList());
        } catch (IOException exception) {
            return Collections.emptyList();
        }
    }
}
