/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_32;

import javax.swing.JOptionPane;
public class estudiante_32 {
    String nombre;
    int edad;
    String carrera;
       public estudiante_32(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre: " + getNombre() + "\nEdad: " + getEdad() + " años" + "\nCarrera: " + getCarrera();
        JOptionPane.showMessageDialog(null, mensaje, "Información del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
}


