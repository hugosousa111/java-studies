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
public class Leitor_Biometrico {
    private boolean Leitor_B;
    
    public Leitor_Biometrico(boolean lb){
        Leitor_B=lb;
    }
    public String toString(){
        return String.format("Leitor Biometrico: %b",Leitor_B);
    }
}
