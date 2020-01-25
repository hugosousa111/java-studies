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
public class Main {

    public static void main(String[] args) {
        Armazenamento arm = new Armazenamento(16);
        Bluetooth blue = new Bluetooth(true);
        Camera cam = new Camera(12);
        Leitor_Biometrico lb = new Leitor_Biometrico(true);
        Memoria_Ram ram = new Memoria_Ram(2);
        Processador proc = new Processador(2.4);
        Tela tela = new Tela(5);
        Wifi wifi = new Wifi(true);
        Celular cel_1 = new Celular(arm, ram, proc, tela);
        System.out.println(cel_1.toString());
        Celular cel_2 = new Celular(arm, blue, cam, ram, proc, tela, wifi);
        System.out.println(cel_2.toString());
        CelularNG celng_1 = new CelularNG(arm, ram, proc, tela);
        System.out.println(celng_1.toString());
        CelularNG celng_2 = new CelularNG(arm, blue, cam, ram, proc, tela, wifi);
        System.out.println(celng_2.toString());
        CelularNG celng_3 = new CelularNG(arm, blue, cam, ram, proc, tela, wifi, lb);
        System.out.println(celng_3.toString());
    }

}
