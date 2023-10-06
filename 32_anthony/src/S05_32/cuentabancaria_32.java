/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_32;

import java.util.Scanner;
public class cuentabancaria_32 {
     private String titular;
    private double saldo;
      public cuentabancaria_32(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: $" + getSaldo());
    }

}