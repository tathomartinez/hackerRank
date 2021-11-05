package com.curso.hackerrank.divisiblePorPair;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class FindMedianShould {

    @Before
    public void setUp() {
    }

    @Test
    public void calcularEnSerie() {
        List<String> listaExperate = new ArrayList<>();

        listaExperate.add("1");
        listaExperate.add("2");
        listaExperate.add("Fizz");

        List<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);

        int actual = FindMedian.findMedian(arr);
        int expect = 3;


        // assertThat(listaActual, CoreMatchers.is(listaExperate)); 
        assertThat(actual, CoreMatchers.is(expect));
    }
    
}
