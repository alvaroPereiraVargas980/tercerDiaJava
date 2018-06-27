package com.example.ArrayManipulate;

import com.example.simpleArraySum.hackerRank;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class hacherRankArrayManipulationTest {



    @Test
    public void gene() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
        int[] num = {1, 2, 3};
        int max = 3;
        int total=hacherRankArrayManipulation.gene(num);
        assertEquals(max,total);

    }

    @Test
    public void generarLimite1() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
        int [][] num= {{1,2,3},{3,4,5},{3,4,5}};
        int [] resul={1,3,3};
        int [] veri= hacherRankArrayManipulation.generarLimite1(num);
        assertEquals(Arrays.toString(veri),Arrays.toString(resul));

    }

    @Test
    public void generarLimite2() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
        int [][] num= {{1,2,3},{3,4,5},{3,4,5}};
        int [] resul={2,4,4};
        int [] veri= hacherRankArrayManipulation.generarLimite2(num);
        assertEquals(Arrays.toString(veri),Arrays.toString(resul));

    }

    @Test
    public void generarSuma() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
        int [][] num= {{1,2,3},{3,4,5},{3,4,5}};
        int [] resul={3,5,5};
        int [] veri= hacherRankArrayManipulation.generarSuma(num);
        assertEquals(Arrays.toString(veri),Arrays.toString(resul));

    }

    @Test
    public void generateCero() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
        int enteros=8;
        int [] ceros={0,0,0,0,0,0,0,0};
        int [] cerosPrueba= hacherRankArrayManipulation.GenerateCero(enteros);
        assertEquals(Arrays.toString(cerosPrueba),Arrays.toString(ceros));
    }

    @Test
    public void generarRespuesta() {
        hacherRankArrayManipulation hacherRankArrayManipulation=new hacherRankArrayManipulation();
            int [] m={1, 2, 3};
            int [] n ={2, 5, 4};
            int [] p={100, 100, 100};
            int [] ceros={0,0,0,0,0,0,0,0,0,0};
           int [] cerosPrueba={0,100,100,200,100,0,0,0,0,0};
            ceros= hacherRankArrayManipulation.generarRespuesta(m,n,p,ceros);
             assertEquals(Arrays.toString(ceros),Arrays.toString(cerosPrueba));
    }
}
