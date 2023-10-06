
package s07_32AnthonyRojas;

public class persona1 {

    // Método con parámetros
    public void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Método con valor de retorno
    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        persona persona = new persona();

        // Llama al método con parámetros
        persona.saludar("Juan");

        // Llama al método con valor de retorno y obtiene el valor en una variable
        int resultadoSuma = persona.sumar(5, 3);

        // Imprime el valor de retorno
        System.out.println("La suma es: " + resultadoSuma);
    }
}

