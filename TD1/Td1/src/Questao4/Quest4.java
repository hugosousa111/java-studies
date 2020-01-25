/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest4 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        double velocidade, tempo, distancia; //variaveis necessarias para as manipulações
        System.out.println("Informe o tempo para completar a viagem (em horas):");
        tempo = leitor.nextDouble();
        System.out.println("Informe a velocidade média para completar a viagem(em km/h por horas):"); 
        velocidade = leitor.nextDouble();
        distancia = tempo * velocidade; //como a questão informa, eu descobro a distancia com essa formula
        System.out.println("A distância que será percorrida em sua viagem ira ser de "+distancia+ " km");
        System.out.println("O total de litros que serão gastos nessa viagem será "+ distancia/14+" litros"); //como o carro gasta um litro a cada 14 km, dividimos a distancia por 14, para obtermos os litros gastos
    }
}
