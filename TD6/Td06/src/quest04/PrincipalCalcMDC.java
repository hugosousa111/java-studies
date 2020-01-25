/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest04;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class PrincipalCalcMDC {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int x = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = leitor.nextInt();
        System.out.println("O MDC é: "+CalcMDC.mdc(x,y));
    }
 
}
