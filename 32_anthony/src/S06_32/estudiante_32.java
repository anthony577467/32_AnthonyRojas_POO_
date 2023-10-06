
package S06_32;


public class estudiante_32 {
    public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
   

    // Constructor 
    public Estudiante() {
        nombre = "Sin nombre";
        edad = 0;
       
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
       
    }

    // Métodos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    



    //valor de retorno
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad  + nombre;
    }
}
}