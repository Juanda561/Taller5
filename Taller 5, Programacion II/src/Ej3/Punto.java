/*
3. Desarrollar una clase Punto cuyos datos miembro sean las coordenadas de un punto del plano. 
Estos datos han de ser 
privados. Para esta clase se piden los siguientes constructores y métodos: 
 El constructor Punto que recibe como argumentos dos números reales, a y b y construye un nuevo objeto de la 
clase Punto cuyas coordenadas son a y b.
 Los métodos de acceso coordenadaX y coordenadaY, sin argumentos, que devuelven las coordenadas de un 
objeto Punto.
 Los métodos modificadores coordenadaX y coordenadaY, que reciben un argumento y modifican el valor de la 
correspondiente coordenada de un objeto Punto.
 El método igual, que comprueba si un objeto de la clase Punto es igual a otro dado que se pasa como argumento.
 El método distancia, sin argumentos, que calcula la distancia de un objeto de la clase Punto al origen de 
coordenadas.
 El método sobrecargado con un punto, encontrara la distancia entre los dos puntos.
 */
package Ej3;


public class Punto {
    
    private int a;
    private int b;

    public Punto(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getCoordenadaX() {
        return a;
    }

    public void setCoordenadaX(int a) {
        this.a = a;
    }

    public int getCoordenadaY() {
        return b;
    }

    public void setCoordenadaY(int b) {
        this.b = b;
    }
    
    public int distancia(){
        return (int) Math.sqrt(a*a+b*b);
    }
    
    public int distanciaEntreDosPuntos(Punto otropunto){
        int x1=a-otropunto.getCoordenadaX();
        int y1=b-otropunto.getCoordenadaY();
        return (int) Math.sqrt(x1*x1+y1*y1);
    }
   
    public String toString() {
    // el signo + para cadenas no significa "suma matematica" sino concatenacion
    return "(" + a + ", " + b + ")";
  }
    
    
}
