/*
4. Se desea un programa que permita el registro de los equipos que participan en
un campeonato de microfútbol. 
Se conoce que el campeonato puede inscribir máximo 5 equipos.

Para cada equipo se debe registrar su nombre, la ciudad de origen, el nombre de 
su técnico y su no de inscripción, así mismo, se permite la inscripción de máximo 6 jugadores 
para cada equipo.

Para cada jugador que se requiera inscribir se debe registrar su nombre, edad y posición de juego.

El aplicativo a desarrollar debe permitir el registro de equipos y jugadores.

También debe permitir la impresión de la 
nómina de jugadores de cualquier equipo inscrito en el campeonato.
 */
package Ej4;

import java.util.ArrayList;

public class Equipo {
   
    private String nombre;
    private String ciudad;
    private String nombre_tecnico;
    private int numero_inscripcion;
    
    private ArrayList<Jugador> jugadores=new ArrayList<>();

    public Equipo(String nombre, String ciudad, String nombre_tecnico, int numero_inscripcion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombre_tecnico = nombre_tecnico;
        this.numero_inscripcion = numero_inscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre_tecnico() {
        return nombre_tecnico;
    }

    public void setNombre_tecnico(String nombre_tecnico) {
        this.nombre_tecnico = nombre_tecnico;
    }

    public int getNumero_inscripcion() {
        return numero_inscripcion;
    }

    public void setNumero_inscripcion(int numero_inscripcion) {
        this.numero_inscripcion = numero_inscripcion;
    }
   
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void agregarJugador(Jugador jugadores){
        this.jugadores.add(jugadores);
    }
    
    public void ListaJugadores(){
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore.getNombre()+" "/*+jugadore.getEquipos().getNombre()*/);
        }
    }
    
    
    
}
