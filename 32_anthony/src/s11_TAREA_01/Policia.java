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
public class Policia extends Persona {
    private String rango;
    private int numeroPlaca;

    public Policia(String nombre, int edad, String rango, int numeroPlaca) {
        super(nombre, edad);
        this.rango = rango;
        this.numeroPlaca = numeroPlaca;
    }

    public void patrullar() {
        System.out.println("Patrullando la zona");
    }

    public void mostrarPlaca() {
        System.out.println("Mi número de placa es " + numeroPlaca);
    }
}