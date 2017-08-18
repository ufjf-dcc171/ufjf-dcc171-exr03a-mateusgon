package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Janela extends JFrame {

    private final JLabel etiqueta;
    private final JLabel etiqueta2;
    private final JLabel etiqueta3;
   // private final JLabel etiqueta4;
    private final JTextField texto;
    private final JTextField texto2;
    private final JTextField texto3;
    private final JButton exibe = new JButton("Valor final");
    private int n1;
    private int n2;
    private int n3;
    
    public Janela() throws HeadlessException {
            super ("Equação do Segundo Grau");
            setLayout (new FlowLayout());
            etiqueta = new JLabel("Coeficiente a:");
            texto = new JTextField(10);
            etiqueta2 = new JLabel ("Coeficiente b:");
            texto2 = new JTextField(10);
            etiqueta3 = new JLabel ("Coeficiente c:");
            texto3 = new JTextField(10);
            
            add(etiqueta);
            add(texto);
            add(etiqueta2);
            add(texto2);
            add(etiqueta3);
            add(texto3);
            add(exibe);
    }
    
    
}
