package com.curso.hackerrank.divisiblePorPair;

import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        System.out.println(arr.toString());
        int resultado = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i < j) {
                    int suma = arr.get(i) + arr.get(j);
                    if (suma % k == 0)
                        resultado++;

                }

            }

        }

        return resultado;
    }

}
