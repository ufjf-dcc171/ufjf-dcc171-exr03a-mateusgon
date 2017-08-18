package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private double n1;
    private double n2;
    private double n3;
    private double valor;
    private double valor2;
    
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
            
            texto.addActionListener(new numero1Enter());
            texto2.addActionListener(new numero2Enter());
            texto3.addActionListener(new numero3Enter());
            
            double delta = (Math.pow(n2, 2) - (4)*a*c);
            double final = (-n2 + Math.sqrt(delta))/2n1;
            double final2 = (-n2 - Math.sqrt(delta))/2n1;
            valor = final;
            valor2 = final2;
            
            exibe.addActionListener(new botaoClicado());
    }

    private class botaoClicado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "O resultado é " + valor " e " + valor2,  "Conta Final", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(texto.getText());
            texto2.requestFocus();
        }
    }

    private class numero2Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Double.parseDouble(texto2.getText());
            texto3.requestFocus();
        }
    }

    private class numero3Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n3 = Double.parseDouble(texto3.getText());
        }
    }
    
    
}
