
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio465 {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();
        
        maiorNumero(numero1, numero2, numero3);
    }
    
    public static void maiorNumero(double numero1, double numero2, double numero3) {
        double maior = numero1;
        
        if (numero2 > maior) {
            maior = numero2;
        }
        
        if (numero3 > maior) {
            maior = numero3;
        }
        
        System.out.println("O maior número é: " + maior);
    }
}