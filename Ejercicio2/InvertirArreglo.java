/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class InvertirArreglo {
    int [] arreglo1={1,2,3,4,5};
    int [] arreglo2 = new int [arreglo1.length];
    
    public void invertir(){
        for(int i=(arreglo1.length-1),a=0;i>=0;i--,a++){
           arreglo2[a]=arreglo1[i];
           System.out.println(arreglo2[a]);
    
    }
    }
}