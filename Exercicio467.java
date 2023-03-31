
package com.mycompany.aula5;

import java.util.Scanner;


public class Exercicio467 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 = entrada.nextDouble();
        
        System.out.print("Digite a base do logaritmo: ");
        double base = entrada.nextDouble();
        
        System.out.println("Logaritmo do primeiro número: " + calcularLogaritmo(numero1, base));
        System.out.println("Logaritmo do segundo número: " + calcularLogaritmo(numero2, base));
        System.out.println("Logaritmo do terceiro número: " + calcularLogaritmo(numero3, base));
    }
    
    public static double calcularLogaritmo(double numero, double base) {
        double logaritmo = Math.log(numero) / Math.log(base);
        return logaritmo;
    }
}

