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
public class Sucursales { //Profe se me olvido ponerle Hipermecado a eso 

    private Sucursal[] sucursal = new Sucursal[5];

    public void llenar() {
        sucursal[0] = new Sucursal("1", "Nombre 1", "Dirección 1", "320291", 1000000);
        sucursal[1] = new Sucursal("2", "Nombre 2", "Dirección 2", "320292", 1500000);
        sucursal[2] = new Sucursal("3", "Nombre 3", "Dirección 3", "320293", 3000000);
        sucursal[3] = new Sucursal("4", "Nombre 3", "Dirección 4", "320294", 2000000);
        sucursal[4] = new Sucursal("5", "Nombre 5", "Dirección 5", "320295", 3500000);
    }

    public void imprimir() {
        for (Sucursal sucursal : sucursal) {
            System.out.println("Las sucursales son: " + sucursal.getNombre() + " y su dirección es :" + sucursal.getDireccion());
            System.out.println("");
        }
    }

    public void buscarSucursal() { //Buscamos la sucursal que colocamos en el test
        for (Sucursal sucursal : sucursal) {
            if (sucursal.getCode().equals("2")) {
                System.out.println("La sucursal con ese código es: " + sucursal.getNombre() + " y el codigo secreto es:" + sucursal.getCode());
                System.out.println("");
            }   
        }
    }

    public String sucursalMenorVenta() {
        int menor = sucursal[0].getTotalVentas();
        String name = sucursal[0].getNombre();
        for (Sucursal sucursal : sucursal) {
            if (sucursal.getTotalVentas() < menor) {
                menor = sucursal.getTotalVentas();
                name = sucursal.getNombre();
            }
        }
        return "La sucursal con menor ventas es : " + name + " con ventas final =  " + menor;
    }

    public void modificarSucursal(String codigo, String direccionCambiar) { // Modificamos la dirección con el código único
        for (Sucursal sucursal : sucursal) {
            if (sucursal.getCode().equals(codigo)) {
                sucursal.setDireccion(direccionCambiar);
            }
        }
    }

    public String sucursalMayorVenta() {
        int mayor = sucursal[0].getTotalVentas();
        String name = sucursal[0].getNombre();
        for (Sucursal sucursal : sucursal) {
            if (sucursal.getTotalVentas() > mayor) {
                mayor = sucursal.getTotalVentas();
                name = sucursal.getNombre();
            }
        }
        return "La sucursal con mayor ventas es : " + name + " con ventas final =  " + mayor;
    }

    public int ventasTotal() {
        int suma = 0;
        for (Sucursal sucursal1 : sucursal) {
            suma += sucursal1.getTotalVentas();
        }
        return suma;
    }

    public double promedio() {
        double suma = 0;
        for (Sucursal sucursal1 : sucursal) {
            suma += sucursal1.getTotalVentas();
        }
        return suma/sucursal.length;
    }

}
