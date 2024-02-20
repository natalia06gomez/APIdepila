/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author SG702-12
 */
public class PilaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<String> miPila = new Pila<>(4);
        System.out.println("La pila esta llena " + miPila.isEmpty());
        miPila.add("Juan");
        miPila.add("Pedro");
        System.out.println("El bolso esta vacio? " + miPila.isEmpty());
        System.out.println("El tamano del bolso " + miPila.size());
    }
    
}
