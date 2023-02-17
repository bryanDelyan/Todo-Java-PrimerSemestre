/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalcularCalorias {

    int[] calorias = new int[7];
    String [] semana = new String[7];
    
    public void agregarCalorias() {
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < calorias.length; i++) {
            System.out.println("Ingrese las calorias separadas por espacio");
                calorias[i] = s.nextInt();
            System.out.println("Ingrese el día de la semana");
                semana[i]=s.next();
            }
        }
    }
    public double promedioCalorias(){
        double suma = 0.0;
        for (int i = 0; i < calorias.length; i++) {
            suma+=calorias[i];
        }
        double promedio = suma/calorias.length;
        return promedio;
        }
    public String mayorCaloria(){
        int mayor = calorias [0];
        String diaMayor = null;
        for(int i = 0; i < calorias.length;i++){
            if(calorias[i] > mayor ){
                mayor = calorias[i];
                diaMayor = semana[i];
            } 
        }
        return mayor+ " " +diaMayor;
    }
    public String menorCaloria(){
        int menor = calorias[0];
        String diaMenor = null;
        for(int i = 0; i < calorias.length;i++){
            if(calorias[i] < menor){
                menor = calorias[i];
                diaMenor = semana [i];
            }    
        }
        return menor + " " +diaMenor;
    }
        
    }


