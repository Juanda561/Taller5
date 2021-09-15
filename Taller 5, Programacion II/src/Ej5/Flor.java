/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tetor.mplate in the edi
 */
package Ej5;

public class Flor {
    
    private String nombre;
    private String lugarProcedencia;
    private long precioUnitario;

    public Flor(String nombre, String lugarProcedencia, long precioUnitario) {
        this.nombre = nombre;
        this.lugarProcedencia = lugarProcedencia;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public String toString(){
        
        return "Flor: "+nombre+"\nLugar de Procedencia: "+lugarProcedencia+"\nPrecio: $"+precioUnitario;
        
    }
    
   

    
    
}
