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
public class Processador {
    private double frequencia;
    public Processador(double freq){
        frequencia=freq;
    }
    public String toString(){
        return String.format("Processador de %f GHz",frequencia);
    }
}
