package com.example.pruebas;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class BigSum {

    public static void main(String [] arg){

        int d[][] = { { 11,2,4 }, { 4 ,5 ,6 }, { 10,8,-12} };
        int suma1=0;
        int suma2=0;
        int k=0;
        for(int i=0;i<d.length;i++){
            //System.out.print(d[i][i]);
            suma1+=d[i][i];

        }
        k=d.length-1;
            for(int j=0;j<d.length;j++){
                if(k>=0){
                    //System.out.print(d[j][k]);
                    suma2+=d[j][k];
                    k--;
                }

            }
            System.out.print("suma derecha es" + suma1+"suma izquierda es"+ suma2);
    }

}
