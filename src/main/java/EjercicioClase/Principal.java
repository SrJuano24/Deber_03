/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClase;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {
        var david = new Dueño("David", 1989, "010402493920");
        
        var rocky = new Mascota("Rocky",david,"Chihuahua","Macho");
        
        var patitas = new Atencion("Pio Bravo","Patitas",200,rocky);
        
        System.out.println(rocky.mostrarInfo());
        System.out.println(david.mostrarInfo());
        System.out.println(patitas.mostrarInfo());
        
        

    }

}
