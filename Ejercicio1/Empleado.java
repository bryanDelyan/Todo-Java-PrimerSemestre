/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado {
    String [] empleados = new String [3];
    int [] ingresos = new int [3];
    
    public void pedirDatos(){
          try (Scanner s = new Scanner(System.in)) {
            for(int i = 0; i < empleados.length; i++){
                  System.out.println("Ingrese los nombres de los Empleados");
                    empleados[i] = s.next();
                  System.out.println("Ingrese los sueldos de los Empleados");
                    ingresos[i]=s.nextInt();              
   }
        }
}
    public int calcularSuma(){
        int suma =0;
        for(int i = 0;i<ingresos.length;i++){
            suma += ingresos[i];
             
        }
          return suma;     
    }
    public String mayorSueldo(){
        int mayor = ingresos[0];
        String nombre = empleados[0];
        for(int i = 0; i < ingresos.length;i++){
            if(ingresos[i] > mayor){
                mayor = ingresos[i];
                nombre = empleados[i];
            }
        
        }
        return nombre +" "+ mayor;
    }
    
    
}