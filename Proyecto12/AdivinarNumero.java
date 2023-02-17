/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AdivinarNumero {
    public void adivinar(){
    int numero =0;
    int nAleatorio=0;
    
     nAleatorio = (int)(Math. random()*10+1);//Calcular número aleatorio entre 1 y 10
     
     do{
     try (Scanner s = new Scanner(System.in)) {
        System.out.println("Digite un número entre 1 y 10: ");
         numero = s.nextInt();
    }
     if(nAleatorio > numero){
         System.out.println("El número es más grande");
     
     }
     else{
          System.out.println("El número es más chico");
     
     }
        
     
     }while(numero != nAleatorio);
     
     System.out.println("Adivinaste el número, el número era el: "+nAleatorio);
     
    } 
}
