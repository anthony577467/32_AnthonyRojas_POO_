/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package S05_32;
import javax.swing.JOptionPane;

public class Libro_32 {
    String color;
    String titulo;
    String autor;
    
    public Libro_32(String titulo, String autor) { 
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarInformacion() {
        String mensaje = "Título: " + getTitulo() + "\nAutor: " + getAutor();
        JOptionPane.showMessageDialog(null, mensaje, "Información del Libro", JOptionPane.INFORMATION_MESSAGE);
    }
}