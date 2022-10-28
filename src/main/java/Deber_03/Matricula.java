/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Matricula extends Mostrar {

    private String centroMatriculacion;
    private Propietario poseedor;
    private Auto vehiculo;
    private int yearCaducidad;

    public Matricula(String centroMatriculacion, Propietario poseedor, Auto vehiculo, int yearCaducidad) {
        this.centroMatriculacion = centroMatriculacion;
        this.poseedor = poseedor;
        this.vehiculo = vehiculo;
        this.yearCaducidad = yearCaducidad;
    }

    public String getCentroMatriculacion() {
        return centroMatriculacion;
    }

    public void setCentroMatriculacion(String centroMatriculacion) {
        this.centroMatriculacion = centroMatriculacion;
    }

    public Propietario getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(Propietario poseedor) {
        this.poseedor = poseedor;
    }

    public Auto getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Auto vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getYearCaducidad() {
        return yearCaducidad;
    }

    public void setYearCaducidad(int yearCaducidad) {
        this.yearCaducidad = yearCaducidad;
    }

    @Override
    public String mostrarInfo() {
        return "La matricula del auto modelo " + this.getVehiculo().getModelo()
                + ", que pertenece a " + this.getPoseedor().getNombre()
                + ", fue matriculado en el "
                + this.getCentroMatriculacion() + " y cuya matricula se tendra que renovar en "
                + this.getYearCaducidad();

    }

}
