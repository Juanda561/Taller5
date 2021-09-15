/*
1. Escribir una clase en Java llamada Párrafo, con atributo de instancia de tipo String denominado texto, método 
constructor por defecto, sobrecargado, getters y setters y los siguientes métodos miembros: 
nVocales() : retorna el número de vocales existentes en el texto
nConsonantes(): retorna el número de consonantes en el texto
nSimbolos(): retorna el número de símbolos existentes en el texto
buscar(): retorna el número de repeticiones existentes en el texto de una palabra recibida como parámetro.
vocalModa(): retorna la vocal que más repeticiones presenta en el texto.
nPalabras(): retorna el número de palabras en el párrafo
palabraMayor(): imprime la palabra más larga del texto y su tamaño.
 */

package Ej1;


public class main {
    
    public static void main(String[] args) {
        
        Parrafo p1 =new Parrafo("La vaca loca la vaca lola, tiene cabeza y tiene cola y tambien esta resguardada en una granga");
        p1.buscar("lola");
        Imprimir(p1);
        
        
        Parrafo p2 =new Parrafo("Dinero Algunos cansados de la vida, la vida es bella, la vida es una bendicion");
        p2.buscar("vida");
        Imprimir(p2);
       
    }
    
    public static void Imprimir(Parrafo a){
         a.nVocales();
         a.nConsonantes();
         a.vocalModal();
         a.nPalabras();
         a.palabraMayor();
         System.out.println("");
    }
    
    
}
