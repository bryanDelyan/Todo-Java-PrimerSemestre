/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Temperatura {

    double[][] estaciones = new double[4][12];

    public void llenarArreglo() {
        try (Scanner s = new Scanner(System.in)) {
            //Crear dos for para que uno recorra las columnas y las otra las filas
            for (int i = 0; i < estaciones.length; i++) { //Cantidad de filas
                for (int j = 0; j < estaciones[i].length; j++) {
                    System.out.println("Digite la temperatura (en grados celsius min 8 °C y max 32 °C)" + "[" + (i + 1) + "," + (j + 1) + "]");
                    estaciones[i][j] = s.nextInt(); // Llenar matriz
                }
            }
        }
    }

    public double promedio() {
        double suma = 0;
        for (double[] estacion : estaciones) {
            for (int j = 0; j < estacion.length; j++) {
                suma += estacion[j];
            }
        }
        return suma / (estaciones.length * estaciones[0].length);
    }

    public int sumaFila(int f) {
        int suma = 0;
        for (int i = 0; i < estaciones[f].length; i++) {
            suma += estaciones[f][i];
        }
        return suma;
    }

    public double promedioEstacion1() { //PROMEDIO DE ESTACIONES 2
        double estacion2 = sumaFila(1);
        return estacion2 / 12;
    }

    public double promedioEstacion2() { //PROMEDIO DE ESTACIONES 4
        double estacion4 = sumaFila(3);
        return estacion4 / 12;
    }

    public void sumarColumnas() {
        for (int i = 0; i < estaciones[0].length; i++) {
            double prom = 0;
            double sumas = 0;
            for (int j = 0; j < estaciones.length; j++) {
                sumas += estaciones[j][i];
                prom = sumas / 4;// se dividen en 4 porque son 4 estaciones 
            }
            System.out.println("Temperatura en el mes" + " " + (i+1) + " " + prom);
        }
    }
    //Mayores al promedio

    public int[] temperatura() {
        int[] temp = new int[12];
        for (int i = 0; i < estaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < estaciones[i].length; j++) {
               suma += estaciones[i][j];
           }
            temp[i] = suma;
        }
        return temp;
    }
}
