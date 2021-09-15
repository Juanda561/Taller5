/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.ArrayList;

    

public class Libro {
    
    private String titulo;
    private String autor;
    private String editorial;
    private String indice[]=new String[10];

    ArrayList<Capitulo> capitulos=new ArrayList<>();

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    public String[] getIndice() {
        return indice;
    }

    public void setIndice(String[] indice) {
        this.indice = indice;
    }
    
    
}
