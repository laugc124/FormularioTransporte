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
public class Tiquete {
    private boolean IdayRegreso;
    private String fecha_salida;
    private String fecha_regreso;
    private String hora;
    private int numero_adultos;
    private int numero_ninos;
    private int numero_tiquete;
    private String origen;
    private String destino;
    private int valortrayecto;
    private String hora_regreso;

    public Tiquete(boolean IdayRegreso, String fecha_salida, String fecha_regreso, String hora, int numero_adultos, int numero_ninos, int numero_tiquete, String origen, String destino, int valortrayecto, String hora_regreso) {
        this.IdayRegreso = IdayRegreso;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.hora = hora;
        this.numero_adultos = numero_adultos;
        this.numero_ninos = numero_ninos;
        this.numero_tiquete = numero_tiquete;
        this.origen = origen;
        this.destino = destino;
        this.valortrayecto = valortrayecto;
        this.hora_regreso = hora_regreso;
    }

   

    
    
    
    /**
     * @return the IdayRegreso
     */
    public boolean isIdayRegreso() {
        return IdayRegreso;
    }

    /**
     * @param IdayRegreso the IdayRegreso to set
     */
    public void setIdayRegreso(boolean IdayRegreso) {
        this.IdayRegreso = IdayRegreso;
    }

    /**
     * @return the fecha_salida
     */
    public String getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the fecha_regreso
     */
    public String getFecha_regreso() {
        return fecha_regreso;
    }

    /**
     * @param fecha_regreso the fecha_regreso to set
     */
    public void setFecha_regreso(String fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the numero_adultos
     */
    public int getNumero_adultos() {
        return numero_adultos;
    }

    /**
     * @param numero_adultos the numero_adultos to set
     */
    public void setNumero_adultos(int numero_adultos) {
        this.numero_adultos = numero_adultos;
    }

    /**
     * @return the numero_ninos
     */
    public int getNumero_ninos() {
        return numero_ninos;
    }

    /**
     * @param numero_ninos the numero_ninos to set
     */
    public void setNumero_ninos(int numero_ninos) {
        this.numero_ninos = numero_ninos;
    }

    /**
     * @return the numero_tiquete
     */
    public int getNumero_tiquete() {
        return numero_tiquete;
    }

    /**
     * @param numero_tiquete the numero_tiquete to set
     */
    public void setNumero_tiquete(int numero_tiquete) {
        this.numero_tiquete = numero_tiquete;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the valortrayecto
     */
    public int getValortrayecto() {
        return valortrayecto;
    }

    /**
     * @param valortrayecto the valortrayecto to set
     */
    public void setValortrayecto(int valortrayecto) {
        this.valortrayecto = valortrayecto;
    }

    /**
     * @return the hora_regreso
     */
    public String getHora_regreso() {
        return hora_regreso;
    }

    /**
     * @param hora_regreso the hora_regreso to set
     */
    public void setHora_regreso(String hora_regreso) {
        this.hora_regreso = hora_regreso;
    }
    
}
