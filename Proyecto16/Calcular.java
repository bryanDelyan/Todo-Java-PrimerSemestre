/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calcular {
    public void calcularResultado(){
         try (Scanner s = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño del arreglo: ");
             int a = s.nextInt();
             int [] base = new int [a];
             int []resultado = new int [a];
             
             //Este método sirve para ingresar los valores a los arreglos
   for(int i = 0; i < a;i++ ){
                System.out.println("Ingrese el número para la matriz");
                base[i]= s.nextInt();
   }
     for(int i = 0; i < a;i++) {
              int cont = base[i];
              if((cont % 2)==0){
                  resultado[i]= (int) Math.pow(cont,2);
              }
              else{
                  resultado[i]= (int) Math.pow(cont, 3);
              }
   }
   
            System.out.println("Arreglo base");
            for(int i = 0; i < a;i++ ){
                System.out.println(base[i]);
                System.out.println("");
            }
            System.out.println("Arreglo resultado elevado al cuadrado y al cubo");
            for(int i = 0; i < a;i++ ){
                System.out.println(resultado[i]);
                System.out.println("");
}
        }
} 
}
