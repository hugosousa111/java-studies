/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest03;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Principaltrocanumcl {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Trocanumc tn = new Trocanumc();
        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        System.out.print("Ao contrario é: ");
        tn.exibirInverso(num);
    }
}