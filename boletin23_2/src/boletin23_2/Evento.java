
package boletin23_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evento implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    
    public Evento(){
        
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("programacion");
        boton2 = new JButton("bases");
        
        marco.setSize(400, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object boton = e.getSource();
        if(boton == boton1)
            marco.setTitle("programacion");
        else
             marco.setTitle("bases de datos");
       
           
        
    }
    
}
