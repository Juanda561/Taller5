/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

/**
 *
 * @author Asus
 */
public class main {
 
    public static void main(String[] args) {
        
        Libro l1= new Libro("La Bella y la bestia", "Juan ayala", "La cantida Editorial");
        
        Capitulo c1=new Capitulo("Prologo", 4, 1);
        Capitulo c2=new Capitulo("Lolita", 5, 9);
        Capitulo c3=new Capitulo("La sequia", 4, 13);
        Capitulo c4=new Capitulo("La calle", 3, 16);
        Capitulo c5=new Capitulo("¿donde estamos?", 6, 22);
        Capitulo c6=new Capitulo("El robo", 4, 26);
        Capitulo c7=new Capitulo("Muertos todos", 4, 30);
        Capitulo c8=new Capitulo("Compañeros", 3, 33);
        Capitulo c9=new Capitulo("La decepción", 5, 38);
        Capitulo c10=new Capitulo("El fin de todo", 7, 45);
        
        l1.capitulos.add(c1);
        l1.capitulos.add(c2);
        l1.capitulos.add(c3);
        l1.capitulos.add(c4);
        l1.capitulos.add(c5);
        l1.capitulos.add(c6);
        l1.capitulos.add(c7);
        l1.capitulos.add(c8);
        l1.capitulos.add(c9);
        l1.capitulos.add(c10);
        
    }
    
}
