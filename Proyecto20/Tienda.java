/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tienda {
    int  [][] departamento = new int[8][7]; //dia 0 es lunes y así 
    public void llenarArreglo(){
       try (/* departamento[0][0]=5;
                departamento[0][1]=5;
                departamento[0][2]=5;
                departamento[0][3]=5;
                departamento[0][4]=5;
                departamento[0][5]=5;
                departamento[0][6]=5;*/ //Así serúa 
        Scanner s = new Scanner(System.in)) {
            //Crear dos for para que uno recorra las columnas y las otra las filas
            for (int i = 0; i < departamento.length; i++) { //Cantidad de filas
                for (int j = 0; j < departamento[i].length; j++) {
                    System.out.println("Digite el número" + "[" + i + "," + j + "]");
                    departamento[i][j] = s.nextInt(); // Llenar matriz
                }
            }
        }
    }
    
    
    public int cantidadTrabajadores (int dia){
        int suma = 0;
        for(int i = 0 ; i < departamento[dia].length;i++){
            suma += departamento [dia][i];
        }
        return suma;
        
    }
    //sumar columnas
    
    
    
    public int sumaDepartamento(int f){
        int suma = 0;
        for (int i = 0; i < departamento[f].length; i++) {
            suma += departamento[f][i];
       
    }
        return suma;
}
    public int mayorDepartamento(int d){
        
        int mayor = departamento[0].length;
        for(int i = 0; i < departamento[d].length;i++ ){
            if(departamento[0][0] > mayor ){
                   mayor = departamento[0][0];
            }
        }
            return mayor;
    }

}