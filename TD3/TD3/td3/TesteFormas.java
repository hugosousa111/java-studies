/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;

/**
 *
 * @author Hugo Sousa 
 * Matricula: 378998
 */
public class TesteFormas{
    public static void main(String[] args) {
        Ponto formas [] = new Ponto[3];
        formas[0]= new Ponto();
        formas[1]= new Ponto();
        formas[1].setx(5);
        formas[1].sety(15);
        formas[2]= new Ponto(20, 10);
        for (int cont=0; cont<3; cont++){
            System.out.println(formas[cont].descreveForma());
        }
        System.out.println();
        Circulo formas2[]= new Circulo[3];
        formas2[0]= new Circulo();
        formas2[1]= new Circulo();
        formas2[1].setx(5);
        formas2[1].sety(15);
        formas2[1].setraio(15);
        formas2[2]= new Circulo(30, 20, 10);
        for (int cont=0; cont<3; cont++){
            System.out.println(formas2[cont].descreveForma());
        }
        System.out.println();
        Ponto formas3[]= new Ponto[5];
        formas3[0]= new Ponto(10, 10);
        formas3[1]= new Circulo(5, 20, 20);
        formas3[2]= new Cilindro();
        formas3[3]= new Cilindro(6,9,10,12);
        formas3[4]= new Ponto();
        for (int cont=0; cont<5; cont++){
            System.out.println(formas3[cont].descreveForma());
        }
    }
}