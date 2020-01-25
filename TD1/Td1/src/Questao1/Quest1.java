/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest1 {
    public static void main(String args[]) {
        Scanner leitor= new Scanner(System.in); //instaciando leitor como minha variavel de leitura de dados
        double resultado; //variavel "resultado" recebe a resposta do calculo 
        System.out.println("Insira o primeiro valor: ");
        double a = leitor.nextDouble(); //"a" recebe o primeiro valor
        System.out.println("Insira o segundo valor: ");
        double b = leitor.nextDouble(); //"b" recebe o segundo valor
        System.out.println("Escolha a operação\n"
                + "1 - Adição \n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão");
        int op=leitor.nextInt(); // o usuario escolhe a operação de acordo com as opções acima
        switch (op){
            //de acordo com a opção, é realizado a operação entre "a" e "b", inserido dentro de resultado e exibido
            case 1: 
                resultado=a+b;
                System.out.println("O resultado é "+resultado);
                break;
            case 2: 
                resultado=a-b;
                System.out.println("O resultado é "+resultado);
                break;   
            case 3: 
                resultado=a*b;
                System.out.println("O resultado é "+resultado);
                break;    
            case 4: 
                resultado=a/b;
                System.out.println("O resultado é "+resultado);
                break;    
            default: 
                //caso o usuario escolha um numero inesperado
                System.out.println("OPERAÇÃO INVALIDA");
        }
    }
}
