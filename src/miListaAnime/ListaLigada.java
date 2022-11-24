/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

/**
 *
 * @author Gateway
 */
public class ListaLigada<T> {
    private Nodo head = null;
    private Nodo tail = null;
    private Nodo actual;
    private int size;
    
    public ListaLigada(){
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void add(T anime){
        Nodo nuevoNodo = new Nodo(anime);
        this.size++;
        if (head == null) {
            head = nuevoNodo;
            actual = head;
            tail = nuevoNodo;
        }
        else{
            tail.setOtroAnime(nuevoNodo);
            tail = nuevoNodo;
        }
    }
    
    public void imprimirCatalogo(){
        int posicion = 1;
        actual = head;
        while(actual != null){
            T elemento = (T) actual.getAnime();
            System.out.println("El anime está en el nodo: " + elemento);
            actual = actual.getOtroAnime();
        }
    }
    
    private void primerAnime(Nodo n){
        Nodo aux = head;
        head = n;
        n.setOtroAnime(aux);
    }
    
    private void últimoAnime(Nodo n){
        Nodo aux = tail;
        tail = n;
        aux.setOtroAnime(n);
    }
    
    public void insertarAnime(Nodo anime, int posicion){
        int i = 1;
        Nodo actual = head;
        while(i < posicion - 1){
         actual = actual.getOtroAnime();
         i++;
        }
        Nodo aux = actual.getOtroAnime();
        actual.setOtroAnime(anime);
        actual = anime;
        actual.setOtroAnime(aux);
 }
    
}
