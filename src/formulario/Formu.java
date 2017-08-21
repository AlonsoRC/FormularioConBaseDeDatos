/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Formu extends JFrame implements ActionListener{
    private JLabel Titulazo, Nombre, ApeP, ApeM, Grupo, Escuela;
    private JTextField num, gru, esc, apep, apem; 
    private JButton obtener;          

    public Formu() {
        super();                    
        Ventana();        
        inicializarComponentes();        
    }
      private void Ventana() {
        this.setTitle("Formulario");                   
        this.setSize(300, 400);                         
        this.setLayout(null);                                   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    public void inicializarComponentes(){
        Titulazo = new JLabel();
        Nombre = new JLabel();
        Grupo = new JLabel();
        Escuela = new JLabel();
        ApeP = new JLabel();
        ApeM = new JLabel();
        
        num = new JTextField();
        gru = new JTextField();
        esc = new JTextField();
        apep = new JTextField();
        apem = new JTextField();
        
        obtener = new JButton();
        
        Titulazo.setText("FORMULARIO");
        Titulazo.setBounds(50, 30, 200, 20);
        Titulazo.setFont(new Font("Arial", Font.BOLD, 26));
        add(Titulazo);
        
        Nombre.setText("Nombre:");
        Nombre.setBounds(20, 80, 100, 20);
        Nombre.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Nombre);
        
        num.setBounds(100,80,150,20);
        add(num);
        
        ApeP.setText("ApeP:");
        ApeP.setBounds(20, 120, 100, 20);
        ApeP.setFont(new Font("Arial",Font.PLAIN, 20));
        add(ApeP);
        
        apep.setBounds(100,120,150,20);
        add(apep);
        
        ApeM.setText("ApeM:");
        ApeM.setBounds(20, 160, 100, 20);
        ApeM.setFont(new Font("Arial",Font.PLAIN, 20));
        add(ApeM);
        
        apem.setBounds(100,160,150,20);
        add(apem);        

        Grupo.setText("Grupo:");
        Grupo.setBounds(20, 200, 100, 20);
        Grupo.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Grupo);
        
        gru.setBounds(100,200,150,20);
        add(gru);
        
        Escuela.setText("Escuela:");
        Escuela.setBounds(20, 240, 100, 20);
        Escuela.setFont(new Font("Arial",Font.PLAIN, 20));
        add(Escuela);
        
        esc.setBounds(100,240,150,20);
        add(esc);
        
        obtener.setText("Guardar");
        obtener.setBounds(40, 290,200,30);
        obtener.setFont(new Font("Arial",Font.PLAIN, 20));
        obtener.addActionListener(this);
        add(obtener);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==obtener){
            Base b=new Base();
            try {
                b.Ward(num.getText(), apep.getText(), apem.getText(), gru.getText(), esc.getText());
                JOptionPane.showMessageDialog(this,"Datos Guardados","Datos Ward",JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Formu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
