/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author Juano
 */
public class Atencion extends Mostrar {

    private String direccionLocal;
    private String nombreLocal;
    private int costo;
    private Mascota numeroMascota;

    public Atencion(String direccionLocal, String nombreLocal, int costo, Mascota numeroMascota) {
        this.direccionLocal = direccionLocal;
        this.nombreLocal = nombreLocal;
        this.costo = costo;
        this.numeroMascota = numeroMascota;
    }

    public String getDireccionLocal() {
        return direccionLocal;
    }

    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Mascota getNumeroMascota() {
        return numeroMascota;
    }

    public void setNumeroMascota(Mascota numeroMascota) {
        this.numeroMascota = numeroMascota;
    }

    @Override
    public String mostrarInfo() {
    return "El nombre del local en el que se atiende la mascota se llama "
            +this.getNombreLocal()+", la direccion del local es calle "
            +this.getDireccionLocal()+", el costo de atencion es "+this.getCosto()
            +" dolares.";
    }
    
    

}
