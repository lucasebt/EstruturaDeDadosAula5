
package com.mycompany.aula5;

import java.util.Scanner;
public class Exercicio463 {
        public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em graus: ");
        double graus = entrada.nextDouble();
        
        double radianos = converterParaRadianos(graus);
        
        System.out.println(graus + " graus equivalem a " + radianos + " radianos.");
    }
    
    public static double converterParaRadianos(double graus) {
        double radianos = graus * (Math.PI/180);
        return radianos;
    }}