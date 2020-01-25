/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest02;

import java.util.Locale;

/**
 *
 * @author Hugo
 */
public class Conta_letras {
    int numdeletrasm = 0;
    String letraatual = "";
    String novapalavra;
    public int conta_Maiusculas(String frase){
        letraatual = String.valueOf(frase.charAt(0)); 
        if(frase.length() == 1){
            if((String.valueOf(frase.charAt(0)).equals(letraatual.toUpperCase(Locale.getDefault()))) && !(Character.isSpaceChar(frase.charAt(0))) && Character.isLetter(frase.charAt(0))){
                numdeletrasm += 1;
                return numdeletrasm;
            }else{
                return numdeletrasm;
            }            
        }else {
            if((String.valueOf(frase.charAt(0)).equals(letraatual.toUpperCase(Locale.getDefault()))) && !(Character.isSpaceChar(frase.charAt(0))) && Character.isLetter(frase.charAt(0))){
                numdeletrasm += 1;
                novapalavra = frase.substring( 0, 0 ) + frase.substring( 0 + 1 );
                return conta_Maiusculas(novapalavra);
            }else{
                novapalavra = frase.substring( 0, 0 ) + frase.substring( 0 + 1 );
                return conta_Maiusculas(novapalavra);
            }
        }
    }
}
