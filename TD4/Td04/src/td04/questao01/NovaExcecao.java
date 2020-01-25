/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td04.questao01;

/**
 *
 * @author Hugo Sousa 378998
 */
public class NovaExcecao extends Exception{
    public NovaExcecao(){
        super("Erro, raiz de números negativos!!");
    }public NovaExcecao(String msg){
        super(msg);
    }
}
