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
public class RelogioDespertador implements alarme{

    public RelogioDespertador(){
        setAlarme("00:00:00");
    }
    public RelogioDespertador(String tempo){
        setAlarme(tempo);
    }
    public RelogioDespertador(String hr, String min, String sec){
        setAlarme(hr+":"+min+":"+sec);
    }
    String Tempo;
    public void setAlarme(String tempo) {
        Tempo = tempo;
    }
    public String getAlarme() {
        return Tempo;
    }

    @Override
    public void liga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
