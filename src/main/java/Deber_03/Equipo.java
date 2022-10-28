/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Equipo extends Mostrar {

    private String nombre;
    private String entrenador;
    private int yearFundacion;

    public Equipo(String nombre, String entrenador, int yearFundacion) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.yearFundacion = yearFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(int yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    @Override
    public String mostrarInfo() {
        return "este equipo se fundo en el año " + this.getYearFundacion()
                + " y su entrenador actual es " + this.getEntrenador();
    }

}
