
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio471 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite outro número: ");
        int numero2 = entrada.nextInt();
        
        int qtdDivisoes = contarDivisoes(numero1, numero2);
        
        System.out.println(numero1 + " é divisível por " + numero2 + " " + qtdDivisoes + " vezes.");
    }
    
    public static int contarDivisoes(int numero1, int numero2) {
        int contador = 0;
        
        while (numero1 % numero2 == 0) {
            contador++;
            numero1 /= numero2;
        }
        
        return contador;
    }
}
