/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5;

import java.util.Scanner;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest5 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        double salario;
        System.out.println("Informe seu salário para saber o desconto do INSS:");
        salario =  leitor.nextDouble();
        //depois de lido o salario, é testado os valores para seus respectivos descontos
        if (salario <= 600){
           System.out.println("Isento de desconto no INSS"); 
        }else if ((salario>600) && (salario<=1200)){
            System.out.println("O desconto é de "+ salario*0.2 +". Logo, seu salário final é de: "+(salario-(salario * 0.2)));    
            //salario*0.2 representa 20% do salario, que é o que será descontado, da mesma forma os descontos abaixo
            //(salario-(salario * 0.2)) é o restante do salario, já com a perda no desconto
        }else if ((salario>1200) && (salario<=2000)){
            System.out.println("O desconto é de "+ salario*0.25 +". Logo, seu salário final é de: "+(salario-(salario * 0.25)));    
        }else if (salario>2000){
            System.out.println("O desconto é de "+ salario*0.3 +". Logo, seu salário final é de: "+(salario-(salario * 0.3)));    
        }
    }
}
