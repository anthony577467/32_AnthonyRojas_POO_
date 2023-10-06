/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_32;
import java.util.Scanner;
public class mainbanco {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("titular de la cuenta: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese el saldo de la cuenta: ");
        double saldoInicial = scanner.nextDouble();
}
}