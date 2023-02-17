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
public class Sucursal {
    private String code;
    private String nombre;
    private String direccion;
    private String telefono;
    private int totalVentas;

    public Sucursal(String code, String nombre, String direccion, String telefono, int totalVentas) {
        this.code = code;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.totalVentas = totalVentas;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the totalVentas
     */
    public int getTotalVentas() {
        return totalVentas;
    }

    /**
     * @param totalVentas the totalVentas to set
     */
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }
}
