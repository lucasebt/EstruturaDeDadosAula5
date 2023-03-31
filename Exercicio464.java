
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio464 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em radianos: ");
        double radianos = entrada.nextDouble();
        
        double graus = converterParaGraus(radianos);
        
        System.out.println(radianos + " radianos equivalem a " + graus + " graus.");
    }
    
    public static double converterParaGraus(double radianos) {
        double graus = radianos * (180/Math.PI);
        return graus;
    }
}