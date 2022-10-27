/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Personaje extends Mostrar {

    private String nombrePersonaje;
    private String rol;
    private Actor interprete;
    private Pelicula film;

    public Personaje(String nP, String r, Actor i, Pelicula f) {

        this.nombrePersonaje = nP;
        this.rol = r;
        this.interprete = i;
        this.film = f;

    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Actor getInterprete() {
        return interprete;
    }

    public void setInterprete(Actor interprete) {
        this.interprete = interprete;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    @Override
    public String mostrarInfo() {
        return "El personaje del " + this.getNombrePersonaje()
                + " participa en la pelicula de nombre " + this.getFilm().getPelicula()
                + " y el actor que le da vida al personaje es " + this.getInterprete().getNombre();
    }

}
