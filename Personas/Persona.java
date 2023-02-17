/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {

    int[] edades = new int[10];

    public void agregarEdades() {
        for (int i = 0; i < edades.length; i++) {
            try (Scanner s = new Scanner(System.in)) {
                System.out.println("Introduzca las edades : ");
                edades[i] = s.nextInt();
            }
        }
    }

    public int personasMenores() { //calcular las personas menores a 18 años
        int menores = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 18) {
                menores++;
            }
        }
        return menores;
    }

    public int personasMayores() { //calcular las personas mayores a 60 años
        int mayores = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > 60) {
                mayores++;
            }
        }
        return mayores;
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        double promedio = suma / edades.length;
        return promedio;
    }
    public int menoresAlPromedio(){
       double prom = promedio();
       int edad = 0;
       for(int i = 0; i < edades.length;i++){
           if(edades[i] < prom){
               edad++;
           }
       }
       return edad;
    }
}
