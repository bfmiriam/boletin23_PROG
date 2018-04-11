
package boletin23_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evento implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    
    public Evento(){
        
        marco = new JFrame("ventana");
        panel = new JPanel();
        boton = new JButton("premer");
        etiqueta = new JLabel("premiches o boton");
        
        marco.setSize(400, 200);
        panel.add(boton);
        panel.add(etiqueta);
        etiqueta.setVisible(false);
        marco.add(panel);
        boton.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      etiqueta.setVisible(true);
        
    }
    
    
}
