package com.curso.hackerrank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ExampleTDDShould {

    private ExampleTDD exampleTDD;

    @Before
    public void setUp() {
        exampleTDD = new ExampleTDD();
    }

    /////////////////
    @Test
    // @Ignore("mantenimiento de otra vaina")
    public void calcularEnSerie() {
        List<String> listaActual = exampleTDD.calcularEnSerie(3);
        List<String> listaExperate = new ArrayList<>();
        listaExperate.add("1");
        listaExperate.add("2");
        listaExperate.add("Fizz");
        assertThat(listaActual, CoreMatchers.is(listaExperate)); 
    }

    @Test
    // @Ignore("mantenimiento de otra vaina")
    public void calcularEnSerie_test_01() {
        List<String> listaActual = exampleTDD.calcularEnSerie(7);
        List<String> listaExperate = new ArrayList<>();

        listaExperate.add("1");
        listaExperate.add("2");
        listaExperate.add("Fizz");
        listaExperate.add("4");
        listaExperate.add("Buzz");
        listaExperate.add("Fizz");
        listaExperate.add("7");

        assertThat(listaActual, CoreMatchers.is(listaExperate)); 
    }

    /////////////////
    @Test
    @Ignore("mantenimiento de otra vaina")
    public void return_I_when_type_1() {
        String a = exampleTDD.getRomanNumber(1);
        assertTrue(a.equals("I"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void return_II_when_type_2() {
        String a = exampleTDD.getRomanNumber(2);
        assertTrue(a.equals("II"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void return_II_when_type_3() {
        String a = exampleTDD.getRomanNumber(3);
        assertTrue(a.equals("III"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void return_II_when_type_5() {
        String a = exampleTDD.getRomanNumber(5);
        assertTrue(a.equals("V"));
    }

    ///////////////////////////////////

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void retunr_fizz_when_is_tree() {
        assertTrue(exampleTDD.calcular(3).equals("Fizz"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void retunr_fizz_when_is_5() {
        assertTrue(exampleTDD.calcular(5).equals("Buzz"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void retunr_fizz_when_is_multiplo_3() {
        assertTrue(exampleTDD.calcular(6).equals("Fizz"));
        assertTrue(exampleTDD.calcular(9).equals("Fizz"));
        assertFalse(exampleTDD.calcular(15).equals("Fizz"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void retunr_fizz_when_is_multiplo_5() {
        assertTrue(exampleTDD.calcular(5).equals("Buzz"));
        assertTrue(exampleTDD.calcular(10).equals("Buzz"));
        assertTrue(exampleTDD.calcular(20).equals("Buzz"));
        assertTrue(exampleTDD.calcular(25).equals("Buzz"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void retunr_fizz_when_is_15() {
        assertTrue(exampleTDD.calcular(15).equals("FizzBuzz"));
    }

    @Test
    @Ignore("mantenimiento de otra vaina")
    public void return_the_same_number_if_not_is_multipl_3_AND_5() {
        assertFalse(exampleTDD.calcular(3).equals("3"));
        assertFalse(exampleTDD.calcular(5).equals("5"));
        assertTrue(exampleTDD.calcular(1).equals("1"));
    }

}
