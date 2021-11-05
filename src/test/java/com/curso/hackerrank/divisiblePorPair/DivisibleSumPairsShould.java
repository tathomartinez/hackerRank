package com.curso.hackerrank.divisiblePorPair;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DivisibleSumPairsShould {
    
    private int sizeAr = 0;
    private int divisible = 0;
    private List<Integer> ar = new ArrayList<Integer>();
    @Before
    public void setUp() {
    }

    @Test
    public void split() {
        sizeAr = 6;
        divisible = 3;
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2); 
        int actual = DivisibleSumPairs.divisibleSumPairs(sizeAr,divisible,ar);
        int expected=5;
        assertEquals(expected, actual);
        
    }
    
}
