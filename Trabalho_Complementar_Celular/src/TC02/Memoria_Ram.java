/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TC02;

/**
 *
 * @author Hugo
 */
public class Memoria_Ram {
    private int ram;
    
    public Memoria_Ram(int mem){
        ram=mem;
    }
    public String toString(){
        return String.format("Memória RAM com %d GB",ram);
    }
    
}
