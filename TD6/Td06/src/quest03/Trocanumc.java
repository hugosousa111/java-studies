/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest03;

/**
 *
 * @author Hugo
 */
public class Trocanumc {
    int nova;
    public void exibirInverso(int num){
        nova = num % 10;
                
        if(nova == 0 && num < 10){
            return;
        }
        
        System.out.print(nova);
        nova = (int) num / 10;
        exibirInverso(nova);       
    }
}