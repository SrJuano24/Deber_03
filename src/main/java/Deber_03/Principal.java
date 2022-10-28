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
        var johnny = new Actor(1963, 12, "Estados Unidos",
                "Johnny Depp");
        var malcom = new Actor(1943, 10, "Reino Unido",
                "Malcolm McDowell");
        var robert = new Actor(1965, 20, "Estados Unidos",
                "Robert Downey Jr");

        var lobo = new Pelicula("Lobo de Wall Street", 2013, "Ingles",
                "C", 3);
        var infierno = new Pelicula("El infierno", 2010, "Español",
                "C", 2.50);
        var padrino = new Pelicula("El padrino", 1972, "Italiano",
                "C", 3.5);
        var pirata = new Pelicula("Piratas del Caribe", 2003, "Ingles",
                "B", 2.30);
        var naranja = new Pelicula("La naranja mecanica", 1972, "Ingles",
                "B", 2);
        var iron = new Pelicula("Iron Man", 2008, "Ingles",
                "A", 3.20);

        var jordan = new Personaje("Jordan Belfort", "Protagonista",
                leonardo, lobo);
        var cochiloco = new Personaje("Cochiloco", "Protagonista",
                joaquin, infierno);
        var michael = new Personaje("Michael Corleone", "Protagonista",
                padrino1, padrino);
        var jack = new Personaje("Jack Sparrow", "Antagonista",
                johnny, pirata);
        var alex = new Personaje("Alex DeLarge", "Protagonista",
                malcom, naranja);
        var tony = new Personaje("Tony Strak", "Protagonista",
                robert, iron);

        System.out.println("///PELICULA///");
        System.out.println("");
        System.out.println("Caso 1");
        System.out.println(cochiloco.mostrarInfo());
        System.out.println(joaquin.mostrarInfo());
        System.out.println(infierno.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 2");
        System.out.println(jordan.mostrarInfo());
        System.out.println(leonardo.mostrarInfo());
        System.out.println(lobo.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 3");
        System.out.println(michael.mostrarInfo());
        System.out.println(padrino1.mostrarInfo());
        System.out.println(padrino.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 4");
        System.out.println(jack.mostrarInfo());
        System.out.println(johnny.mostrarInfo());
        System.out.println(pirata.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 5");
        System.out.println(alex.mostrarInfo());
        System.out.println(malcom.mostrarInfo());
        System.out.println(naranja.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 6");
        System.out.println(tony.mostrarInfo());
        System.out.println(robert.mostrarInfo());
        System.out.println(iron.mostrarInfo());
        System.out.println("");

        var tri = new Equipo("Federacion Ecuatoriana de Futbol", "Gustavo Alfaro", 1925);
        var argentina = new Equipo("Asociación del Fútbol Argentino", "Lionel Scaloni", 1893);
        var cuba = new Equipo("Asociación de Fútbol de Cuba", "Julio Valero Mederos", 1924);
        var paraguay = new Equipo(" Asociación Paraguaya de Fútbol", "Guillermo Barros Schelotto", 1906);
        var honduras = new Equipo(" Federación Nacional Autónoma de Fútbol de Honduras ", "Diego Martín Vázquez", 1951);
        var brasil = new Equipo(" Federación Brasileña de Fútbol ", "Tite", 1914);

        var ecuador = new Pais("ECU", "Ecuador", 0, "Conmebol", tri);
        var eargentina = new Pais("AFA", "Argentina", 21, "Conmebol", argentina);
        var ecuba = new Pais("FMC", "Cuba", 12, "Concacaf", cuba);
        var eparaguay = new Pais("APF", "Paraguay", 2, "Conmebol", paraguay);
        var ehonduras = new Pais("FENAFUTH", "Honduras", 6, "Conmebol", honduras);
        var ebrasil = new Pais("CBF", "Brasil", 20, "Conmebol", brasil);
        
        var plata = new Jugador("Gonzalo Plata", 2000, "Delantero", tri);
        var messi = new Jugador("Lionel Messi", 1987, "Delantero", argentina);
        var paradela = new Jugador("Luis Paradela", 1997, "Delantero", cuba);
        var roberto = new Jugador("Roberto Junio Fernandez", 1988, "Arquero", paraguay);
        var angel = new Jugador("Ángel Tejeda", 1991, "Medio Campista", honduras);
        var neymar = new Jugador("Neymar", 1992, "Delantero", brasil);
        

        System.out.println("///EQUIPO///");
        System.out.println("");
        System.out.println("Caso 1");
        System.out.println(plata.mostrarInfo());
        System.out.println(tri.mostrarInfo());
        System.out.println(ecuador.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 2");
        System.out.println(messi.mostrarInfo());
        System.out.println(eargentina.mostrarInfo());
        System.out.println(argentina.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 3");
        System.out.println(paradela.mostrarInfo());
        System.out.println(ecuba.mostrarInfo());
        System.out.println(cuba.mostrarInfo());
        System.out.println("");
        
        System.out.println("Caso 4");
        System.out.println(roberto.mostrarInfo());
        System.out.println(eparaguay.mostrarInfo());
        System.out.println(paraguay.mostrarInfo());
        System.out.println("");
        
        System.out.println("Caso 5");
        System.out.println(angel.mostrarInfo());
        System.out.println(ehonduras.mostrarInfo());
        System.out.println(honduras.mostrarInfo());
        System.out.println("");
        
                System.out.println("Caso 6");
        System.out.println(neymar.mostrarInfo());
        System.out.println(ebrasil.mostrarInfo());
        System.out.println(brasil.mostrarInfo());
        System.out.println("");

        var maria = new Propietario("Maria Gonzales", "0103493094", 22, "Calle Sucre");
        var josue = new Propietario("Josue Martinez", "0346789605", 20, "Calle Pio Bravo");
        var pedro = new Propietario("Pedro Ordoñes", "0134512790", 33, "Calle Manuel Vega Muñoz");
        var marcelo = new Propietario("Marcelo Lopez", "0435495030", 46, "Calle Pio bravo");
        var liz = new Propietario("Liz Pereira", "0343547809", 19, "Sector cuartel Davalos");
        var julia = new Propietario("Julia Avila", "0302073028", 32, "Sector Bellavista");

        var mustang = new Auto("Chevrolet", "Mustang Mach 1", "GCG031", "negro", 2018, "gasolina", 23000);
        var ford = new Auto("Ford", "Explorer 4x4", "AXO201", "azul", 2019, "diesel", 30000);
        var yaris = new Auto("Toyota", "Yaris Nitro", "BCF059", "gris", 2013, "gasolina", 15000);
        var mazda = new Auto("Mazda", "Mazda3 Sedan", "CDF609", "plateado", 2007, "diesel", 17000);
        var bmw = new Auto("BMW", "BMW Serie M2 Coupé", "PQE546", "rojo", 2020, "electricidad", 35000);
        var mercedes = new Auto("Mercedes Benz", "Mercedes AMG C 63", "RTQ378", "verde", 2022, "gasolina", 50000);

        var Mmustang = new Matricula("Centro de matriculacion Gualaceo", maria, mustang, 2025);
        var Mford = new Matricula("Centro Capulispamba", josue, ford, 2027);
        var Myaris = new Matricula("Centro de matriculacion Bolivar", pedro, yaris, 2023);
        var Mmazda = new Matricula("Centro de matriculacion Carchi", marcelo, mazda, 2040);
        var Mbmw = new Matricula("Centro de matriculacion Pichincha", liz, bmw, 2030);
        var Mmercedes = new Matricula("Centro de matriculacion Los Rios", julia, mercedes, 2030);

        System.out.println("///AUTO///");
        System.out.println("");
        System.out.println("Caso 1");
        System.out.println(Mmustang.mostrarInfo());
        System.out.println(mustang.mostrarInfo());
        System.out.println(maria.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 2");
        System.out.println(Mford.mostrarInfo());
        System.out.println(ford.mostrarInfo());
        System.out.println(josue.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 3");
        System.out.println(Myaris.mostrarInfo());
        System.out.println(yaris.mostrarInfo());
        System.out.println(pedro.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 4");
        System.out.println(Mmazda.mostrarInfo());
        System.out.println(mazda.mostrarInfo());
        System.out.println(marcelo.mostrarInfo());
        System.out.println("");

        System.out.println("Caso 5");
        System.out.println(Mbmw.mostrarInfo());
        System.out.println(bmw.mostrarInfo());
        System.out.println(liz.mostrarInfo());
        System.out.println("");
        
        System.out.println("Caso 6");
        System.out.println(Mmercedes.mostrarInfo());
        System.out.println(mercedes.mostrarInfo());
        System.out.println(julia.mostrarInfo());
        System.out.println("");
    }
}
