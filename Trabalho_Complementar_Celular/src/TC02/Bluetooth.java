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
public class Bluetooth {
    private boolean bluetooth;
    
    public Bluetooth(boolean blue){
        bluetooth=blue;
    }
    public String toString(){
        return String.format("Bluetooth: %b",bluetooth);
    }
}
