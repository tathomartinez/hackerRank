package com.curso.hackerrank.divisiblePorPair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;


public class SparseArraysShould {
    @Before
    public void setUp() {
    }

    @Test
    public void TEST_01() {
        List<Integer> expected = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");
        
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");



        expected.add(2);
        expected.add(1);
        expected.add(0);
        List<Integer> actual = SparseArrays.matchingStrings(strings, queries);
       
        assertEquals(expected, actual);
        assertThat(actual, CoreMatchers.is(expected));
        
    }

    @Test
    public void TEST_02() {
        List<Integer> expected = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("def");
        strings.add("de");
        strings.add("fgh");
        
        queries.add("de");
        queries.add("lmn");
        queries.add("fgh");

        expected.add(1);
        expected.add(0);
        expected.add(1);

        List<Integer> actual = SparseArrays.matchingStrings(strings, queries);
       
        assertEquals(expected, actual);
        assertThat(actual, CoreMatchers.is(expected));
        
    }

    @Test
    public void TEST_03() {
        List<Integer> expected = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        strings.add("abcde");
        strings.add("sdaklfj");
        strings.add("asdjf");
        strings.add("na");
        strings.add("basdn");
        strings.add("sdaklfj");
        strings.add("asdjf");
        strings.add("na");
        strings.add("asdjf");
        strings.add("na");
        strings.add("basdn");
        strings.add("sdaklfj");
        strings.add("asdjf");

        queries.add("abcde");
        queries.add("sdaklfj");
        queries.add("asdjf");
        queries.add("na");
        queries.add("basdn");

        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        
        List<Integer> actual = SparseArrays.matchingStrings(strings, queries);
       
        assertEquals(expected, actual);
        assertThat(actual, CoreMatchers.is(expected));
        
    }
    
}
