
package com.mycompany.aula5;
import java.util.Scanner;


public class Exercicio462 {
       public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    int numero1, numero2, numero3; 

    System.out.println("Digite o Primeiro número: ");
    numero1 = entrada.nextInt();
    
    System.out.println("Digite o Segundo número:: ");
    numero2 = entrada.nextInt();
    
    System.out.println("Digite o Terceiro número:: ");
    numero3 = entrada.nextInt();
    
    int media = calcularMedia(numero1, numero2, numero3);
    
    System.out.println("A média é: " + media);
}

public static int calcularMedia(int num1, int num2, int num3) {
    int resultado = num1 + num2 + num3;
    int media = resultado / 3;
    return media;
}
}