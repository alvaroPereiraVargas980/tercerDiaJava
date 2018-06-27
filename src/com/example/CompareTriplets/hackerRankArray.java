package com.example.CompareTriplets;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerRankArray {
    // Complete the solve function below.
    static int[] solve(int[] a, int[] b) {
        int [] arrayNumero= new int [2];
        int suma = 0;
        int suma1 = 0;
        for (int i=0; i < a.length; i++) {
            if(a[i]==b[i]){

            }else {
                if (a[i] > b[i]) {
                    suma++;

                } else {
                    suma1++;
                }
            }
        }
        arrayNumero[0]=suma;
        arrayNumero[1]=suma1;

        return arrayNumero;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el largo de los arrays");
        int numero=sc.nextInt();
        int array1[]= new int[numero];
        int array2[]= new int[numero];
        for(int i =0; i<3;i++) {
                System.out.print("ingrese los datos del array1");
                array1[i] = sc.nextInt();
        }
        for(int j =0; j<3;j++) {
            System.out.print("ingrese los datos del array2");
            array2[j] = sc.nextInt();

        }

        System.out.println(Arrays.toString(solve(array1,array2)));

    }


}
