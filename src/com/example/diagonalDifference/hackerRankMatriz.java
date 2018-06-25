package com.example;
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
        int suma1=0;
        int suma2=0;
        int k=0;
        int result=0;
        for(int i=0; i< arr.length;i++){
            suma1+=arr[i][i];
        }
        k=arr.length-1;
        for(int j=0;j< arr.length;j++){
            if(k>=0){
                suma2+=arr[j][k];
                k--;
            }
        }
        result=suma2-suma1;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);
}
