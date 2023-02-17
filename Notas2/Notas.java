/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Notas {
    double [] nota = new double [10];
    
    public void agregarNota(){
        for(int i = 0; i < nota.length;i++){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println(" Agregar notas: ");
            nota[i]=s.nextDouble();
        }
       
    }
        
}
    public int calcularSuspenso(){
        int suspenso = 0;
        for(int i =0; i < nota.length;i++){
            if(nota[i]>=0 && nota[i] < 4.99){
                suspenso++;
            }
        }
        return suspenso;
    }
     public int calcularBien(){
        int bien = 0;
        for(int i =0; i < nota.length;i++){
            if( nota[i]>=5 && nota[i] < 6.99){
                bien++;
            }
        }
        return bien;
    }
     public int calcularNotable(){
        int notable = 0;
        for(int i =0; i < nota.length;i++){
            if( nota[i]>=7 && nota[i] < 8.99){
                notable++;
            }
        }
        return notable;
    }
     public int calcularSobresaliente(){
        int sobresaliente = 0;
        for(int i =0; i < nota.length;i++){
            if( nota[i]>=9 && nota[i] <= 10){
                sobresaliente++;
            }
        }
        return sobresaliente;
    }
}