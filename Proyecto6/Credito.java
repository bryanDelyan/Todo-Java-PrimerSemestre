/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto6;

/**
 *
 * @author Usuario
 */
public class Credito {

    public boolean calcular(int montoCredito, int ingresos, int cantidadAhorrada, int gastosMensuales, boolean fincaRaiz, boolean auto, boolean coodeudor) {
        boolean aprobado = false;
        //Primer caso de aprobación de Crédito
        double monto = (montoCredito * 30) / 100; //Calcular el porcentaje de lo que va a prestar 
        boolean montoAhorrado = cantidadAhorrada == monto; // Calcular si lo que tiene ahorrado es igual al 30% de lo que pide
        double gastoSalario = (ingresos - gastosMensuales); //Saber cuanto le sobra
        double porcentajeGasto = (gastoSalario * 2) / 100; // Calcular el porcentaje de lo que sobro
        double porcentajeCredito = (montoCredito * 2) / 100; // Calcular el 2% del crédito
        boolean respalda1 = porcentajeGasto >= porcentajeCredito;

        if ((montoAhorrado && fincaRaiz && auto && coodeudor) || respalda1) {
            aprobado = true;
            if (aprobado) {
                System.out.print("Fue aprobado " );
            } else {
                 System.out.print("No fue aprobado " );
            }
        }
        //Segundo caso
        double salario5Porcentaje = (ingresos * 5) / 100;
        double porcentaje5Credito = (montoCredito * 5) / 100;
        boolean respalda2 = salario5Porcentaje >= porcentaje5Credito;
        if (fincaRaiz && respalda2) {
            aprobado = true;
            if (aprobado) {
                 System.out.print("Fue aprobado " );
            } else {
                System.out.print("No fue aprobado " );
            }
        }

        //Tercer caso
        double tieneAhorradoLaMitad = (cantidadAhorrada * 50) / 100;
        double porcentaje50Credito = (montoCredito * 50) / 100;
        boolean respalda3 = tieneAhorradoLaMitad == porcentaje50Credito;
        if ((fincaRaiz || coodeudor) && respalda3) {
            aprobado = true;
            if (aprobado) {
               System.out.print("Fue aprobado " );
            } else {
                System.out.print("No fue aprobado " );
            }

        }
        return aprobado;
    }
}
