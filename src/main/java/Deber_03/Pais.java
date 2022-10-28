/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Pais extends Mostrar {
    private String codigoFifa;
    private String nombrePais;
    private int copas;
    private String confederacion;
    private Equipo seleccion;

    public Pais(String codigoFifa, String nombrePais, int copas, String confederacion, Equipo seleccion) {
        this.codigoFifa = codigoFifa;
        this.nombrePais = nombrePais;
        this.copas = copas;
        this.confederacion = confederacion;
        this.seleccion = seleccion;
    }

    
    public String getCodigoFifa() {
        return codigoFifa;
    }

    public void setCodigoFifa(String codigoFifa) {
        this.codigoFifa = codigoFifa;
    }


    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public Equipo getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Equipo seleccion) {
        this.seleccion = seleccion;
    }

    @Override
    public String mostrarInfo() {
    return "el pais al que pertenece el equipo es "+this.getNombrePais()+
            ", su codigo FIFA es "+this.getCodigoFifa()+
            ", participa en  la confederacion "+this.getConfederacion()+
            " y actualmente porta "+this.getCopas()+" copas ganadas";    
    }
    
    
    
}
