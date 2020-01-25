/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest3 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);//instaciando leitor como minha variavel de leitura de dados
        double salario, kwgastos;
        System.out.println("Informe o salário:");
        salario = leitor.nextDouble();
        System.out.println("Informe a quantidade de quilowatts gasta: ");
        kwgastos = leitor.nextDouble();
        System.out.println("O valor em reais de cada quilowatt é "+salario/700+" reais"); //com esse calculo "salario/700" sabemos o valor de cada kW
        System.out.println("O valor a ser pago é "+((salario/700)*kwgastos+" reais")); //multiplico o valor de um kW por o numero de kW gastos
        System.out.println("O novo valor a ser pago por esta residência com um desconto de 10% é "+(((salario/700)*kwgastos)*0.9)+" reais"); //aplica um desconto de 10% nesse valor
    }
}
