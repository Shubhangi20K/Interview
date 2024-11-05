package com.nt;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> groupedAnagrams = Arrays.stream(str)
            .collect(Collectors.groupingBy(AnagramGrouping::sortString))
            .values()
            .stream()
            .map(ArrayList::new)
            .collect(Collectors.toList());

        System.out.println(groupedAnagrams);
    }

    // Helper method to sort characters in a string
    private static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
