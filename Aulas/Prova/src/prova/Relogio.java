/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Hugo
 */
public interface Relogio {
    public abstract void setTempo(String tempo);
    public abstract void resetTempo();
    public abstract void incSegundo();
    public abstract String getTempo();
}
