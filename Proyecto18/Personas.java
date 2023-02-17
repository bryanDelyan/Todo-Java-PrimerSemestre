/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto18;

//import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Personas {

    Persona[] personas = new Persona[5];

    public void llenar() {
        //Scanner s = new Scanner(System.in);
        //for(int i = 0 ;i < personas.length;i++){
        // System.out.println("Digite un nombre");
        // String nombre = s.next();
        //System.out.println("Digite un Apellido");
        //String apellido = s.next();
        // System.out.println("Digite telefono");
        //String telefono = s.next();
        //System.out.println("Digite edad");
        //int edad = s.nextInt();
        personas[0] = new Persona("Maria", "Perez", "233323", 20);
        personas[1] = new Persona("Jose", "Mendez", "28288", 25);
        personas[2] = new Persona("Antonio", "Lopez", "328288", 23);
        personas[3] = new Persona("Pedro", "Diaz", "78288", 17);
        personas[4] = new Persona("Carmen", "Guitierrez", "48288", 25);
    }

    public void imprimir() {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Apellido: " + personas[i].getApellido());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println("Número de telefono: " + personas[i].getTelefono());
        }
    }

    public double promedioEdad() {
        double suma = 0.0;
        for (int i = 0; i < personas.length; i++) {
            suma += personas[i].getEdad();
        }
        return suma / personas.length;
    }

    public int menorPromedio() {
        double promedio = promedioEdad();
        int cantidad = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() < promedio) {
                cantidad++;
                System.out.println("Nombres : " + personas[i].getNombre());

            }
        }
        return cantidad;
    }

    //Cuantas personas son mayores de edad 
    public int mayorEdad() {
        int count = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() > 17) {
                count++;
            }
        }
        return count;
    }

    //Cuantas personas son menores de edad
    public int menorEdad() {
        int contador = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() <= 17) {
                contador++;
            }
        }
        return contador;
    }
    //Buscar una persona y modificar nombre

    public void buscarPersona(String nombreBuscar, String apellidoCambiar, int edadCambiar) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombreBuscar)) {
                personas[i].setApellido(apellidoCambiar);
                personas[i].setEdad(edadCambiar);
            }
        }
    }

    //Método que busca las personas por nombre y  apellido y modifique el número de telefono
    public void buscarPersonaA(String nombreBuscar, String apellidoCambiar, String numeroCambiar) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombreBuscar) && personas[i].getApellido().equals(apellidoCambiar)) {
                personas[i].setTelefono(numeroCambiar);
            }
        }
    }
}
