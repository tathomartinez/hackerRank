package com.curso.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private List<String> peliculas = Arrays.asList("superheroes", "superman", "wolverine", "garganta profunda");

    public List<String> findByName(String _comparador) {
        // Normalizacion
        String comparador = _comparador.trim().toLowerCase();
        
        if(comparador == null || comparador == "")
            return null;

        return peliculas.stream().filter(item -> item.contains(comparador)).collect(Collectors.toList());
    }

}
