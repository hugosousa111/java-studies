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
public class Wifi {
    private boolean wifi;
    
    public Wifi(boolean wf){
        wifi=wf;
    }
    public String toString(){
        return String.format("Wifi: %b",wifi);
    }
    
}
