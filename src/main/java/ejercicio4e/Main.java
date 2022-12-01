/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4e;

/**
 *
 * @author david
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Creamos una cafetera nueva "a"
        Cafetera a = new Cafetera();
        Cafetera b = new Cafetera();
        
        //Creamos una persona nueva "pedro"
        Persona p1 = new Persona(44, "pedro");
        
        //Metodo para llenar la cafetera
        a.llenarCafetera();
        
        //Metodo para servir taza
        p1.hacerCafe(a);
        p1.beberCafe(a, 500);
        
        
        //Probamos cantidades
        a.vaciarCafetera();
        System.out.println("La cafetera deberia estar vacia " + a);
        
        p1.hacerCafe(a);
        System.out.println("La cafetera deberia estar llena " + a);
        
        a.agregarCafe(400);
        System.out.println("La cafetera deberia estar llena(max1000) " + a);
        
        p1.beberCafe(a, 100);
        System.out.println("La cafetera deberia estar en 900 ml " + a);
        
        a.agregarCafe(300);
        System.out.println("La cafetera deberia estar en 1000 ml(max1000) " + a);
    }
    
}
