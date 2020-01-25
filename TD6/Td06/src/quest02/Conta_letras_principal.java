/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Hugo
 */
public class Conta_letras_principal {
    public static void main(String[] args) throws IOException {
        Conta_letras cl= new Conta_letras();
        System.out.println("Digite a palavra ou frase que sera testada");
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        String frase = leitor.readLine();
        System.out.println("O numero de letras maiusculas é: "+cl.conta_Maiusculas(frase));
    }
}
