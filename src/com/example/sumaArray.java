package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class sumaArray {

    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[3];
        int suma=0;

        for(int i =0; i<=arr.length-1;i++){
            System.out.print("ingrese los datos del array");
            arr[i]=sc.nextInt();
            suma=suma+arr[i];
        }
        System.out.print(suma);
    }
        //public static int sumaArray(int [] array){
            //return Arrays.stream(array).sum();

   // }

}

