package com.example;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final var pattern = args[0];
        final var patternRegex = Pattern.compile(pattern);
        final var path = args[1];
        
        try {
            GrepMatcher.MatchInFile(path, patternRegex);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
