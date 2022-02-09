package com.curso.twicth;

import java.util.ArrayList;
import java.util.List;

import com.utils.exeptiion.JavaLoopsCustomException;

public class Javaloops {

    public List<String> usarMultiplos(int n) throws JavaLoopsCustomException {
        if(n < 2 || n >= 20){
            throw new JavaLoopsCustomException("001: numero fuera de rango");
        }

        List<String> retornoList = new ArrayList<>();

        int retornoInt = 0;
        
        for (int i = 1; i <= 10; i++) {
            
            retornoInt = n * i;
            retornoList.add(String.format("%d x %d = %d",n,i,retornoInt));
            
        }
        return retornoList;
    }
}
