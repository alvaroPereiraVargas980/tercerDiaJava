package com.example.diagonalDifference;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class hackerRankMatriz {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int suma1 = 0;
        int suma2 = 0;
        int k = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            suma1 += arr[i][i];
        }
        k = arr.length - 1;
        for (int j = 0; j < arr.length; j++) {
            if (k >= 0) {
                suma2 += arr[j][k];
                k--;
            }
        }
        result = suma2 - suma1;
        return result;
    }



    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la dimencion del array");
        int numero=sc.nextInt();
        int arr[][]= new int[numero][numero];
        for(int i =0; i< arr.length;i++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print("ingrese los datos del array");
                arr[i][k] = sc.nextInt();

            }
        }
        System.out.print(diagonalDifference(arr));
    }

    }


