package com.curso.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Before;

public class GradingStudentsTest {
    // private GradingStudents gradingStudents;

    @Before
    public void setup() {

    }

    @Test
    public void gradingStudentsCaso_uno() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(4);
        gradesInput.add(73);
        gradesInput.add(67);
        gradesInput.add(38);
        gradesInput.add(33);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);

        gradesOutputExpect.add(75);
        gradesOutputExpect.add(67);
        gradesOutputExpect.add(40);
        gradesOutputExpect.add(33);

        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }

    @Test
    public void gradingStudentsRedondear() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(84);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);

        gradesOutputExpect.add(85);

        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }

    @Test
    public void gradingStudentsRedondear73() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(73);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);

        gradesOutputExpect.add(75);

        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }

    @Test
    public void gradingStudentsRedondear33() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(33);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);

        gradesOutputExpect.add(33);

        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }


    @Test
    public void gradingStudentsRetornar10wheninputis8() {
        Integer multipleOutputExpect = 10;
        Integer multipleOutput = GradingStudents.nextMultipleFive(8);
        assertThat(multipleOutput, CoreMatchers.is(multipleOutputExpect));
    }

    @Test
    public void gradingStudentsRetornar12wheninputis15() {
        Integer multipleOutputExpect = 15;
        Integer multipleOutput = GradingStudents.nextMultipleFive(12);
        assertThat(multipleOutput, CoreMatchers.is(multipleOutputExpect));
    }

    @Test
    public void gradingStudentsRedondearcaso2() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(29);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);
        gradesOutputExpect.add(29);
        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }

    @Test
    public void gradingStudentsRedondearFiftyseven() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        gradesInput.add(57);
        gradesOutputExpect.add(57);
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);
        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }

    @Test
    public void gradingStudentsRedondearForty() {
        List<Integer> gradesInput = new ArrayList<Integer>();
        List<Integer> gradesOutputExpect = new ArrayList<Integer>();
        List<Integer> gradesOutput = GradingStudents.gradingStudents(gradesInput);
        assertThat(gradesOutput, CoreMatchers.is(gradesOutputExpect));
    }
}
