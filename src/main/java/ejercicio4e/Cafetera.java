/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4e;

/**
 *
 * @author david
 */
public class Cafetera {

    //Atributos 
    private double capacidadMaxima;
    private double cantidadActual;
    
    //Metodos
    
    //Constructor Vacio

    public Cafetera() {
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        
        if(cantidadActual > capacidadMaxima){
            this.capacidadMaxima = cantidadActual;
        }
    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
                       
        this.cantidadActual = cantidadActual - cantidadAServir;
        
        if(cantidadActual < cantidadAServir){
            cantidadAServir = cantidadActual;
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(double cantidadAgregar){
        this.cantidadActual = cantidadAgregar + cantidadActual;
        
        if(cantidadActual > capacidadMaxima){
            
        }
    }
}
