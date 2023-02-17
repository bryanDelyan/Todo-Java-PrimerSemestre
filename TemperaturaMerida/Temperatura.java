/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperaturaMerida;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Temperatura {
                       // 12 meses y 4 estaciones
    int[][] estaciones = new int[12][4];

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
        double suma = 0.0;
        for (int i = 0; i < estaciones.length; i++) { //Cantidad de filas
            for (int j = 0; j < estaciones[i].length; j++) {
                suma += estaciones[i][j];

            }
        }
        return suma / (estaciones.length * estaciones[0].length);

    }

    public int sumaFila(int f) {
        int suma = 0;
        for (int i = 0; i < estaciones[f].length; i++) {
            suma += estaciones[i][f];
        }
        return suma;
    }

    public double promedioEstacion1() { //PROMEDIO DE ESTACIONES 2
        double estacion2 = sumaFila(1);
        return estacion2 / 4;
    }

    public double promedioEstacion2() { //PROMEDIO DE ESTACIONES 4, se divide entre 4 porque son 4 columnas
        double estacion4 = sumaFila(3);
        return estacion4 / 4;
    }

    public int[] temperatura() {
        int[] temperatura = new int[12];
        for (int i = 0; i < estaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < estaciones[i].length; j++) {
                suma += estaciones[i][j];
            }
            temperatura[i] = suma;
        }
        return temperatura;
    }

    public void mayorMes() {
        int[] temp = temperatura();
        double mes = 0;
        int mayor = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > mayor) {
                mayor = temp[i];
                mes = i;
            }
        } // mes 1 es enero y así sucesivamente                                                                       //Entre 4.0 para que de más exacto, porque son el total de columnas 
        System.out.println("El mes con mayor temperatura en el año 2011 es : " + (mes+1) + " con una temperatura igual a: " + mayor / 4.0 + "°C");
    }
}
