/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02.interfaceMath;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero inteiro A:");
        int numA = leitor.nextInt();
        System.out.println("Digite o numero inteiro B:");
        int numB = leitor.nextInt();
        // o usuario insere os dois valores inteiros 
        double divAporB = (double) numA / numB;      
        double divBporA = (double) numB / numA;
        /*para facilitar nos calculos as divisoes são inseridas dentro 
        de duas variaveis double, e com valores de divisões reais */
        System.out.println("divisão A/B = " + divAporB + "\ndivisão B/A = " + divBporA);
        System.out.println("Método floor A/B = " + Math.floor(divAporB));
        System.out.println("Método ceil A/B = " + Math.ceil(divAporB));
        System.out.println("Método pow A^B = " + Math.pow(numA, numB));
        System.out.println("Método pow B^A = " + Math.pow(numB, numA));
        System.out.println("Método tan A = " + Math.tan(numA));
        System.out.println("Método tan B = " + Math.tan(numB));
        System.out.println("Método tan A/B = " + Math.tan(divAporB));
        System.out.println("Método tan B/A = " + Math.tan(divBporA));
    }
}
