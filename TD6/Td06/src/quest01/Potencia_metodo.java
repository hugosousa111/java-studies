/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest01;

/**
 *
 * @author Hugo
 */
public class Potencia_metodo {
    int resp = 1;
    
    public int potencia(int base, int expoente){
        if (base == 0 && expoente == 0){
            System.out.println("--INDETERMINAÇÃO--");
            return 0;
        }else if(base == 0){
            return 0;
        }else if(expoente == 0){
            return 1;
        }else if(expoente == 1){
            return base*resp;
        }else{
            resp = resp*base;
            return potencia(base,(expoente-1));
        }
    }
}