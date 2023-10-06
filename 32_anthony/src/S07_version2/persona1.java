/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_version2;


public class persona1 {
 
    // Atributos
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public persona1(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos
    public void saludar() {
        System.out.println("¡Hola, soy " + nombre + "!");
    }

    public void cumplirAnios() {
        edad++;
    }

    // Sobrecarga de métodos: mismo nombre, diferentes parámetros
    public void saludar(String saludo) {
        System.out.println(saludo + ", soy " + nombre + ".");
    }

    // Métodos con valores de retorno (3 tipos de datos diferentes)
    public int obtenerEdad() {
        return edad;
    }

    public double obtenerAltura() {
        return altura;
    }

    public String obtenerNombre() {
        return nombre;
    }

    // Métodos con parámetros y argumentos (2 ejemplos)
    public void cambiarAltura(double nuevaAltura) {
        altura = nuevaAltura;
    }

    public void actualizarDatos(String nuevoNombre, int nuevaEdad) {
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }

    public static void main(String[] args) {
        // Creación de dos objetos de tipo Persona
        persona1  persona1 = new persona1("Juan", 30, 1.75);
        persona1  persona2 = new persona1("Ana", 25, 1.60);

        // Llamada a métodos
        persona1.saludar();
        persona2.saludar("¡Hola");

        System.out.println(persona1.obtenerNombre() + " tiene " + persona1.obtenerEdad() + " años.");
        System.out.println(persona2.obtenerNombre() + " mide " + persona2.obtenerAltura() + " metros.");
    }
}

