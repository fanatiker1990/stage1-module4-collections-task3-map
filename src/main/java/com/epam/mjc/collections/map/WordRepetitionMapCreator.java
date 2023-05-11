package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        if (sentence.isBlank()) {
            return wordCount;
        }
        sentence = sentence.replaceAll("\\W+", " ");
        String[] words = sentence.split(" ");
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if (wordCount.containsKey(lowerCaseWord)) {
                wordCount.put(lowerCaseWord, wordCount.get(lowerCaseWord) + 1);
            } else {
                wordCount.put(lowerCaseWord, 1);
            }
        }
        return wordCount;
    }
}
