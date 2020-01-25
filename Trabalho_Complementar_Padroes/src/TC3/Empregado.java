/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TC3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class Empregado {
    private String nome;
    private List<Empregado> subordinados;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSubordinados(List<Empregado> subordinados) {
        this.subordinados = subordinados;
    }

    public String getNome() {
        return nome;
    }

    public List<Empregado> getSubordinados() {
        return subordinados;
    }
    
    public Empregado(String nom){
        nome=nom;
        subordinados = new ArrayList<Empregado>();
    }
    public void adicionar(Empregado emp){
        subordinados.add(emp);
    }
    public void remover(Empregado emp){
        subordinados.remove(emp);
    }
    public String toString(){
         return "Empregado: "+nome;
    }
    
}
