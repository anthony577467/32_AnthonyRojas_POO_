/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06_32;

/**
 *
 * @author Usuario19
 */
public class profesor_32 {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    String curso;
    int notas;

    // Métodos
    public void enseñar() {
        System.out.println("El profesor está enseñando."+ curso);
    }

    public void prepararClase() {
        System.out.println("El profesor está preparando la clase."+ curso);
    }

    public void calificar() {
        System.out.println("El profesor está calificando los trabajos de los estudiantes."+ notas);
    }

    public void asesorar() {
        System.out.println("El profesor está asesorando a un estudiante."+ edad);
    }

    public void investigar() {
        System.out.println("El profesor está realizando una investigación."+ curso);
    }
}

