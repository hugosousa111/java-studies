/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest01;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Potencia_recursiva {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Potencia_metodo p = new Potencia_metodo();
        System.out.println("Digite a base");
        int base = leitor.nextInt();
        System.out.println("Digite o expoente");
        int expoente = leitor.nextInt();
        if (expoente < 0) {
            System.out.println("EXPOENTE INCORRETO");
        } else {
            System.out.println("A resposta é : " + p.potencia(base, expoente));
        }
    }
}
