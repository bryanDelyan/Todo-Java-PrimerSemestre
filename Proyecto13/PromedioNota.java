/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PromedioNota {
    public void promedio(){
    int cantidadDeNotas = 0;
    double nota = 0;
    int acumulacion=1;
    
     try (Scanner s = new Scanner(System.in)) {
        System.out.println("Digite la cantidad de notas  (-1 para salir)");
        cantidadDeNotas = s.nextInt();
        while(cantidadDeNotas != -1){
            while(acumulacion <=cantidadDeNotas){
            System.out.println("Ingresa la nota: "+acumulacion);
            double n = s.nextDouble();
            nota+=n;
            acumulacion++;
          
            
        }
            double prom = nota / cantidadDeNotas;
            System.out.println("El promedio es: " +prom );
            break;
        }
    }
     
    }
}
