
package S06_32;


public class calculadora_32 {
    public class Calculadora {
    // Atributos
    private double resultado;

    // Constructor
    public Calculadora() {
        resultado = 0;
    }

    // Constructor
    public Calculadora(double valorInicial) {
        resultado = valorInicial;
    }

    // Método
    public double getResultado() {
        return resultado;
    }

    // Métodos
    public void sumar(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void restar(double num1, double num2) {
        resultado = num1 - num2;
    }

    public void multiplicar(double num1, double num2) {
        resultado = num1 * num2;
    }

    public void dividir(double num1, double num2) {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("error");
        }
    }

    // Sobrecarga de método
    public void sumar(double num) {
        resultado += num;
    }

    public void restar(double num) {
        resultado -= num;
    }

    public void multiplicar(double num) {
        resultado *= num;
    }

    //valor de retorno
    public String obtenerResultado() {
        return "Resultado: " + resultado;
    }
}

}
