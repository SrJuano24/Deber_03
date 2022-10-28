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

        var tri = new Equipo("Federacion Ecuatoriana de Futbol", "Gustavo Alfaro", 1925);
        var argentina = new Equipo("Asociación del Fútbol Argentino", "Lionel Scaloni", 1893);
        var cuba = new Equipo("Asociación de Fútbol de Cuba", "Julio Valero Mederos", 1924);

        var ecuador = new Pais("ECU", "Ecuador", 0, "Conmebol", tri);
        var eargentina = new Pais("AFA", "Argentina", 21, "Conmebol", argentina);
        var ecuba = new Pais("FMC", "Cuba", 12, "Concacaf", cuba);

        var plata = new Jugador("Gonzalo Plata", 2000, "Delantero", tri);
        var messi = new Jugador("Lionel Messi", 1987, "Delantero", argentina);
        var paradela = new Jugador("Luis Paradela", 1997, "Delantero", cuba);

        System.out.println(plata.mostrarInfo());
        System.out.println(tri.mostrarInfo());
        System.out.println(ecuador.mostrarInfo());
        System.out.println("");

        System.out.println(messi.mostrarInfo());
        System.out.println(eargentina.mostrarInfo());
        System.out.println(argentina.mostrarInfo());
        System.out.println("");

        System.out.println(paradela.mostrarInfo());
        System.out.println(ecuba.mostrarInfo());
        System.out.println(cuba.mostrarInfo());
        System.out.println("");

        var maria = new Propietario("Maria Gonzales", "0103493094", 22, "Calle Sucre");
        var josue = new Propietario("Josue Martinez", "0346789605", 20, "Calle Pio Bravo");
        var pedro = new Propietario("Pedro Ordoñes", "0134512790", 33, "Calle Manuel Vega Muñoz");

        var mustang = new Auto("Chevrolet", "Mustang Mach 1", "GCG031", "negro", 2018, "gasolina", 23000);
        var ford = new Auto("Ford", "Explorer 4x4", "AXO201", "azul", 2019, "diesel", 30000);
        var yaris = new Auto("Toyota", "Yaris Nitro", "BCF059", "gris", 2013, "gasolina", 15000);

        var Mmustang = new Matricula("Centro de matriculacion Gualaceo", maria, mustang, 2025);
        var Mford = new Matricula("Centro Capulispamba", josue, ford, 2027);
        var Myaris = new Matricula("Centro de matriculacion Bolivar", pedro, yaris, 2023);

        System.out.println(Mmustang.mostrarInfo());
        System.out.println(mustang.mostrarInfo());
        System.out.println(maria.mostrarInfo());
        System.out.println("");
        
        System.out.println(Mford.mostrarInfo());
        System.out.println(ford.mostrarInfo());
        System.out.println(josue.mostrarInfo());
        System.out.println("");
        
        System.out.println(Myaris.mostrarInfo());
        System.out.println(yaris.mostrarInfo());
        System.out.println(pedro.mostrarInfo());
        System.out.println("");
    }
}
