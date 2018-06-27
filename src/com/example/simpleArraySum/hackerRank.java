package com.example.simpleArraySum;
import java.io.*;
import java.util.*;


public class hackerRank {

    static int simpleArraySum(int[] ar) {

        return Arrays.stream(ar).sum();
    }



    public static void main(String[] args) {
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
