package com.example.BigSum;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class hackerRantArraySuma {


    static int simpleArraySum(int[] ar) {

        return Arrays.stream(ar).sum();
    }


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el largo del array");
        int numero=sc.nextInt();
        int array[]= new int[numero];
        for(int i =0; i<numero;i++) {
                System.out.print("ingrese los datos del array");
                array[i] = sc.nextInt();


        }
        System.out.print(simpleArraySum(array));
    }

    }

