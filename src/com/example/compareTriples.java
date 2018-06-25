package com.example;

import java.util.stream.IntStream;

public class compareTriples {
    public static void main(String[] arg) {
        int[] num = {5, 6, 7};
        int[] num1 = {3, 6, 10};
        int suma = 0;
        int suma1 = 0;
        for (int i=0; i < num.length; i++) {
            if(num[i]==num1[i]){

            }else {
                if (num[i]>num1[i]) {
                    suma++;
                } else {
                    suma1++;
                }
            }

            /*boolean result = IntStream.of(num).anyMatch(x -> x < dato );
            if (result) {
                System.out.print(dato);
                suma++;//System.out.print("hello 3");
            } else {
                //System.out.print("no longer exist 3");
            }*/
        }
        System.out.print("la resultado del primer array"+suma);
        System.out.print("resultado del segundo array"+suma1);
        //boolean result= IntStream.of(num).anyMatch(x->x==3);
        /*if(result){
            //System.out.print("hello 3");
        }else{
            //System.out.print("no longer exist 3");
        }

    }*/

    }
}
