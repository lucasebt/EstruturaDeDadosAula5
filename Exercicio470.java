
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio470 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        if (verificarPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
    
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}