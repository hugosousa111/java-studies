/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02.testePerformance;

import java.util.ArrayList;

/**
 *
 * @author Hugo Sousa
 * @author Kamila Amelia
 */
public class Quest04 {

    public static void main(String[] args) {
        ArrayList lista30000 = new ArrayList();
        ArrayList lista50000 = new ArrayList();
        ArrayList lista100000 = new ArrayList();
        //instaciamento das listas
        long inicioins, fimins, iniciocons, fimcons;
        //criação das variaveis que iram receber os valores que as diferenças são os tempos de processamento
        boolean var;
        //variavel boleana porque o metodo contains retorna true ou false, para a pesquisa do valor dentro da lista

        System.out.println("Inserção de 30000 dados ...");
        //inicia a contagem de inserção de 30000 valores
        inicioins = System.currentTimeMillis();
        for (int cont = 0; cont < 30000; cont++) {
            lista30000.add(cont);
        }
        fimins = System.currentTimeMillis();
        //finaliza a contagem de inserção de 30000 valores, e faz a diferença para saber o tempo
        long tempoins30 = fimins - inicioins;
        System.out.println("Tempo Inserção -->" + tempoins30);
        System.out.println("Consulta de 30000 dados ...");
        //inicia a contagem de consulta de 30000 valores
        iniciocons = System.currentTimeMillis();
        for (int cont = 0; cont < 30000; cont++) {
            var = lista30000.contains(cont);
        }
        fimcons = System.currentTimeMillis();
        //finaliza a contagem de consulta de 30000 valores, e faz a diferença para saber o tempo
        long tempocons30 = fimcons - iniciocons;
        System.out.println("Tempo Consulta -->" + tempocons30);

        System.out.println("Inserção de 50000 dados ...");
        //inicia a contagem de inserção de 50000 valores
        inicioins = System.currentTimeMillis();
        for (int cont = 0; cont < 50000; cont++) {
            lista50000.add(cont);
        }
        fimins = System.currentTimeMillis();
        //finaliza a contagem de inserção de 50000 valores, e faz a diferença para saber o tempo
        long tempoins50 = fimins - inicioins;
        System.out.println("Tempo Inserção -->" + tempoins50);
        System.out.println("Consulta de 50000 dados ...");
        //inicia a contagem de consulta de 50000 valores
        iniciocons = System.currentTimeMillis();
        for (int cont = 0; cont < 50000; cont++) {
            var = lista50000.contains(cont);
        }
        fimcons = System.currentTimeMillis();
        //finaliza a contagem de consulta de 50000 valores, e faz a diferença para saber o tempo
        long tempocons50 = fimcons - iniciocons;
        System.out.println("Tempo Consulta -->" + tempocons50);

        System.out.println("Inserção de 100000 dados ...");
        //inicia a contagem de inserção de 100000 valores
        inicioins = System.currentTimeMillis();
        for (int cont = 0; cont < 100000; cont++) {
            lista100000.add(cont);
        }
        fimins = System.currentTimeMillis();
        //finaliza a contagem de inserção de 100000 valores, e faz a diferença para saber o tempo
        long tempoins100 = fimins - inicioins;
        System.out.println("Tempo Inserção -->" + tempoins100);
        System.out.println("Consulta de 100000 dados ...");
        //inicia a contagem de consulta de 100000 valores
        iniciocons = System.currentTimeMillis();
        for (int cont = 0; cont < 100000; cont++) {
            var = lista100000.contains(cont);
        }
        fimcons = System.currentTimeMillis();
        //finaliza a contagem de consulta de 100000 valores, e faz a diferença para saber o tempo
        long tempocons100 = fimcons - iniciocons;
        System.out.println("Tempo Consulta -->" + tempocons100);

        if ((tempoins100 + tempoins30 + tempoins50) < (tempocons100 + tempocons30 + tempocons50)) {
            /*se a soma dos tempos de inserção nas listas de 30000, 50000 e 100000 valores 
            for menor que a soma dos tempos de consulta, então o metodo de inserção tem melhor desempenho*/
            System.out.println("O método com melhor desempenho é o de Inserção, \npois dura apenas "
                    + (tempoins100 + tempoins30 + tempoins50) + " ms, já o Método de Consulta \ndura "
                    + (tempocons100 + tempocons30 + tempocons50) + " ms");
        } else {
            /*se não, então o metodo de consulta tem melhor desempenho*/
            System.out.println("O método com melhor desempenho é o de Consulta, \npois dura apenas "
                    + (tempocons100 + tempocons30 + tempocons50) + " ms, já o Método de Inserção \ndura "
                    + (tempoins100 + tempoins30 + tempoins50) + " ms");
        }
    }
}
