/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {

        var leonardo = new Actor(1974, 5, "Estados Unidos",
                "Leonardo DiCaprio");
        var joaquin = new Actor(1946, 6, "Mexico",
                "Joaquín Cosío");
        var padrino1 = new Actor(1940, 8, "Nueva York",
                "Alfredo James Pacino");

        var lobo = new Pelicula("Lobo de Wall Street", 2013, "Ingles",
                "C", 3);
        var infierno = new Pelicula("El infierno", 2010, "Español",
                "C", 2.50);
        var padrino = new Pelicula("El padrino", 1972, "Italiano",
                "C", 3.5);

        var jordan = new Personaje("Jordan Belfort", "Protagonista",
                leonardo, lobo);
        var cochiloco = new Personaje("Cochiloco", "Protagonista",
                joaquin, infierno);
        var michael = new Personaje("Michael Corleone", "Protagonista",
                padrino1, padrino);

        System.out.println(cochiloco.mostrarInfo());
        System.out.println(joaquin.mostrarInfo());
        System.out.println(infierno.mostrarInfo());
        System.out.println("");
        
        System.out.println(jordan.mostrarInfo());
        System.out.println(leonardo.mostrarInfo());
        System.out.println(lobo.mostrarInfo());
        System.out.println("");
        
        System.out.println(michael.mostrarInfo());
        System.out.println(padrino1.mostrarInfo());
        System.out.println(padrino.mostrarInfo());
        System.out.println("");
    }

}
