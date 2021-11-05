package com.curso.hackerrank;

public class Camecasehakerrun {
    private final String CONSTANTE_CLASE = "C";
    private final String CONSTANTE_FINAL_METODO = "()";

    public String transform(String datoPrueba) {
        String salida = "";
        String operation = datoPrueba.substring(0, 1);
        String indicative = datoPrueba.substring(2, 3);
        String value = datoPrueba.substring(4);

        if (operation.equals("S")) {
            if (indicative.equals("M"))
                value = value.replace("()", "");

            String letra;
            for (char caracter : value.toCharArray()) {
                letra = String.valueOf(caracter);
                if (!letra.equals(letra.toLowerCase())) {
                    salida += " ";
                }
                salida += letra;
            }
            salida = salida.toLowerCase();
        } else {
            
            String[] palabras = value.split(" ");
            for (String palabra : palabras) {
                if (!salida.isEmpty() || indicative.equals(CONSTANTE_CLASE)) {
                    palabra = palabra.substring(0, 1).toUpperCase() + palabra.substring(1);
                }
                salida += palabra;
            }

            if(indicative.equals("M"))
                salida+=CONSTANTE_FINAL_METODO;
        }

        return salida.trim();
    }

}
