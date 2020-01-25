/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest2 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);//instaciando leitor como minha variavel de leitura de dados
        String nome; //variavel do nome do usuario
        double saldo_inicial, saldo_final, lancamento; //os saldos da conta (saldo_inicial, saldo_final) e os valores de débitos e creditos(lancamento)
        int opl, cond = 1; //variaveis auxiliares
        System.out.println("Digite o seu nome: ");
        nome = leitor.next();
        System.out.println("Digite o seu Saldo Inicial: ");
        saldo_inicial = leitor.nextDouble();
        saldo_final=saldo_inicial;
        while(cond == 1){
            //dentro de um while porque ele pode fazer quantas operações quiser na conta
            System.out.println("Escolha o tipo do seu lançamento \n"
                    + "1 - Débito\n"
                    + "2 - Crédito\n"
                    + "3 - Finalizar lançamentos");
            opl = leitor.nextInt();
            if (opl ==3){
                //se for a opção 3, ele sai do while
                break;
            }
            System.out.println("Digite o valor do lancamento: ");
            lancamento = leitor.nextDouble();
            switch (opl) {
                //os cases de debito(faz um decremento) e credito(faz uma adição) no saldo final
                case 1:
                    saldo_final= saldo_final-lancamento;
                    break;
                case 2:
                    saldo_final= saldo_final+lancamento;
                    break;
                default:
                    //caso o usario insira outro valor qualquer
                    System.out.println("OPERAÇÃO INVALIDA");
                    break;
            }
        }
        //depois de finalizado os lançamentos, ele mostra o saldo final do usuário
        System.out.println("O saldo final da conta no nome de"+nome+", é de "+saldo_final);
    }   
    
}
