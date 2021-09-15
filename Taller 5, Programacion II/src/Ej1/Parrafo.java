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

public class Parrafo {
    
    private String texto;
    
    public Parrafo(String texto){
        
        this.texto=texto;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void nVocales(){
        
        String vocales="aeiou";
        int contador=0;
        String TextoMin=this.texto.toLowerCase();
 
        // recorremos el parrafo recibido, letra a letra
        for(int i=0;i<TextoMin.length();i++){
            // recorremos las vocales para comparar con cada una de las letras que se encuentras en la variable vocales
            for(int j=0;j<vocales.length();j++){
                
                if(TextoMin.charAt(i)==vocales.charAt(j)){
                    // contamos las vocales encontrada
                    contador=contador+1; 
                }
            }
        }
        
        System.out.println("Hay "+contador+" vocales en el parrafo");        
        
    }
    
    public void nConsonantes(){
        
        String consonantes="bcdfghjklmnñpqrstvwxyz";
        int contador=0;
        String textomin = this.texto.toLowerCase();
        
        // recorremos el parrafo recibido, letra a letra
        for(int i=0;i<textomin.length();i++){
            // recorremos las consonantes para comparar con cada una de las letras que se encuentras en la variable consonantes
            for(int j=0;j<consonantes.length();j++){
                
                if(textomin.charAt(i)==consonantes.charAt(j)){
                    // contamos las consonantes encontrada
                    contador=contador+1; 
                }
            }
        }
        
        System.out.println("Hay "+contador+" consonantes en el parrafo");  
        
    }
    
           
    public void buscar(String palabraABuscar){
        
        palabraABuscar.toLowerCase();
        String nombre="";
        int contador=0;        
        
        //recorremos todos los caracteres del parrafo
        for (int i = 0; i <this.texto.length(); i++) {
            
            //coge el caracter de cada posicion y lo asigna a caracter
            char caracter=this.texto.charAt(i);
            
            //si el caracter es vacio, entonces el nombre queda vacio
            if (caracter==' '){
                nombre="";
                continue;
            }
            
            //para armar un nombre, cada caracter que vaya cogiendo se va sumando para armar el nombre, valga la redundancia
            nombre=nombre+caracter;
            
            /*si la cantidad de lo que contiene la palabra a buscar es igual a lo que 
            contiene nombre, y el lo que contiene nombre es igual a lo que contiene
            la palabra a buscar, entonces cuenta que hay una palabra repetida
            */
            if (palabraABuscar.length()==nombre.length() && nombre.equalsIgnoreCase(palabraABuscar)) {
                contador=contador+1;
            }
             
        }  
        
        System.out.println("La palabra "+palabraABuscar+" se repite "+contador+" veces en el parrafo");
         
    }
    
    public void vocalModal(){
        
        String vocales="aeiou";
        int contador[]={0,0,0,0,0};
        String textoMin=this.texto.toLowerCase();
 
        // recorremos el parrafo recibido, letra a letra
        for(int i=0;i<textoMin.length();i++){
            // recorremos las vocales para comparar con cada una de las letras que se encuentras en la variable vocales
            for(int j=0;j<vocales.length();j++){
                
                if(textoMin.charAt(i)==vocales.charAt(j)){
                    // contamos las vocales encontrada
                    contador[j]++; 
                }
            }
        }
        
        if (contador[0]>contador[1] && contador[0]>contador[2] && contador[0]>contador[3] && contador[0]>contador[4]) {
            System.out.println("La vocal que mas se repite en el Parrafo es la (a) con "+contador[0]);
        }else{}
            if (contador[1]>contador[0] && contador[1]>contador[2] && contador[1]>contador[3] && contador[1]>contador[4]) {
                System.out.println("La vocal que mas se repite en el Parrafo es la (e) con "+contador[1]);
            }else{}
                if (contador[2]>contador[0] && contador[2]>contador[1] && contador[2]>contador[3] && contador[0]>contador[4]) {
                    System.out.println("La vocal que mas se repite en el Parrafo es la (i) con "+contador[2]);
                }else{}
                    if (contador[3]>contador[0] && contador[3]>contador[1] && contador[0]>contador[2] && contador[0]>contador[4]) {
                        System.out.println("La vocal que mas se repite en el Parrafo es la (o) con "+contador[3]);
                    }else{}
                        if (contador[4]>contador[0] && contador[4]>contador[1] && contador[4]>contador[2] && contador[4]>contador[3]) {
                            System.out.println("La vocal que mas se repite en el Parrafo es la (u) con "+contador[4]);
                        }else{}
        
    }
    
    public void nPalabras(){
        
        int contador=1;/*Lo inicializo en 1, ya que antes de encontrar el primer " " espacio
                          en blanco, ya hay una palabra.   
                        */
        
        //recorremos todos los caracteres del parrafo
        for (int i = 0; i <this.texto.length(); i++) {
            
            //coge el caracter de cada posicion del parrafo y lo asigna a caracter
            char caracter=this.texto.charAt(i);
            
            //si el caracter está vacio, el contador suma +1, osea 1 palabra encontrada
            if (caracter==' '){
                contador++;
            }
          
        }  
        
        System.out.println("Hay "+contador+" palabras en el parrafo");
        
    }
    
    public void palabraMayor(){
        
        int cantidad=0;
        String nombreaux;
        String nombre="";
        String mayor="";        
        //recorremos todos los caracteres del parrafo
        for (int i = 0; i <this.texto.length(); i++) {
            
            //coge el caracter de cada posicion y lo asigna a caracter
            char caracter=this.texto.charAt(i);
            
            //si el caracter es vacio, entonces el nombre queda vacio
            if (caracter==' '){
                
                nombreaux=nombre;
                
                if (nombreaux.length()>mayor.length()) {
                    mayor=nombreaux;
                }
                   
                nombre="";
            }      
           
            nombre=nombre+caracter;
            
        }  
        cantidad=mayor.length()-1;
        System.out.println("La palabra mas larga es: "+mayor+", con un tamaño de: "+cantidad);
      
    }
}
