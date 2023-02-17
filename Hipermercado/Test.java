/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hipermercado;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Sucursales s = new Sucursales();
        s.llenar();
        s.imprimir();
        s.buscarSucursal();
        System.out.println(s.sucursalMenorVenta()+"$");
        System.out.println("");
        s.modificarSucursal("1", "Nueva direccion 1");
        s.imprimir();
        System.out.println( s.sucursalMayorVenta()+"$");
        System.out.println("");
        System.out.println("Las ventas totales de todas las sucursales fueron: "+s.ventasTotal()+"$");
        System.out.println("");
        System.out.println("El promedio de ventas en el año fueron: "+s.promedio()+"$");
    }
}
