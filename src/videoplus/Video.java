/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplus;

/**
 *
 * @author PC
 */
public class Video {
    
    private String nombre;
    private int numeroReproducciones;
    
    public Video(String nombre, int numeroReproducciones){
        this.nombre = nombre;
        this.numeroReproducciones = numeroReproducciones;
    }
    
    public Video(String nombre){
        this(nombre, 0);
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombres = " + nombre + "," + "Número de reproducciones" + numeroReproducciones);
    }
    
    public boolean equals(Object obj){
        
        Video other = (Video)obj;
        
        if(this.nombre.equals(other.nombre) && this.numeroReproducciones == other.numeroReproducciones){
            return true;
            
        }return false;
    }

    
    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroReproducciones() {
        return this.numeroReproducciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroReproducciones(int numeroReproducciones) {
        this.numeroReproducciones = numeroReproducciones;
    }
}
