/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Iterator;

/**
 *
 * @author SG702-12
 */
    public class Pila<T> implements Iterable<T> {

    //Constantes
    public static final int MAX = 10;
    //Atributos
    private T[] ts;
    private int actual;

    //Constructor
    public Pila() {
        ts = (T[]) new Object[MAX];
        actual = 0;
    }
    public Pila(int tamano){
        ts = (T[]) new Object[tamano];
        actual = 0;
    }

    public void add(T t) {

        if (actual > ts.length) {
            System.out.println("No es posible adicionarlo porque la bolsa esta llena");
        } else {
            ts[actual] = t;
            actual++;
        }
    }

    public boolean isEmpty() {
        return actual == 0;
    }

    public int size() {
        return actual;
    }

    @Override
    public Iterator<T> iterator() {
      return new ArrayIterator<T> ();  
    }

    private class ArrayIterator<T> implements Iterator<T> {

        //Constatne
        //public static final int MAX = 10;
        private int posicion=0;

        

        @Override
        public boolean hasNext() {
            return actual < ts.length;
        }

        @Override
        public T next() {
            if (posicion < ts.length) {
                T t = (T) ts[posicion];
                posicion++;
                return t;
            } else {
                System.out.println("No existen mas elementos");
                return null;
            }

        }

    }

}

