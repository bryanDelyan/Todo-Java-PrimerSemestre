/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EEps;

/**
 *
 * @author Usuario
 */
public class Eps {

    Personas[] person = new Personas[5];

    public void llenar() {
        person[0] = new Personas("Juan", "Hernandez", "1232", 3, 0); //0 es masculino y 1 es femenino
        person[1] = new Personas("Maria", "García", "1246", 2, 1);
        person[2] = new Personas("Gabriela", "Rodríguez", "1532", 1, 1);
        person[3] = new Personas("Lorena", "López", "1022", 1, 1);
        person[4] = new Personas("Daniel", "Sánchez", "1382", 4, 0);

    }

    public void imprimir() {
        for (Personas persona : person) { // Es lo mismo que el for normal 
            System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        }
    }

    public void mostrarInformacion(String cedu) {
        String nombre = person[0].getNombre();
        String apellido = person[0].getApellido();
        for (Personas persona : person) {
            if (persona.getCedula().equals(cedu)) {
                nombre = persona.getNombre();
                apellido = persona.getApellido();
                System.out.println("La cedula a buscar le pertenece a : " + nombre + " " + apellido);
            }
        }
    }

    public int estratoMujeres(int estrato) { // Calcula cuantas personas son femenino y que tengan el mismo estraro
        int cantidadF = 0;
        for (Personas person : person) {
            if (person.getSexo() == 1 && person.getEstrato() == estrato) {
                cantidadF++;
            }
        }
        return cantidadF;
    }
}
