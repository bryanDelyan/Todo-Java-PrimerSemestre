/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Notas {
    public void digitarNotas1(){
        try (Scanner consola = new Scanner(System.in)) {
            System.out.println("Digite una nota entre 1 y 5 o digite -1 para salir");
            int  nota = consola.nextInt();
            do{
             System.out.println("Nota es : "+nota);
             System.out.println("Digite una nota entre 1 y 5 o digite -1 para salir");
              nota = consola.nextInt();
              
            }
            while (nota !=-1);
        }
            
    }
     public void digitarNotas2(){
        try (Scanner consola = new Scanner(System.in)) {
            System.out.println("Digite una nota entre 1 y 5 o digite -1 para salir");
            int  nota = consola.nextInt();
            while(nota != -1){
                System.out.println("Nota es : "+nota);
                System.out.println("Digite una nota entre 1 y 5 o digite -1 para salir");
                nota = consola.nextInt();
   
}
        }
}
}
   
