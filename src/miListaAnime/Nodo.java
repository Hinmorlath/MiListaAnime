/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miListaAnime;

/**
 *
 * @author Gateway
 */
public class Nodo {
    private int Anime;
    private Nodo OtroAnime;
    
    public Nodo(int a){
        this.Anime = a;
        this.OtroAnime = null;
    }

    public int getAnime() {
        return Anime;
    }

    public void setAnime(int Anime) {
        this.Anime = Anime;
    }

    public Nodo getOtroAnime() {
        return OtroAnime;
    }

    public void setOtroAnime(Nodo OtroAnime) {
        this.OtroAnime = OtroAnime;
    }
    
    
}
