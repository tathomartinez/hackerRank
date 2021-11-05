package com.curso.hackerrank.divisiblePorPair;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LonelyInteger {

    public Integer lonelyInteger(List<Integer> inputList) {
        int control = 0;
        int controlPercistencia = IntStream.range(0, inputList.size()).boxed()
                .filter(item -> inputList.get(item).equals(inputList.get(0))).collect(Collectors.toList()).size();
        Integer ocurrenciaMinima = inputList.get(0);

        for (Integer validado : inputList) {

            control = IntStream.range(0, inputList.size()).boxed().filter(item -> inputList.get(item).equals(validado))
                    .collect(Collectors.toList()).size();

            if (controlPercistencia > control) {
                controlPercistencia = control;
                ocurrenciaMinima = validado;
            }
        }
        return ocurrenciaMinima;
    }

}
