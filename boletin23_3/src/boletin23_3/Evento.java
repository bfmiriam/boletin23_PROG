
package boletin23_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evento implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    JLabel etiqueta1,etiqueta2;
    
    public Evento(){
        
        marco = new JFrame("ventana");
        panel = new JPanel();
        boton1 = new JButton("saudo");
        boton2 = new JButton("despedida");
        etiqueta1 = new JLabel("un saudo a DAM");
        etiqueta2 = new JLabel("fin do probrama");
        
        marco.setSize(500, 300);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        etiqueta1.setVisible(false);
        etiqueta2.setVisible(false);
        marco.add(panel);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object boton = e.getSource();
        if(boton == boton1){
            etiqueta1.setVisible(true);
            etiqueta2.setVisible(false);
        }  else{
            etiqueta2.setVisible(true);
            etiqueta1.setVisible(false);
        }      
    }    
}
