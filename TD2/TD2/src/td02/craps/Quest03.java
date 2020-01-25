/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02.craps;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = 1; //varivel auxiliar para o usuario continuar jogando ou não
        int pontuacao = 1; //a pontuação é soma dos dados
        int dado1, dado2; //variaveis que recebem os valores sorteados 
        while (entrada == 1) {
            System.out.println("\nINICIAR JOGO");
            System.out.print("1 - Lançar dados:\n2 - Sair\n-->");
            entrada = leitor.nextInt();
            if (entrada != 1) {
                //se o usuario digitar algo diferente de 1, ele deseja o fim do jogo 
                break;
            } else if (entrada == 1) {
                dado1 = (int) Math.ceil(Math.random() * 6);
                dado2 = (int) Math.ceil(Math.random() * 6);
                //os sorteios acontecem de 1 a 6, por causa dos arredondamentos
                System.out.println("\nDADO 1 - - >" + dado1);
                System.out.println("DADO 2 - - >" + dado2);
                if ((dado1 + dado2) == 7 || (dado1 + dado2) == 11) {
                    // se o usuario conseguir a soma dos dados igual a 7 ou 11 ele já ganha
                    System.out.println("\nVocê venceu, a soma dos dados deram " + (dado1 + dado2));
                    continue;
                    /*o continue ignora tudo abaixo e vai para a proxima iteração, 
                                para o usuario escolher se quer continuar jogando*/
                } else if ((dado1 + dado2) == 2 || (dado1 + dado2) == 3 || (dado1 + dado2) == 12) {
                    //se o usuario conseguir a soma dos dados igual a 2,3, ou 12 ele já perde
                    System.out.println("\nVocê perdeu, a soma dos dados deram " + (dado1 + dado2));
                    continue;
                } else {
                    /*caso as condições acima não forem satisfeitas 
                    a soma dos dados será sua pontuação e ele tem como objetivo 
                    acertar o valor dessa pontuação */
                    pontuacao = dado1 + dado2;
                    System.out.println("\nSua pontuação é " + pontuacao);
                }
            }
            while (entrada == 1) {
                System.out.print("1 - Lançar dados novamente:\n2 - Sair\n-->");
                entrada = leitor.nextInt();
                if (entrada != 1) {
                    //se o usuario digitar algo diferente de 1, ele deseja o fim do jogo 
                    break;
                }
                dado1 = (int) Math.ceil(Math.random() * 6);
                dado2 = (int) Math.ceil(Math.random() * 6);
                System.out.println("\nDADO 1 - - >" + dado1);
                System.out.println("DADO 2 - - >" + dado2);
                //acontece um novo sorteio até a condição abaixo ser satisfeita ou o usuario escolher sair
                if (pontuacao == dado1 + dado2) {
                    System.out.println("\nVocê venceu, a soma dos dados -->" + (dado1 + dado2) + " é igual a pontuação -->" + pontuacao);
                    break;
                } else {
                    /*caso não seja satisfeita a condição acima, a soma dos dados
                    será a nova pontuação do usuario, que continua com mesmo objetivo*/
                    System.out.println("\nSua soma dos dados deveria ser " + pontuacao + " continue jogando");
                    pontuacao = dado1 + dado2;
                    System.out.println("\nSua nova pontuacao é -->" + pontuacao);
                }
            }
        }
        System.out.println("FIM DE JOGO");
    }
}
