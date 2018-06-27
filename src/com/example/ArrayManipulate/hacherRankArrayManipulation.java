package com.example.ArrayManipulate;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class hacherRankArrayManipulation {

    // Complete the arrayManipulation function below.
    static int arrayManipulation(int n, int[][] queries) {
        int[] resul = GenerateCero(n);
        int[] limite1 = generarLimite1(queries);
        int[] limite2 = generarLimite2(queries);
        int[] sumatoria = generarSuma(queries);
        int[] res = generarRespuesta(limite1, limite2, sumatoria,resul);
        int  respuesta=gene(res);
        return respuesta;

    }
    public static int gene( int[]e){

        int Max = e[0];
        for (int i = 1; i < e.length; i++){
            if (e[i] > Max) {
                Max = e[i];
            }
        }
        return Max;
    }
    public static int[] generarLimite1( int[][]n){
        int [] arr1=new int [3];
        IntStream.range(0, n.length).forEach(r -> arr1[r] = n[r][0]);

        return arr1;
    }
    public static int []generarLimite2( int[][]m){
        int [] arr2=new int [3];
        IntStream.range(0,m.length).forEach(r -> arr2[r] = m[r][1]);

        return arr2;
    }
    public static int []generarSuma( int[][]k){
        int [] arr3=new int [3];
        IntStream.range(0,k.length).forEach(r -> arr3[r] = k[r][2]);

        return arr3;
    }


    public static int [] GenerateCero(int n){
        int[] ceros=new int[n];
        IntStream.range(0,ceros.length).forEach(i->ceros[i]=0);

        return ceros;
    }
    public static int [] generarRespuesta(int [] m,int []h,int[] s,int []res){

        for(int i=0;i<m.length;i++){
            int nu=m[i];
            int num=h[i];
            int lim= s[i];

            IntStream.range(nu, num).forEach(r -> res[r] += lim);

        }
        return res;
    }


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][3];
        System.out.print("ingrese los datos del entero");
        int numero=sc.nextInt();
        for(int i =0; i<3;i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("ingrese los datos del array");
                arr[i][k] = sc.nextInt();

            }
        }
        System.out.print(arrayManipulation(numero,arr));
    }
}
