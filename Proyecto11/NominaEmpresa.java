/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto11;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NominaEmpresa {
    public void actualizarSueldoEmpleado(){
        
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite el número de empleados" );
    int n = scanner.nextInt(); //cantidad de empleado
    double nomina = 0;
    for(int i=0; i < n; i++){
        System.out.println("Digite el sueldo del empleado");
        double sueldo = scanner.nextDouble();
        System.out.println("Digite el nombre del empleado");
        String nombre = scanner.next();
        if (sueldo <800000){
            sueldo *= 1.10;
        }
        else
            sueldo *= 1.07;
        System.out.println("nombre = " + nombre);
        System.out.println("Nuevo sueldo = "+sueldo);  
        nomina +=sueldo;
        System.out.println("Nomina = " + nomina);
    }
    }
    
    }
}
