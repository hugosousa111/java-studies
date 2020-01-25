/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04.questao02;

/**
 *
 * @author Hugo Sousa 378998
 */
public class Main {
    
    public static void geraExcecaoB() throws ExceptionB{
        throw new ExceptionB();   
    }
    public static void geraExcecaoC() throws ExceptionC{
        throw new ExceptionC();   
    }
    
    public static void main(String[] args) {
        try{
            geraExcecaoB();
        }catch(ExceptionA e){
            System.out.println(e.getMessage());
        } 
        
        try{
            geraExcecaoC();
        }catch(ExceptionA e){
            System.out.println(e.getMessage());
        }
    }
}
