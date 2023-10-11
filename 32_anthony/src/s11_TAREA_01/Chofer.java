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
public class Chofer extends Persona {
    private String tipoLicencia;
    private String vehiculo;

    public Chofer(String nombre, int edad, String tipoLicencia, String vehiculo) {
        super(nombre, edad);
        this.tipoLicencia = tipoLicencia;
        this.vehiculo = vehiculo;
    }

    public void conducir() {
        System.out.println("Conduciendo un " + vehiculo);
    }

    public void mostrarLicencia() {
        System.out.println("Tengo licencia de tipo " + tipoLicencia);
    }
}
