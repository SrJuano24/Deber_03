/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Actor extends Mostrar {

    private int fechaNacimiento;
    private int nominaciones;
    private String lugarNacimiento;
    private String nombre;

    public Actor(int fC, int n, String lG, String no) {
        this.fechaNacimiento = fC;
        this.nominaciones = n;
        this.lugarNacimiento = lG;
        this.nombre = no;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(int nominaciones) {
        this.nominaciones = nominaciones;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String mostrarInfo() {
        return "quien nació en "
                + this.getLugarNacimiento() + " en la fecha de " + this.getFechaNacimiento()
                + " y tiene " + this.getNominaciones() + " nominaciones a un premio Oscar";
    }

}
