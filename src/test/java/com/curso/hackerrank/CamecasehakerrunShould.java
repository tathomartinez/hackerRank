package com.curso.hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamecasehakerrunShould {
    private Camecasehakerrun camecasehakerrun;

    @Before
    public void setUp() {
        camecasehakerrun = new Camecasehakerrun();
    }

    @Test
    public void split() {
        String datoPrueba = "S;M;plasticCup()";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("plastic cup", actual);
        
    }

    @Test
    public void split_second_test() {
        String datoPrueba = "C;V;mobile phone";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("mobilePhone", actual);
        
    }
    
    @Test
    public void split_3_test() {
        String datoPrueba = "C;C;coffee machine";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("CoffeeMachine", actual);
        
    }
    
    @Test
    public void split_4_test() {
        String datoPrueba = "S;C;LargeSoftwareBook";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("large software book", actual);
        
    }

    @Test
    public void split_5_test() {
        String datoPrueba = "C;M;white sheet of paper";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("whiteSheetOfPaper()", actual);
        
    }

    @Test
    public void split_6_test() {
        String datoPrueba = "S;V;pictureFrame";
        String actual = camecasehakerrun.transform(datoPrueba);
        assertEquals("picture frame", actual);
        
    }
    
}
