/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04.questao03;

import java.io.*;

/**
 *
 * @author Hugo Sousa 378998
 */
public class Main {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Digite um número : ");
            int numero = Integer.parseInt(entrada.readLine()); //erro digitar letras  NumberFormatException, E o catch do readLine
            int matriz[][] = {{0, 1, 2}, {3, 4}};
            matriz[1][2] = numero; //erro tamanho matriz ArrayIndexOutOfBoundsException
            int x = 2;
            x /= numero; //erro divisão por zero ArithmeticException
            System.out.println("O último elemento da matriz é: " + numero);
        } catch (IOException e) {
            System.err.println("ERRO na Leitura dos dados");
        } catch (NumberFormatException e) {
            System.err.println("ERRO, caractere inválido");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERRO, vetor indexado fora dos seus limites");
        } catch (ArithmeticException e) {
            System.err.println("ERRO, divisão por zero");
        } catch (Exception e) {
            System.out.println("ERRO");
        }
    }
}
