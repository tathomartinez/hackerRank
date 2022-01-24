package com.curso.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ExampleTDD {

    private String palabra = "";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String calcular(int valor) {
        palabra = "";
        palabra = palabra + (valor % 3 == 0 ? FIZZ : "") + (valor % 5 == 0 ? BUZZ : "");

        return palabra.trim().isEmpty() ? String.valueOf(valor) : palabra;
    }
    
    public List<String> calcularEnSerie(int valor) {
        List<String> retorno = new ArrayList<>();

        for (int i = 1; i <= valor; i++) {
            palabra = "";
            palabra = palabra + (i % 3 == 0 ? FIZZ : "") + (i % 5 == 0 ? BUZZ : "");
            retorno.add(palabra.trim().isEmpty() ? String.valueOf(i) : palabra);
            
        }

        palabra = "";
        palabra = palabra + (valor % 3 == 0 ? FIZZ : "") + (valor % 5 == 0 ? BUZZ : "");

        for (String string : retorno) {
            System.out.println(string);
        }

        return retorno;
    }

    public String getRomanNumber(int number) {
        String numeroRomano = "";
        switch (number) {
        case 1:
            numeroRomano = "I";

            break;
        case 2:
            numeroRomano = "II";
            break;
        case 3:
            numeroRomano = "III";
            break;
        case 5:
            numeroRomano = "V";
            break;

        default:
            break;
        }
        return numeroRomano;
    }



}
