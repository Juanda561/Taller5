/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

public class main {
    
    public static void main(String[] args) {
        
        Equipo e1= new Equipo("San lorenzo", "Valledupar", "Julio", 1434);
        Jugador j1[]={new Jugador("Pablo Daza", 23, "Delantero", e1), new Jugador("Ramiro Miranda", 24, "Arquero", e1), new Jugador("Manuel Molina", 23, "Delantero", e1),
                      new Jugador("Camilo Andres", 30, "MedioCampista", e1),new Jugador("José Cuesta", 20, "Defensa", e1),new Jugador("Rodrigo Miranda", 22, "Defensa", e1)  };
        e1.agregarJugador(j1[0]);
        e1.agregarJugador(j1[1]);
        e1.agregarJugador(j1[2]);
        e1.agregarJugador(j1[3]);
        e1.agregarJugador(j1[4]);
        e1.agregarJugador(j1[5]);
        
        Imprimir(e1);
        e1.ListaJugadores();
        System.out.println("");
        
        
        Equipo e2= new Equipo("Petaré", "Caracas", "Merlano", 2244);
        Jugador j2[]={new Jugador("Pepito Daza", 23, "Delantero", e2), new Jugador("Serpa", 24, "Arquero", e2), new Jugador("Manolo", 23, "Delantero", e2),
                      new Jugador("Danilo Andres", 30, "MedioCampista", e2),new Jugador("Juan", 20, "Defensa", e2),new Jugador("Lariza", 22, "Defensa", e2)  };
        e2.agregarJugador(j2[0]);
        e2.agregarJugador(j2[1]);
        e2.agregarJugador(j2[2]);
        e2.agregarJugador(j2[3]);
        e2.agregarJugador(j2[4]);
        e2.agregarJugador(j2[5]);
        
        Imprimir(e2);
        e2.ListaJugadores();
        System.out.println("");

        
        
        Equipo e3= new Equipo("Billonarios", "Pasto", "Maluma", 1422);
        
        Equipo e4= new Equipo("Atletico Ñero", "Cartagena", "Juan José", 1578);
        
        Equipo e5= new Equipo("Junior", "Bogotá", "Armando", 1649);
                
    }
    
    public static void Imprimir(Equipo a){
        System.out.println("EQUIPO: "+a.getNombre());
        System.out.println("CIUDAD: "+a.getCiudad());
        System.out.println("TÉCNICO: "+a.getNombre_tecnico());
        System.out.println("N° INSCRIPCIÓN: "+a.getNumero_inscripcion());
        System.out.println("----------------------");
        System.out.println("Nómina del equipo "+a.getNombre());
        
        
    }
    
}
