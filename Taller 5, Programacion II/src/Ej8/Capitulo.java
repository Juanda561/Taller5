/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

public class Capitulo {

    private String nombreCapitulo;
    private int paginasDelCapitulo;
    private int numeroDePaginaDeInicio;

    public Capitulo(String nombreCapitulo, int paginasDelCapitulo, int numeroDePaginaDeInicio) {
        this.nombreCapitulo = nombreCapitulo;
        this.paginasDelCapitulo = paginasDelCapitulo;
        this.numeroDePaginaDeInicio = numeroDePaginaDeInicio;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public int getPaginasDelCapitulo() {
        return paginasDelCapitulo;
    }

    public void setPaginasDelCapitulo(int paginasDelCapitulo) {
        this.paginasDelCapitulo = paginasDelCapitulo;
    }

    public int getNumeroDePaginaDeInicio() {
        return numeroDePaginaDeInicio;
    }

    public void setNumeroDePaginaDeInicio(int numeroDePaginaDeInicio) {
        this.numeroDePaginaDeInicio = numeroDePaginaDeInicio;
    }
    
    
    
}
