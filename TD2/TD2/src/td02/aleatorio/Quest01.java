/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02.aleatorio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int valor;      //valor que o usuario digita por vez
        int vetor[] = new int[10]; //vetor com os valores
        for (int cont = 0; cont < 10; cont++) {
            //contador vai girar 10 vezes para receber os 10 valores
            System.out.println("Digite o numero " + (cont + 1) + ":");
            valor = leitor.nextInt();
            vetor[cont] = (int) (valor * Math.ceil(Math.random() * 10000));
            /*a linha acima pega o que o usuario digitou e multiplica pelo número aleatório 
              que é multiplicado por 10000, arredondados para cima, isso tudo é convertido em inteiro "(int)"  
              e é inserido dentro do vetor
             */
        }
        System.out.println("Numeros não ordenados:");
        for (int a = 0; a < 10; a++) {
            //exibição do vetor com os valores não alterados
            System.out.println("-------->      " + vetor[a]);
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }/* o vetor é ordenado com o metodo Bubble Sort,
        porque assim facilita na hora de pegar os 4 maiores valores*/
        System.out.println("Os quatro maiores valores:");
        ArrayList lista = new ArrayList(); //instaciando o ArrayList
        for (int a = 9; a > 5; a--) {
            lista.add(vetor[a]); // pegando os 4 ultimos valores do vetor e jogando dentro da lista
        }
        for (int a = 0; a < 4; a++) {
            //exibindo a lista dos 4 maiores 
            System.out.println("-----> " + lista.get(a));
        }

    }

}
