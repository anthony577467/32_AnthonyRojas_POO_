/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_TAREA_01;

/**
 *
 * @author USUARIO
 */
public class Cocinero extends Persona {
    private String especialidad;
    private String restaurante;

    public Cocinero(String nombre, int edad, String especialidad, String restaurante) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.restaurante = restaurante;
    }

    public void cocinar() {
        System.out.println("Cocinando en el restaurante " + restaurante);
    }

    public void mostrarEspecialidad() {
        System.out.println("Especializado en cocina " + especialidad);
    }
}