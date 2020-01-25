/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Hugo
 */
public class Classe extends JFrame{
    public Classe(){
        GridLayout layaout = new GridLayout(2,2);
        Container container = getContentPane();
        container.setLayout( layaout );
        JButton leftButton = new JButton();
        JButton centerButton = new JButton();
        JButton rightButton = new JButton();
        JButton eButton = new JButton();
        JButton fButton = new JButton();
        JButton gButton = new JButton();
        JButton hButton = new JButton();
        container.add(leftButton);
        leftButton.setText("Botão 01");
        container.add(centerButton);
        centerButton.setText("Botão 02");
        container.add(rightButton);
        rightButton.setText("Botão 03");
        container.add(eButton);
        eButton.setText("Botão 04");
        container.add(fButton);
        fButton.setText("Botão 05");
        container.add(gButton);
        gButton.setText("Botão 06");
        container.add(hButton);
        hButton.setText("Botão 07");
        setSize(300,75);
        setVisible(true);
    }
    public static void main(String[] args) {
        Classe cl = new Classe();
        cl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
