/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Elecciones {

    String[] candidatos = new String[4];
    int[] votos = new int[4];

    public void pedirCandidatos() { //Este metodo pide los datos de los candidatos como el nombre y los votos obtenidos
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < candidatos.length; i++) {
                System.out.println("Ingrese los nombres de los candidatos");
                candidatos[i] = s.next();
                System.out.println("Ingrese los votos de los candidatos");
                votos[i] = s.nextInt();
            }
        }

    }
    public String calcularPorcentaje(){
    double suma = calcularSuma();
    double porcentaje=0, porcentaje1=0, porcentaje2=0, porcentaje3=0;
    for(int i=0; i< candidatos.length; i++){
        porcentaje =  (votos[0]*100)/suma;
        porcentaje1 = (votos[1]*100)/suma;
        porcentaje2 = (votos[2]*100)/suma;
        porcentaje3 = (votos[3]*100)/suma;
        
    }
    return "Candidato 1 :"+porcentaje + "% " + "Candidato 2 :"+porcentaje1+ "% " +"Candidato 3 :"+ porcentaje2+ "% " +"Candidato 4 :"+ porcentaje3+ "%";
}

    public int calcularSuma() { //Este método calcula la suma total de todos los votos
        int suma = 0;
        for (int i = 0; i < votos.length; i++) {
            suma += votos[i];
        }
        return suma;
    }

    public int calcularMitadDelPorcentajeTotal() { //Este metodo calcula el 50 % del total de los votos
        int sumar = calcularSuma();
        return (sumar * 50) / 100;

    }

    public String mayorVotos() { //Este método calcula quien es el candidato con mayor votos
        int voto = votos[0];
        String name = candidatos[0];
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > voto) {
                voto = votos[i] ;
                name = candidatos[i];
            }
        }
        return name + " " + voto;
    }

    public void candidatoGanador() { //Si algún candidato recibe más del 50 % de los votos gana, si no, se eligen a los dos candidatos con más votos para otra ronda
        int mitadVotos = calcularMitadDelPorcentajeTotal();
        String nombre = candidatos[0];
        for (int i = 0; i < votos.length;) {
            if (votos[i] > mitadVotos) {
                nombre = candidatos[i];
                mitadVotos = votos[i];
                System.out.println("El ganador es : " + nombre + " " + " con " + votos[i]);
            } else 
                System.out.println("Los candidatos con más votos fueron y pasaran a segunda ronda : " + candidatos[0] + " " + votos[0] + " " + " y " + candidatos[1] + " " + votos[1]);
                break;
        }

    }
}
