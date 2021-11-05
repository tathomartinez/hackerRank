package com.curso.hackerrank.divisiblePorPair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> salida = new ArrayList<>();
        // Write your code here
        for (String querie : queries) {
            salida.add(strings.stream().filter(string -> string.equals(querie)).collect(Collectors.toList()).size());
        }

        return salida;
    }

}
