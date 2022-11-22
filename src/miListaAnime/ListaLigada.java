/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

/**
 *
 * @author Gateway
 */
public class ListaLigada {
    private Nodo head = null;
    private Nodo tail = null;
    private Nodo nodo;
    private int length;
    
    public ListaLigada(int animes){
        Nodo actual = null;
        int contador = 1;
        
        while(contador <= animes){
            nodo = new Nodo(10);
            this.length++;
            tail = nodo;
            
            if(head == null){
                head = nodo;
                actual = nodo;
            }
            else{
                actual.setOtroAnime(nodo);
                actual = nodo;
            }
            
            contador++;
        }
        
    }
    
    void imprimirCatalogo(){
        Nodo actual = head;
        while(actual != null){
            int d = actual.getAnime();
            System.out.println("Anime está en el nodo: " + d);
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
