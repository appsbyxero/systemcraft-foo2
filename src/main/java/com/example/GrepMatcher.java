package com.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class GrepMatcher {
    public static void MatchInFile(String path, Pattern patternRegex) throws Exception {
        var out = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        
        for (String line: lines) {
            var found = patternRegex.matcher(line).find();
            if (found) {
                out.println(line);
            }
        }
    }
}
