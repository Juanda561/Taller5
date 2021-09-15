/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

import javax.swing.JOptionPane;


public class Floristeria {

    public static void main(String[] args) {
        ArregloFloral a1= new ArregloFloral("Ramo de mano", 50000, 7);

        /*Flor []f1=new Flor[a1.getNumeroFlores()];*/
        
        System.out.println("");
        
        int Opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija el ramo de flores\n"
                                                                   +"1) Ramo de mano\n" 
                                                                   +"2) Circulo de rosas\n"
                                                                   +"3) Centro de plantas\n\n"
                                                                   +"4) Salir"));
        
        switch(Opcion){
            case 1:
                    a1.ArregloSwitch(Opcion);
                    break;
            case 2:
                    a1.ArregloSwitch(Opcion);
                    break;
            case 3:
                    a1.ArregloSwitch(Opcion);
                    break;
            case 4:
                    a1.ArregloSwitch(Opcion);
                    System.exit(0);
                    break;
            default:   
                    JOptionPane.showMessageDialog(null, "opcion no valida");                    
        }
       
       
    }

   
    
    
}
