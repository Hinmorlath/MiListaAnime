/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

/**
 *
 * @author Gateway
 */
public class Nodo<T> {
    private T Anime;
    private Nodo OtroAnime;
    
    public Nodo(T a){
        this.Anime = a;
        this.OtroAnime = null;
    }

    public T getAnime() {
        return Anime;
    }

    public void setAnime(T Anime) {
        this.Anime = Anime;
    }

    public Nodo getOtroAnime() {
        return OtroAnime;
    }

    public void setOtroAnime(Nodo OtroAnime) {
        this.OtroAnime = OtroAnime;
    }
    
    
}
