/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Jugador extends Mostrar {

    String nombre;
    int fechaNacimiento;
    String posicion;
    private Equipo plantilla;

    public Jugador(String nombre, int fechaNacimiento, String posicion, Equipo plantilla) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.plantilla = plantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Equipo plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String mostrarInfo() {
        return "El jugador " + this.getNombre() + ", nacion en el año " + this.getFechaNacimiento()
                + ", juega en el equipo " + this.getPlantilla().getNombre()
                + ", ocupando la posicion de " + this.getPosicion();
    }

}
