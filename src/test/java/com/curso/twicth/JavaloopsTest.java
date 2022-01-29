package com.curso.twicth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import com.utils.exeptiion.JavaLoopsCustomException;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Ignore;    
    
public class JavaloopsTest {

    private Javaloops jvaloops;
    private int input;
    private List<String> outputExpect;
    private List<String> Output ;

    @Before
    public void setup(){
        jvaloops = new Javaloops();
        outputExpect = new ArrayList<String>();
        Output= new ArrayList<String>();


    }
        
    @Test(expected = JavaLoopsCustomException.class)
    public void usarMultiplos() throws JavaLoopsCustomException {
        
        input = 0;
        jvaloops.usarMultiplos(input);
        
    }

    @Test(expected = JavaLoopsCustomException.class)
    public void usarMultiplosEnviandoUnNumero0() throws JavaLoopsCustomException {
        input = 0;
        jvaloops.usarMultiplos(input);
    }

    @Test(expected = JavaLoopsCustomException.class)
    public void usarMultiplosEnviandoUnNumero1() throws JavaLoopsCustomException {
        input = 1;
        jvaloops.usarMultiplos(input);
    }

    @Test(expected = JavaLoopsCustomException.class)
    public void usarMultiplosEnviandoUnNumero20() throws JavaLoopsCustomException {
        
        input = 20;
        jvaloops.usarMultiplos(input);
        
    }

    @Test
    public void usarMultiplosEnviandoUnNumero2() throws JavaLoopsCustomException {
        
        input = 2;
        jvaloops.usarMultiplos(input);
        
    }

    @Test
    
    @Ignore("test depreced")
    public void usarMultiplosEnviandoUnNumero2debeRetornarElPrimerMultiplo() throws JavaLoopsCustomException {
        
        input = 2;
        outputExpect.add("2 x 1 = 2");
        Output = jvaloops.usarMultiplos(input);
        assertThat(Output, CoreMatchers.is(outputExpect));
        
    }

    @Test
    @Ignore("test depreced")
    public void usarMultiplosEnviandoUnNumero2debeRetornarLosTresPrimeros() throws JavaLoopsCustomException {
        
        input = 2;
        
        outputExpect.add("2 x 1 = 2");
        outputExpect.add("2 x 2 = 4");
        outputExpect.add("2 x 3 = 6");
       
        Output = jvaloops.usarMultiplos(input);
        
        assertThat(Output, CoreMatchers.is(outputExpect));
    }

    @Test
    public void usarMultiplosEnviandoUnNumero10debeRetornarLosDiezPrimeros() throws JavaLoopsCustomException {
        
        input = 10;
        
        outputExpect.add("10 x 1 = 10");
        outputExpect.add("10 x 2 = 20");
        outputExpect.add("10 x 3 = 30");
        outputExpect.add("10 x 4 = 40");
        outputExpect.add("10 x 5 = 50");
        outputExpect.add("10 x 6 = 60");
        outputExpect.add("10 x 7 = 70");
        outputExpect.add("10 x 8 = 80");
        outputExpect.add("10 x 9 = 90");
        outputExpect.add("10 x 10 = 100");

        Output = jvaloops.usarMultiplos(input);
        
        assertThat(Output, CoreMatchers.is(outputExpect));

    }
}
    