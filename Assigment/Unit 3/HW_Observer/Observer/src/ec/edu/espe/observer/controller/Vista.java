
package ec.edu.espe.observer.controller;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Vista extends JFrame implements ModeloObserver{

    private Controlador c;
    private JLabel texto;
    
   
    private JButton botonSuma, botonResta;  
    private FlowLayout capa;               
    private JPanel panel;                   
    

    public Vista(Controlador c){
       
        this.c = c;
        
       
        botonSuma = new JButton();
       
        botonSuma.setText("sumar");
       
        botonSuma.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                
                c.sumar();
            }
        });
        
        botonResta = new JButton();
        botonResta.setText("restar");
        botonResta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                c.restar();
            }
        });
        

        texto = new JLabel();
        
        texto.setText(Integer.toString(0));
        
        
        capa = new FlowLayout();
       
        panel = new JPanel();
        
        
        this.setTitle("Ejemplo MVC");
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        this.setSize(300,300);
       
        this.setMinimumSize(new Dimension(100,100));
        this.setMaximumSize(new Dimension(2000,2000));
        
        
        panel.setLayout(capa);
        
        panel.add(texto);
        panel.add(botonSuma);
        panel.add(botonResta);
     
        this.add(panel);
        
        this.setVisible(true);
        
    }
    

    @Override
    public void valorCambiado(int valor) {
        
        texto.setText(Integer.toString(valor));
    }
    
    

}
