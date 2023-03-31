
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio473 {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        char caractere = entrada.next().charAt(0);
        
        int resultado = verificarConsoante(caractere);
        
        if (resultado == 1) {
            System.out.println(caractere + " é uma consoante.");
        } else {
            System.out.println(caractere + " não é uma consoante.");
        }
    }
    
    public static int verificarConsoante(char caractere) {
        if (Character.isLetter(caractere)) {
            switch (Character.toLowerCase(caractere)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return 0;
                default:
                    return 1;
            }
        } else {
            return 0;
        }
    }
}
