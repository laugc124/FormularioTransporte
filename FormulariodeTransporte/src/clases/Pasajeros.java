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
public class Pasajeros {
    private String Nombre;
    private String Apellido;
    private String Tipo_documento;
    private String Id;
    private String Sexo;

    public Pasajeros(String Nombre, String Apellido, String Tipo_documento, String Id, String Sexo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Tipo_documento = Tipo_documento;
        this.Id = Id;
        this.Sexo = Sexo;
    }
    
    

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Tipo_documento
     */
    public String getTipo_documento() {
        return Tipo_documento;
    }

    /**
     * @param Tipo_documento the Tipo_documento to set
     */
    public void setTipo_documento(String Tipo_documento) {
        this.Tipo_documento = Tipo_documento;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
}
