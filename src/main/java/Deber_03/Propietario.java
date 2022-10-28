/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Propietario extends Mostrar {
    private String nombre;
    private String cedula;
    private int edad;
    private String direccion;

    public Propietario(String nombre, String cedula, int edad, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Override
    public String mostrarInfo() {
    return "los datos del propietario son: numero de cedula "+this.getCedula()+
            ", su edad es "+this.getEdad()+" años, la direccion de su domicilio es "
            +this.getDireccion();    
    }
    
}
