/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author Juano
 */
public class Mascota extends Mostrar{

    private String nombreMascota;
    private Dueño propietario;
    private String raza;
    private String sexo;

    public Mascota(String nombreMascota, Dueño propietario, String raza, String sexo) {
        this.nombreMascota = nombreMascota;
        this.propietario = propietario;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Dueño getPropietario() {
        return propietario;
    }

    public void setPropietario(Dueño propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String mostrarInfo() {
    return "El nombre de la mascota es "+this.getNombreMascota()+", su dueño es "+
            this.getPropietario().getNombreDueño()+", la raza del perro es "
            +this.getRaza()+", y su genero es "+this.getSexo();
    }
    
    

}
