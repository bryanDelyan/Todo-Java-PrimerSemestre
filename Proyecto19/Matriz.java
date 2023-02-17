/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Matriz {

    int[][] numeros = new int[8][7];
    //una forma int [][] numeros2 = {{2,5},{6,8},{7,12}};

    public void llenar() { //Forma manual
        numeros[0][0] = 2;
        numeros[0][1] = 5;
        numeros[1][0] = 6;
        numeros[1][1] = 8;
        numeros[2][0] = 7;
        numeros[2][1] = 12;
    }
// con scanner

    public void llenarScanner() {
        try (Scanner s = new Scanner(System.in)) {
            //Crear dos for para que uno recorra las columnas y las otra las filas
            for (int i = 0; i < numeros.length; i++) { //Cantidad de filas
                for (int j = 0; j < numeros[i].length; j++) {
                    System.out.println("Digite el número" + "[" + i + "," + j + "]");
                    numeros[i][j] = s.nextInt(); // Llenar matriz
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < numeros.length; i++) { //Cantidad de filas
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("El número en la posición:" + "[" + i + "," + j + "]");
                System.out.println("=" + numeros[i][j]);
            }
        }
    }

    public double promedio() {
        double suma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
            }
        }
        return suma / (numeros.length * numeros[0].length);
    }

    // Suma de los elementos de cada fila por ejemplo la fila 0 seria 2 + 5 = 7
    public int sumaFila(int f) {
        int suma = 0;
        for (int i = 0; i < numeros[f].length; i++) {
            suma += numeros[f][i];
        }
        return suma;
    }
}
