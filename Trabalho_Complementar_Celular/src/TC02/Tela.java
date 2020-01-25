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
public class Tela {
    private int polegadas;
    
    
    public Tela(int pol){
        polegadas=pol;
    }
    public String toString(){
        return String.format("Tela com %s polegadas",polegadas);
    }
}
