package com.curso.hackerrank;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class MovieServiceShould {
    private MovieService movieService;
    private List<String> peliculas = Arrays.asList("superheroes", "superman", "wolverine", "garganta profunda");
    private String palabra;

    @Before
    public void setUp() {
        movieService = new MovieService();
    }

    @Test
    public void return_list_conteins_string() {
        palabra = "    Super   ".trim().toLowerCase();
        List<String> listaEsperada = peliculas.stream().filter(item -> item.contains(palabra))
                .collect(Collectors.toList());
        assertThat(movieService.findByName(palabra), CoreMatchers.is(listaEsperada));
    }

    @Test
    public void return_list_conteins_string_gan() {
        palabra = "    GAN   ".trim().toLowerCase();
        List<String> listaEsperada = peliculas.stream().filter(item -> item.contains(palabra))
                .collect(Collectors.toList());
        assertThat(movieService.findByName(palabra), CoreMatchers.is(listaEsperada));
    }

}
