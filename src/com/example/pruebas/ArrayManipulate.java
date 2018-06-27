package com.example.pruebas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayManipulate {

    public static void main(String[] arg) {

        int[][] lista = new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        int[] resul = GenerateCero(10);
        int[] limite1 = generarLimite1(lista);
        int[] limite2 = generarLimite2(lista);
        int[] sumatoria = generarSuma(lista);
        int[] res = generarRespuesta(limite1, limite2, sumatoria, resul);
        long respuesta=gene(res);
        System.out.print(respuesta);
        //Arrays.stream(res).max().ifPresent(System.out::println);
    }
    public static long gene( int[]e){

        long Max = e[0];
        for (int i = 1; i < e.length; i++){
            if (e[i] > Max) {
                Max = e[i];
            }
        }
        return Max;
    }
    public static int []generarLimite1( int[][]n){
        int [] arr1=new int [3];
        IntStream.range(0, n.length).forEach(r -> arr1[r] = n[r][0]);
        //Arrays.stream(arr1).forEach(System.out::print);
        return arr1;
    }
    public static int []generarLimite2( int[][]m){
        int [] arr2=new int [3];
        IntStream.range(0,m.length).forEach(r -> arr2[r] = m[r][1]);
        //Arrays.stream(arr2).forEach(System.out::print);
        return arr2;
    }
    public static int []generarSuma( int[][]k){
        int [] arr3=new int [3];
        IntStream.range(0,k.length).forEach(r -> arr3[r] = k[r][2]);
        //Arrays.stream(arr3).forEach(System.out::print);
        return arr3;
    }


    public static int [] GenerateCero(int n){
        int[] ceros=new int[n];
        IntStream.range(0,ceros.length).forEach(i->ceros[i]=0);
        //Arrays.stream(ceros).forEach(System.out::print);
        return ceros;
    }
    public static int [] generarRespuesta(int [] m,int []h,int[] s,int []res){

        for(int i=0;i<m.length;i++){
            int nu=m[i];
            int num=h[i];
            int lim= s[i];

            IntStream.range(nu, num).forEach(r -> res[r] += lim);
            //Arrays.stream(resul).forEach(System.out::print);
        }
        return res;
    }

}