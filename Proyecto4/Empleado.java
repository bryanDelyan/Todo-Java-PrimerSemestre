/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto4;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Empleado {

    public double calcularSueldoNeto(int horas) {
        double horasExtras = horas - 160;
        double pagoHora = 160 * 10000;
        double pagoExtra = horasExtras * 15000;
        double sueldo = pagoHora + pagoExtra;

        double retencion = sueldo - 800000;
        double retencion1 = (800000 * 12) / 100;
        double retencion2 = ((retencion - 800000) * 18) / 100;
        double totalRetencion = retencion1 + retencion2;
        double sueldoNeto = sueldo - totalRetencion;

        return sueldoNeto;
    }
}
