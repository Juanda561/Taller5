/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class ArregloFloral {
    
  
    private String nombre;
    private long costoElaboracion;
    private int numeroFlores;
    
    private ArrayList<Flor> Flores=new ArrayList<>();

    public ArregloFloral(String nombre, long costoElaboracion, int numeroFlores) {
        this.nombre = nombre;
        this.costoElaboracion = costoElaboracion;
        this.numeroFlores = numeroFlores;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCostoElaboracion() {
        return costoElaboracion;
    }

    public void setCostoElaboracion(long costoElaboracion) {
        this.costoElaboracion = costoElaboracion;
    }

    public int getNumeroFlores() {
        return numeroFlores;
    }

    public void setNumeroFlores(int numeroFlores) {
        this.numeroFlores = numeroFlores;
    }

    public ArrayList<Flor> getFlores() {
        return Flores;
    }

    public void setFlores(ArrayList<Flor> Flores) {
        this.Flores = Flores;
    }
    
    public void ArregloSwitch(int a){
        
        JTextArea salida=new JTextArea();
        salida.setText("Estas son las flores que tenemos disponibles:\n");

        if (a==1) {
            this.setNombre("Ramo de mano");
        }else{}
            if (a==2) {
                this.setNombre("Circulo de rosas");
            }else{}
                if (a==3) {
                    this.setNombre("Centro de plantas");
        }
        
        Flor f[]={new Flor("Margarita" ,"Malamboa" ,5000), new Flor("Rosas rojas" ,"Barranquilla" ,4000), new Flor("Clavéles","Valledupar",3000)};
        
        
        for (int i = 0; i <f.length; i++) {
            salida.append("\n"+f[i]);
            salida.append("\n");
        }
        JOptionPane.showMessageDialog(null,salida);
        
        CantidadFlores();
    }
    
    public void CantidadFlores(){
        int nf= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas flores llevará su arreglo de flores?"));
        
        this.setNumeroFlores(nf);
        PedirFlores(nf);
    }
    
    public void PedirFlores(int nf){
        
        Flor f[]={new Flor("Margarita" ,"Malamboa" ,5000), new Flor("Rosas rojas" ,"Barranquilla" ,4000), new Flor("Clavéles","Valledupar",3000)};
        
        long pf;
        
        int fm=0;
        int rr=0;
        int cl=0;
                
                fm=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas margaritas desea agregar?"));
        
                if (fm==this.getNumeroFlores()) {
                      JOptionPane.showMessageDialog(null,"Su arreglo será solamente de margaritas");
                      pf=f[0].getPrecioUnitario()*this.getNumeroFlores();
                      this.setCostoElaboracion(pf);
                      JOptionPane.showMessageDialog(null,"pagas: "+this.getCostoElaboracion());
                      System.exit(0);
                }else{}
                    if (fm>this.getNumeroFlores()) {
                        JOptionPane.showMessageDialog(null,"Solo puedes agregar hasta "+nf+" flores");
                        PedirFlores(nf);
                    }
                  
                rr= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas Rosas Rojas desea agregar?"));
            
                if (fm>0 && rr==this.getNumeroFlores()) {
                      int fmrr=fm-nf;  
                      
                      if (fmrr<0) {
                        fmrr=(fmrr/-2)*2;
                        JOptionPane.showMessageDialog(null,"Solo puedes agregar hasta "+fmrr+" flores"); 
                        PedirFlores(nf);
                      }
                      
                }else{}
                    if (true) {
                
            }
                
        
        
    }
    
    public void ArregloTotal(){
        for (Flor Flore : Flores) {
            System.out.println(""+Flore.getNombre()+"");
        }
    }

    
    
    
}
