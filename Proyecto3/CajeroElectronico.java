/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

/**
 *
 * @author Usuario
 */
public class CajeroElectronico {
    public void calcularBilletes (int valorRetirar){
        int cantidadBilletesCincuenta = valorRetirar/50000;
        int cantidadBilletesVeinte = (valorRetirar % 50000)/20000;
        int cantidadBilletesDiez = (valorRetirar%50000)%20000/10000;
        System.out.println("cantidad de Billetes de Cincuenta = " + cantidadBilletesCincuenta);
        System.out.println("cantidad de Billetes de Veinte = " + cantidadBilletesVeinte);
        System.out.println("cantidad de Billetes de Diez = " + cantidadBilletesDiez);
    }
}
