
package boletin23_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana1 implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    
    public Ventana1(){
        
        marco = new JFrame("ventana 1");
        panel = new JPanel();
        boton = new JButton("activar");
        
        marco.setSize(500, 300);
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Ventana2 obx2 = new Ventana2();
        marco.setVisible(false);
        
    }
    
}
