
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio480 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        if (ehCapicua(numero)) {
            System.out.println(numero + " é um número capicua.");
        } else {
            System.out.println(numero + " não é um número capicua.");
        }
    }
    
    public static boolean ehCapicua(int numero) {
        String numeroString = Integer.toString(numero);
        int tamanho = numeroString.length();
        for (int i = 0; i < tamanho/2; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
