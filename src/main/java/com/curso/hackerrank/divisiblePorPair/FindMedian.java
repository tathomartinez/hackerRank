package com.curso.hackerrank.divisiblePorPair;

import java.util.Collections;
import java.util.List;

public class FindMedian {

    private static int size;

    public static int findMedian(List<Integer> arr) {
        size = arr.size();
        Integer mitad = (int)size/2;
        
        Collections.sort(arr);
        
        return arr.get(mitad);
    }
    
}
