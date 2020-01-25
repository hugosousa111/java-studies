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
public class Armazenamento {
    private int armazenamento;
    
    public Armazenamento(int arm){
        armazenamento=arm;
    }
    public String toString(){
        return String.format("Armazenamento de %d GB",armazenamento);
    }
}
