
package com.mycompany.aula5;

import java.util.Scanner;


public class Exercicio460 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int numero1, numero2, numero3;
   
        System.out.println("Digite o Primeiro número: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite o Segundo número:: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Digite o Terceiro número:: ");
        numero3 = entrada.nextInt();
        
        int dobro1 = calcularDobro(numero1);
        int dobro2 = calcularDobro(numero2);
        int dobro3 = calcularDobro(numero3);
        
        System.out.println("O primeiro número é: " + dobro1);
        System.out.println("O segundo número é: " + dobro2);
        System.out.println("O terceiro número é: " + dobro3);
     
        entrada.close();
    }
     public static int calcularDobro(int numero) {
        int dobro = numero * 2;
        return dobro;
     }
}
