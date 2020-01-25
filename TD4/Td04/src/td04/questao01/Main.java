/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04.questao01;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa 378998
 */
public class Main {
    public static double raiz(double numero) throws NovaExcecao{
        if(numero < 0){
            throw new NovaExcecao();
        }
        return Math.sqrt(numero);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite um número : ");
            double num = leitor.nextDouble();
            double resultado = raiz(num);
            System.out.println("O resultado é : "+ resultado);
        } catch (NovaExcecao e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("CARACTERE NÃO VALIDO");
        } finally{
            System.out.println("FIM");
        }
    }
}
