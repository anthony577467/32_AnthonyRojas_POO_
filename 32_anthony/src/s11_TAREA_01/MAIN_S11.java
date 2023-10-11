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
public class MAIN_S11 {
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Persona persona = new Persona("Juan", 30);
        Policia policia = new Policia("Carlos", 35, "Sargento", 1234);
        Chofer chofer = new Chofer("Maria", 25, "Clase B", "Automóvil");
        Cocinero cocinero = new Cocinero("Luis", 40, "Italiana", "Ristorante Buona Tavola");

        // Llamar a los métodos de cada clase
        persona.saludar();
        persona.presentarse();

        policia.saludar();
        policia.presentarse();
        policia.patrullar();
        policia.mostrarPlaca();

        chofer.saludar();
        chofer.presentarse();
        chofer.conducir();
        chofer.mostrarLicencia();

        cocinero.saludar();
        cocinero.presentarse();
        cocinero.cocinar();
        cocinero.mostrarEspecialidad();
    }
}