package com.curso.hackerrank.divisiblePorPair;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class LonelyIntegerShould {

    private LonelyInteger lonelyInteger  = new LonelyInteger();

    @Before
    public void setUp() {
    }

    @Test
    public void get_Unique_Element_when_use_array_get_4() {

        List<Integer> inputList = new ArrayList<>();
        
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);
        
        assertThat(lonelyInteger.lonelyInteger(inputList), CoreMatchers.is((int)4)); 


        
    } 
    
}
