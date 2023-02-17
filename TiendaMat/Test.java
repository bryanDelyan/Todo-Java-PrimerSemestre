/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaMat;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        Tienda t = new Tienda ();
        t.llenar();
        System.out.println("Dia lunes     : "+t.trabajadoresDias(0));
        System.out.println("Dia Martes    : "+t.trabajadoresDias(1));
        System.out.println("Dia mirtcoles : "+t.trabajadoresDias(2));
        System.out.println("Dia jueves    : "+t.trabajadoresDias(3));
        System.out.println("Dia viernes   : "+t.trabajadoresDias(4));
        System.out.println("Dia sabado    : "+t.trabajadoresDias(5));
        System.out.println("Dia Domingo   : "+t.trabajadoresDias(6));
        t.mayorAsistencia();
        t.menorAsistencia();
        System.out.println("La cantidad de trabajaodres el día Sabado y Domingo es: "+t.asistenciaSabadoDomingo());
    }
}
