/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Pelicula extends Mostrar {

    private String pelicula;
    private int yearLanzamiento;
    private String idioma;
    private String clasificacion;
    private double duracion;

    public Pelicula(String p, int yL, String i, String c, double d) {
        this.pelicula = p;
        this.yearLanzamiento = yL;
        this.idioma = i;
        this.clasificacion = c;
        this.duracion = d;

    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getYearLanzamiento() {
        return yearLanzamiento;
    }

    public void setYearLanzamiento(int yearLanzamiento) {
        this.yearLanzamiento = yearLanzamiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String mostrarInfo() {
        return "Esta pelicula se estreno en el año " + this.getYearLanzamiento()
                + ", el idioma en la que viene es " + this.getIdioma()
                + ", su clasificacion es: " + this.getClasificacion()
                + " y su duracion es " + this.duracion + " horas.";

    }

}
