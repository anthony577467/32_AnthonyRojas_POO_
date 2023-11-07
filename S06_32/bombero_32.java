/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06_32;

/**
 *
 * @author Usuario19
 */
public class bombero_32 {
    
    // Atributos
    String nombre;
    int edad;
    String estacion;
    int añosDeServicio;
    boolean enServicio;

    // Métodos
    public void apagarFuego() {
        System.out.println("Apagando el fuego..."+ enServicio);
    }

    public void rescatarPersona() {
        System.out.println("Rescatando a la persona..."+ nombre);
    }

    public void conducirCamion() {
        System.out.println("Conduciendo el camión de bomberos..."+ estacion);
    }

    public void mantenerEquipo() {
        System.out.println("Manteniendo el equipo..."+ añosDeServicio);
    }

    public void entrenar() {
        System.out.println("Entrenando para mantenerse en forma..."+ enServicio);
    }
}


