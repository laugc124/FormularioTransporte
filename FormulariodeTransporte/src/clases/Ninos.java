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
public class Ninos extends Pasajeros{
    private String Numero_pasaje;

    public Ninos(String Numero_pasaje, String Nombre, String Apellido, String Tipo_documento, String Id, String Sexo) {
        super(Nombre, Apellido, Tipo_documento, Id, Sexo);
        this.Numero_pasaje = Numero_pasaje;
    }
       
    


    /**
     * @return the Numero_pasaje
     */
    public String getNumero_pasaje() {
        return Numero_pasaje;
    }

    /**
     * @param Numero_pasaje the Numero_pasaje to set
     */
    public void setNumero_pasaje(String Numero_pasaje) {
        this.Numero_pasaje = Numero_pasaje;
    }
    
}


