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
public class Personas {
     private String nombre;
    private String apellido;
    private String cedula;
    private int estrato;
    private int sexo; //0 es masculino y 1 es femenino

    public Personas(String nombre, String apellido, String cedula, int estrato, int sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.estrato = estrato;
        this.sexo = sexo;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the estrato
     */
    public int getEstrato() {
        return estrato;
    }

    /**
     * @param estrato the estrato to set
     */
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    /**
     * @return the sexo
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
}
