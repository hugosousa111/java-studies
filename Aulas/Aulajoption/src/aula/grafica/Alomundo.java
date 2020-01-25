/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.grafica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Alomundo extends JFrame {

    int a=0;
    String num= "";
    public Alomundo() {
        //JOptionPane.showMessageDialog(null, "Alo mundao","primeiro prog em inter grafica", JOptionPane.DEFAULT_OPTION);
        //a = JOptionPane.showConfirmDialog(null, "Alo mundo", "Primeiro programa inter grafi", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        //num = JOptionPane.showInputDialog(null, "Qual o primeiro valor?","primeiro  proga inter grafi", JOptionPane.QUESTION_MESSAGE);
        String[] opcoes = {"Confirmar","Cancelar","Fechar"};
        a = JOptionPane.showOptionDialog(null, "mensagem", "titulo", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, null , opcoes, opcoes[0]);
    }

    public static void main(String[] args) {
        Alomundo aplicacao = new Alomundo();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra o processo
        System.out.println(aplicacao.a);
        //System.out.println(aplicacao.num);
        
    }
}