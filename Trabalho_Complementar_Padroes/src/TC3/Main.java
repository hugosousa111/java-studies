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
public class Main {
    public static void main(String[] args) {
        System.out.println("Item A)\n");
        CapitalBrasil capital = CapitalBrasil.getInstancia();
        capital.mostraResultado();
        System.out.println("\nItem B)\n");
        FabricaCarro fabrica = new FabricaCarro();
        Carro fd = fabrica.FabricaCarro("Ford");
        fd.imprimeDetalhes();
        Carro ft = fabrica.FabricaCarro("Fiat");
        ft.imprimeDetalhes();
        Carro hd = fabrica.FabricaCarro("Honda");
        hd.imprimeDetalhes();
        System.out.println("\nItem C)\n");
        Empregado gerente  = new Empregado("Chefe");
        Empregado empregado1 = new Empregado("empregado_01");
        Empregado empregado2 = new Empregado("empregado_02");
        gerente.adicionar(empregado1);
        gerente.adicionar(empregado2);
        System.out.println("Gerente: "+gerente.toString());
        for (Empregado emps:gerente.getSubordinados()){
            System.out.println(emps.toString());
        }
    }
}
