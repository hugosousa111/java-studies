/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TC3;

/**
 *
 * @author Hugo
 */
public class CapitalBrasil {
    private static CapitalBrasil instancia = new CapitalBrasil();
    public static CapitalBrasil getInstancia(){
        return instancia;
    }
    private CapitalBrasil(){}
    public void mostraResultado(){
        System.out.println("A capital do Brasil é Brasília");
    }
}
