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
public class Celular {
    private Armazenamento arm;
    private Bluetooth blue;
    private Camera cam;
    private Memoria_Ram ram;
    private Processador proc;
    private Tela tela;
    private Wifi wifi;

    public void setArm(Armazenamento arm) {
        this.arm = arm;
    }

    public void setBlue(Bluetooth blue) {
        this.blue = blue;
    }

    public void setCam(Camera cam) {
        this.cam = cam;
    }

    public void setRam(Memoria_Ram ram) {
        this.ram = ram;
    }

    public void setProc(Processador proc) {
        this.proc = proc;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public void setWifi(Wifi wifi) {
        this.wifi = wifi;
    }

    public Armazenamento getArm() {
        return arm;
    }

    public Bluetooth getBlue() {
        return blue;
    }

    public Camera getCam() {
        return cam;
    }

    public Memoria_Ram getRam() {
        return ram;
    }

    public Processador getProc() {
        return proc;
    }

    public Tela getTela() {
        return tela;
    }

    public Wifi getWifi() {
        return wifi;
    }
    
    public Celular(Armazenamento arm,Memoria_Ram ram,Processador proc,Tela tela){
        this.arm = arm;
        this.ram = ram;
        this.proc = proc; 
        this.tela = tela;
    }
            
    public Celular(Armazenamento arm,Bluetooth blue,Camera cam,Memoria_Ram ram,Processador proc,Tela tela,Wifi wifi){   
        this.arm = arm;
        this.blue = blue;
        this.cam = cam;
        this.ram = ram;
        this.proc = proc; 
        this.tela = tela;
        this.wifi = wifi;
    }
    public String toString(){
        if ((blue!=null)&&(wifi!=null)&&(cam!=null)){
            return String.format("Configuração do Celular:\n%s \n%s \n%s \n%s \n%s \n%s \n%s \n",arm, ram, proc, tela, blue, wifi, cam);
        }
            return String.format("Configuração do Celular:\n%s \n%s \n%s \n%s \n", arm,ram,proc,tela);
    }
}
