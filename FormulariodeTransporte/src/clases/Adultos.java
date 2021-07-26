/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author agos1
 */
public class Adultos extends Pasajeros{
    private String nombre_contacto;
    private String Contacto_emergencia;
    private String correo;
    private String numero_pasaje;

    public Adultos(String nombre_contacto, String Contacto_emergencia, String correo, String numero_pasaje, String Nombre, String Apellido, String Tipo_documento, String Id, String Sexo) {
        super(Nombre, Apellido, Tipo_documento, Id, Sexo);
        this.nombre_contacto = nombre_contacto;
        this.Contacto_emergencia = Contacto_emergencia;
        this.correo = correo;
        this.numero_pasaje = numero_pasaje;
    }

    
    

    
    
    /**
     * @return the Contacto_emergencia
     */
    public String getContacto_emergencia() {
        return Contacto_emergencia;
    }

    /**
     * @param Contacto_emergencia the Contacto_emergencia to set
     */
    public void setContacto_emergencia(String Contacto_emergencia) {
        this.Contacto_emergencia = Contacto_emergencia;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the nombre_contacto
     */
    public String getNombre_contacto() {
        return nombre_contacto;
    }

    /**
     * @param nombre_contacto the nombre_contacto to set
     */
    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    /**
     * @return the numero_pasaje
     */
    public String getNumero_pasaje() {
        return numero_pasaje;
    }

    /**
     * @param numero_pasaje the numero_pasaje to set
     */
    public void setNumero_pasaje(String numero_pasaje) {
        this.numero_pasaje = numero_pasaje;
    }
    
}
