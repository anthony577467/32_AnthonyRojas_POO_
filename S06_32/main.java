/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S06_32;

/**
 *
 * @author Usuario19
 */
public class main {
    
    public static void main(String[] args) {
        // Crear un objeto de la clase Profesor
        profesor_32 miProfesor = new profesor_32();

        // Llamar a los métodos del objeto Profesor
        miProfesor.enseñar();
        miProfesor.prepararClase();
        miProfesor.calificar();
        miProfesor.asesorar();
        miProfesor.investigar();
        
        // Crear un objeto de la clase Bombero
        bombero_32 miBombero = new bombero_32();

        // Llamar a los métodos del objeto 
        miBombero.apagarFuego();
        miBombero.rescatarPersona();
        miBombero.conducirCamion();
        miBombero.mantenerEquipo();
        miBombero.entrenar();
        carro_32 micarro = new carro_32();

        // Llamar a los métodos del objeto 
         micarro.frenar();
         micarro.acelerar();
         micarro. girar();
         micarro.color();
         micarro.detenerse();
        fruta_32 mifruta = new fruta_32();

        // Llamar a los métodos del objeto 
         mifruta.sabor();
         mifruta.nombre();
         mifruta.cantidad();
         mifruta.pais();
         mifruta. precio();
    }
}

    



