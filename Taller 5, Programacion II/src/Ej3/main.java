/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author Asus
 */
public class main {
    
    public static void main(String[] args) {
        Punto p=new Punto(2, 4);
        Imprimir(p);
        
        Punto p1=new Punto(3, 4);
        Imprimir(p1);
        
    }

    public static void Imprimir(Punto a){
    
        System.out.println("Su cordenada en X es: "+a.getCoordenadaX()+", y su cordenada en Y es: "+a.getCoordenadaY());
        System.out.println("Su distancia al origen es: "+a.distancia());
        
      Punto[] arrayPuntos = new Punto[5];
      arrayPuntos[0] = new Punto(1, 1);
      arrayPuntos[1] = new Punto(5, 3);
      arrayPuntos[2] = new Punto(10, 10);
      arrayPuntos[3] = new Punto(-3, 2);
      arrayPuntos[4] = new Punto(-4, -5);
      
      for (int i = 0; i < arrayPuntos.length; i++) {
        System.out.println("Su distancia al punto " + arrayPuntos[i].toString()+ " es " + a.distanciaEntreDosPuntos(arrayPuntos[i]));
      }
      
        System.out.println("");
        
    }
    
}

