/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_Diego_Herrera_Prado;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Diego
 */
public class Convertir implements ActionListener{
    /**
     * Variables globales para iniciar los componentes
     */
    private JFrame _ventanita;
    private JButton _convertir,num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,borrar;
    private JTextField _text;
    private Container _contenedor;
    Componentes crear  = new Componentes();
    /**
     * Método constructor
     */
    public Convertir(){
       _ventanita = crear.creadorFRM("Peso-Dólar",100, 100, 350, 400,false);
       _contenedor = _ventanita.getContentPane();
       componentes();
    }
    /**
     * Método para mostrar la pantalla
     */
    public void mostrar(){
     _ventanita.setVisible(true);
    }
    /**
     * Método para crear los componentes de la ventana
     */
    public void componentes(){
        _text = crear.creadorTXT("",10, 11, 324, 59);
	_contenedor.add(_text);
        num7 = crear.creadorBTN("7", 40, 240, 50, 40);
        num8 = crear.creadorBTN("8", 110, 240, 50, 40);
        num9 = crear.creadorBTN("9", 180, 240, 50, 40);
        num4 = crear.creadorBTN("4", 40, 170, 50, 40);
        num5 = crear.creadorBTN("5", 110, 170, 50, 40);
        num6 = crear.creadorBTN("6", 180, 170, 50, 40);
        num1 = crear.creadorBTN("1", 40, 100, 50, 40);
        num2 = crear.creadorBTN("2", 110, 100, 50, 40);
        num3 = crear.creadorBTN("3", 180, 100, 50, 40);
        num0 = crear.creadorBTN("0", 40, 310, 50, 40);
        _convertir = crear.creadorBTN("Convertir", 110, 310, 100, 40);
        borrar = crear.creadorBTN("CE",230,310,50, 40);
        
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        _convertir.addActionListener(this);
        borrar.addActionListener(this);
        
        /**
         * Añadimos los elementos al contenedor
         */
        _contenedor.add(num0);
        _contenedor.add(num1);
        _contenedor.add(num2);
        _contenedor.add(num3);
        _contenedor.add(num4);
        _contenedor.add(num5);
        _contenedor.add(num6);
        _contenedor.add(num7);
        _contenedor.add(num8);
        _contenedor.add(num9);
        _contenedor.add(_convertir);
        _contenedor.add(borrar);
        
        
        
        
    }
    
		

    @Override
    public void actionPerformed(ActionEvent ae) {
        /**
         * Se asigna al TextField el valor del botón presonado
         */
        if(ae.getSource()==num0){
           _text.setText(_text.getText().concat("0"));
        }
        else{
            if(ae.getSource()==num1){
                _text.setText(_text.getText().concat("1"));
            }
            else{
                if(ae.getSource()==num2){
                    _text.setText(_text.getText().concat("2"));
                }
                else{
                    if(ae.getSource()==num3){
                        _text.setText(_text.getText().concat("3"));
                    }
                    else{
                        if(ae.getSource()==num4){
                            _text.setText(_text.getText().concat("4"));
                        }
                        else{
                            if(ae.getSource()==num5){
                                _text.setText(_text.getText().concat("5"));
                            }
                            else{
                                if(ae.getSource()==num6){
                                    _text.setText(_text.getText().concat("6"));
                                }
                                else{
                                    if(ae.getSource()==num7){
                                        _text.setText(_text.getText().concat("7"));
                                    }
                                    else{
                                        if(ae.getSource()==num8){
                                            _text.setText(_text.getText().concat("8"));
                                        }
                                        else{
                                            if(ae.getSource()==num9){
                                                _text.setText(_text.getText().concat("9"));
                                            }
                                            else{
                                                if(ae.getSource()==_convertir){
                                                    /**
                                                     * Conversión a dólares
                                                     */
                                                    try{
                                                        Componentes conv = new Componentes();
                                                        _text.setText(conv.conversión(_text.getText()));
                                                    }
                                                    catch(Exception e){
                                                        JOptionPane.showMessageDialog(_ventanita,"Introduce algo válido");
                                                    }
                                                    
                                                }
                                                else{
                                                    /**
                                                     * Eliminar contenido del TextFIeld
                                                     */
                                                    if(ae.getSource()==borrar){
                                                        _text.setText(" ");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
