/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto14;

/**
 *
 * @author Usuario
 */
public class Notas {

    int[] notas = new int[5];
    String[] nombres = {"María", "Juan", "Jose"};

    public void agregarNotas() {
        notas[0] = 3;
        notas[1] = 4;
        notas[2] = 2;
        notas[3] = 1;
        notas[4] = 5;
    }

    public void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota("+(i+1)+"): "+ notas[i]);
        }
    }

    public double promedio() {
        double suma = 0.0;
        for (int indice = 0; indice < notas.length; indice++) {
            suma += notas[indice];

        }
       double promedio =suma/notas.length;
        return promedio;
    }

    public String calidadPromedio() {
        double promedio = promedio();
        if (promedio < 3) {
            return "Regular";
        } else if (promedio >= 3 && promedio <4) {

            return "Bueno";
        } else 
            return "Excelente";
        
    }

    public int menorNota() {
        int menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }

        }
        return menor;
    }

    public int mayorNota() {
        int mayor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }
    //contar cuantas notas estan por debajo del promedio
    public int cantidadMenoresPromedio() {
        int contador = 0;
        double prom = promedio();
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < prom )
                contador++;
        }
        return contador;
    }
}
