/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author Juano
 */
public class Dueño extends Mostrar {
    private String nombreDueño;
    private int yearNacimiento;
    private String numCedula;

    public Dueño(String nombreDueño, int yearNacimiento, String numCedula) {
        this.nombreDueño = nombreDueño;
        this.yearNacimiento = yearNacimiento;
        this.numCedula = numCedula;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    @Override
    public String mostrarInfo() {
    return "Su propietario nacio en el año "+this.getYearNacimiento()
            +", y su numero de cedula es "+this.getNumCedula();
    }
    
    
    
    
    
}
