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
public class FabricaCarro {
    public Carro FabricaCarro(String tipo){
        if (tipo.equalsIgnoreCase("Ford"))
            return new Carro_Ford();
        if (tipo.equalsIgnoreCase("Fiat"))
            return new Carro_Fiat();
        if (tipo.equalsIgnoreCase("Honda"))
            return new Carro_Honda();
        return null;
    }
}
