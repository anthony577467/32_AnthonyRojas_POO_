/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_32;
import javax.swing.JOptionPane;
public class persona_32 {
    String nombre;
    int edad;
    public persona_32(String nombre, int edad) { 
        this.nombre = nombre;
        this.edad = edad;
    }
     public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void mostrarInformacion() {
        String mensaje = "Nombre: " + getNombre() + "\nEdad: " + getEdad() + " años";
        JOptionPane.showMessageDialog(null, mensaje, "Información de la Persona", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Persona_32
        persona_32 persona = new persona_32("Juan Pérez", 30);

        // Mostrar la información de la persona en un JOptionPane
        persona.mostrarInformacion();
    }

}
