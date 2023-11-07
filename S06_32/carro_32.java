/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06_32;

/**
 *
 * @author Usuario19
 */
public class carro_32 {
     
     // Atributos
    String nombre;
    int kilometraje;
    String marca;
    int velocidad;
    String color;

    // Métodos
    public void frenar() {
        System.out.println("esta frenando." );
    }

    public void acelerar() {
        System.out.println("esta acelerando.");
    }

    public void girar() {
        System.out.println("el carro esta girando.");
    }

    public void detenerse() {
        System.out.println("el carro esta deteniendo.");
    }
    public void color () {
        System.out.println("el carro es de color" + color);
    }
}


