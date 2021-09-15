package Ej4;

class Jugador {
    
    private String nombre;
    private int edad;
    private String posicion;
    
    public Equipo equipos;

    public Jugador(String nombre, int edad, String posicion, Equipo equipos) {
        this.nombre =nombre ;
        this.edad = edad;
        this.posicion = posicion;
        this.equipos=equipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public Equipo getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo equipos) {
        this.equipos = equipos;
    }
    
    /*public void Jugador(){
        System.out.println("Equipo: "+this.getEquipos().getNombre());
    }*/
    
}
