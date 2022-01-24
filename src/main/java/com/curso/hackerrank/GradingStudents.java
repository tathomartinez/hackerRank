package com.curso.hackerrank;

import static java.lang.Math.round;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        Integer multipleNext = 0;
        List<Integer> gradesOutput = new ArrayList<>();

        for (Integer grade : grades) {
            multipleNext = 0;
            multipleNext += nextMultipleFive(grade);
            if (lessThatForty(multipleNext)) {
                    gradesOutput.add(lessThat(grade, multipleNext) ? multipleNext : grade);
            } else {
                gradesOutput.add(grade);
            }
        }
        return gradesOutput;
    }

    public static boolean lessThat(Integer grade, Integer multipleNext) {
        return (multipleNext - grade) < 3;
    }

    public static boolean lessThatForty(Integer multipleNext) {
        return multipleNext >= 40;
    }

    public static Integer nextMultipleFive(Integer base) {
        int round = round(base / 5);
        int baseout = round + 1;

        return baseout * 5;
    }

}