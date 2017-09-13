package examen1_Diego_Herrera_Prado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
/**
 *
 * @author Diego
 */
public class Componentes implements ActionListener{
    /**
     * Variables para crear los componentes
     */
    public JButton _btn;
    public JLabel _lbl; 
    public JTextField _txt;
    public JFrame _frm;
    public JTextArea _txta;
    private Container cont;
    
    /**
     * Método constructor
     */
    public Componentes(){
        
    }
    /**
     * Método para crear un JFrame
     * @param Tit
     * @param x
     * @param y
     * @param Tamx
     * @param Tamy
     * @param Res
     * @return 
     */
    public JFrame creadorFRM(String Tit, int x, int y, int Tamx, int Tamy, boolean Res){
        _frm= new JFrame(Tit);
        _frm.setBounds(x, y, Tamx, Tamy);
        _frm.setLocationRelativeTo(null);
        _frm.setLayout(null);
        _frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frm.setVisible(false);
        
        if (Res) {
            _frm.setResizable(true);
        }else{
            _frm.setResizable(false);
        }
       
        return this._frm;
    }
    /**
     * Método para crear botones
     * @param Nombre
     * @param x
     * @param y
     * @param Tamx
     * @param Tamy
     * @return 
     */
    public JButton creadorBTN(String Nombre, int x, int y, int Tamx, int Tamy){
        _btn = new JButton(Nombre);
        _btn.setBounds(x, y, Tamx, Tamy);
        _btn.setVisible(true);
        _btn.setLayout(null);

       
        return this._btn;
    }
    /**
     * Método para crear un Label
     * @param Nombre
     * @param x
     * @param y
     * @param Tamx
     * @param Tamy
     * @return 
     */
    public JLabel creadorLBL(String Nombre, int x, int y, int Tamx, int Tamy){
        _lbl = new JLabel(Nombre);
        _lbl.setBounds(x, y, Tamx, Tamy);
        _lbl.setVisible(true);
       
        return this._lbl;
    }
    /**
     * Método para crear un TextField
     * @param Info
     * @param x
     * @param y
     * @param Tamx
     * @param Tamy
     * @return 
     */
    public JTextField creadorTXT(String Info, int x, int y, int Tamx, int Tamy){
        _txt = new JTextField();
        _txt.setBounds(x, y, Tamx, Tamy);
        _txt.setText(Info);
        _txt.setEditable(true);
        _txt.setVisible(true);
       
        return this._txt;
    }
    /**
     * Método para crear un TextArea
     * @param Info
     * @param x
     * @param y
     * @param Tamx
     * @param Tamy
     * @return 
     */
    public JTextArea creadorTXTA(String Info, int x, int y, int Tamx, int Tamy){
        _txta = new JTextArea();
        _txta.setBounds(x, y, Tamx, Tamy);
        _txta.setText(Info);
        _txta.setVisible(true);
       
        return this._txta;
    }
    /**
     * Método para realizar la conversión 
     * @param num
     * @return 
     */
    public String conversión(String num){
            String resul ="";
            float numero;
            numero = Float.parseFloat(num);
            float resultado;
        
        try {
            
            resultado = numero / 19;
            resul = "$US " + Float.toString(resultado);
            
        }
        catch(Exception e){
            resul = "Algo salió mal";
        }
        return resul;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
